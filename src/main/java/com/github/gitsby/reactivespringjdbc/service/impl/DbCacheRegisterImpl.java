package com.github.gitsby.reactivespringjdbc.service.impl;

import com.github.gitsby.reactivespringjdbc.dao.DbCacheDao;
import com.github.gitsby.reactivespringjdbc.service.DbCacheRegister;
import io.reactiverse.pgclient.PgPool;
import io.reactiverse.pgclient.Tuple;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DbCacheRegisterImpl implements DbCacheRegister {

  private final PgPool pgPool;
  private final MessageDigest md;
  private final DbCacheDao dao;


  @Override
  public String getLastResult(String hash) {
    return dao.getLastResult(hash);
  }

  @Override
  public void add(String hash, String value) {

    pgPool.preparedQuery("insert into service_last_result(hash, value) "
                             + "values($1, $2::JSON) "
                             + "ON CONFLICT(hash) "
                             + "DO update set value = EXCLUDED.value", Tuple.of(hash, value), event -> {
      if (event.succeeded()) {
        System.out.println("insert succeeded");
      } else {
        System.out.println("insert failed");
      }
    });

  }

  @Override
  @SneakyThrows
  public String getHash(String... params) {
    String string;
    if (params.length == 1) {
      string = params[0];
    } else {
      string = String.join("", params);
    }
    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
    messageDigest.update(string.getBytes(StandardCharsets.UTF_8));
    return new String(messageDigest.digest());
  }

}
