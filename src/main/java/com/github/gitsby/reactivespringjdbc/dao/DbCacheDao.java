package com.github.gitsby.reactivespringjdbc.dao;


import io.reactiverse.pgclient.PgPool;
import io.reactiverse.pgclient.Tuple;
import java.util.concurrent.atomic.AtomicReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DbCacheDao {

  @Autowired
  private PgPool pgPool;

  public String getLastResult(String hash) {
    AtomicReference<String> json = new AtomicReference<>();
    pgPool.preparedQuery("select value::text from service_last_result where hash = $1", Tuple.of(hash), result -> {
      if (result.succeeded()) {
        json.set(result.result().iterator().next().getString(1));
      }
    });
    return json.get();
  }


}

