package com.github.gitsby.reactivespringjdbc.in_service.marker_watch;


import com.github.gitsby.reactivespringjdbc.in_service.model.Response;

/**
 * Integration with Market Watch API
 * Link: https://market.aix.kz/api/
 */
public interface MarketWatchInService {

  /**
   * Integration with market watch  main table.
   * End point : api/table/main-records22.
   * Link can be change.
   * 
   * @return Response from market watch 
   * Body field and Response is string, because it's json from market watch
   */
  Response<String> getMainTable();
  
}
