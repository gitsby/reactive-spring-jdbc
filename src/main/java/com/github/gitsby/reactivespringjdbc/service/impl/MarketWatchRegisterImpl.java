package com.github.gitsby.reactivespringjdbc.service.impl;

import com.github.gitsby.reactivespringjdbc.in_service.marker_watch.MarketWatchInService;
import com.github.gitsby.reactivespringjdbc.in_service.model.Response;
import com.github.gitsby.reactivespringjdbc.service.DbCacheRegister;
import com.github.gitsby.reactivespringjdbc.service.MarketWatchRegister;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarketWatchRegisterImpl implements MarketWatchRegister {

  private final DbCacheRegister dbCacheRegister;
  private final MarketWatchInService inService;


  @Override
  public String getMainTable() {
    long startedAt = System.currentTimeMillis();
    Response<String> response = inService.getMainTable();
    System.out.println("get response from " + response.url + " with status " + (response.isOk ? "ok" : "error") + ". Takes " + (
            System.currentTimeMillis() - startedAt) + " ms");
    String hash = dbCacheRegister.getHash(response.url);
    if (response.isOk) {
      System.out.println("insert body from response to local db");
      dbCacheRegister.add(hash, response.body);
      System.out.println("return body from response to client");
      System.out.println("Method execution time: " + (System.currentTimeMillis() - startedAt) + " ms");
      return response.body;
    }
    System.out.println("return data to client from local db");

    String lastResult = dbCacheRegister.getLastResult(hash);
    System.out.println("Method execution time: " + (System.currentTimeMillis() - startedAt) + " ms");
    return lastResult;
  }

}

//asd	51535	114	115	128	132	151	93	429	0.0	429.0507351349551	1634.9179379849559	143.71523647586875
//asd	41499	117	115	135	145	167	94	368	0.0	345.68672530987607	1412.1167695031363	119.16739651795531