package com.github.gitsby.reactivespringjdbc.in_service.marker_watch.impl;


import com.github.gitsby.reactivespringjdbc.in_service.marker_watch.MarketWatchInService;
import com.github.gitsby.reactivespringjdbc.in_service.model.Response;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.asynchttpclient.AsyncHttpClient;

/**
 * Implementation for MarkerWatchInService
 */
@RequiredArgsConstructor
public class MarketWatchInServiceImpl implements MarketWatchInService {

  private final String baseUrl;
  private final AsyncHttpClient asyncHttpClient;

  @Override
  @SneakyThrows
  public Response<String> getMainTable() {
    Response<String> response = new Response<>();
    response.url = baseUrl + "/table/main-records22";
    try {
      asyncHttpClient
          .prepareGet(response.url)
          .execute()
          .toCompletableFuture()
          .thenApply(org.asynchttpclient.Response::getResponseBody)
          .thenAccept(s -> response.body = s)
          .join();
      response.isOk = true;
      System.out.println(response);
      return response;
    } catch (Exception e) {

      System.err.println("Error during invoke " + response.url);
      e.printStackTrace();

      response.isOk = false;
      response.body = null;
      return response;
    }
  }

}