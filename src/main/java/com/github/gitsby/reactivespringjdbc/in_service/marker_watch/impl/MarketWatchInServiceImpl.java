package com.github.gitsby.reactivespringjdbc.in_service.marker_watch.impl;


import com.github.gitsby.reactivespringjdbc.in_service.marker_watch.MarketWatchInService;
import com.github.gitsby.reactivespringjdbc.in_service.model.Response;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Implementation for MarkerWatchInService
 */
@RequiredArgsConstructor
public class MarketWatchInServiceImpl implements MarketWatchInService {

  private final String baseUrl;
  private final OkHttpClient client;

  @Override
  @SneakyThrows
  public Response<String> getMainTable() {
    Response<String> response = new Response<>();
    response.url = baseUrl + "/table/main-records22";
    try {
      Request request = new Request.Builder()
          .url(response.url)
          .build();

      try (okhttp3.Response resp = client.newCall(request).execute()) {
        response.body = resp.body().string();
        response.isOk = resp.isSuccessful();
        return response;
      }
    } catch (Exception e) {

      System.err.println("Error during invoke " + response.url);
      e.printStackTrace();

      response.isOk = false;
      response.body = null;
      return response;
    }
  }

}