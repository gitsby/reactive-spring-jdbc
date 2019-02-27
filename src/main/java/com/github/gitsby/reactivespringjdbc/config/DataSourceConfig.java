package com.github.gitsby.reactivespringjdbc.config;

import io.reactiverse.pgclient.PgClient;
import io.reactiverse.pgclient.PgPool;
import io.reactiverse.pgclient.PgPoolOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {


  @Bean
  public PgPool pgPool() {
    PgPoolOptions options = new PgPoolOptions()
        .setPort(5432)
        .setHost("localhost")
        .setDatabase("mkasyanov_aix_service_bus")
        .setUser("postgres")
        .setPassword("1")
        .setMaxSize(100);

    return PgClient.pool(options);
  }

}
