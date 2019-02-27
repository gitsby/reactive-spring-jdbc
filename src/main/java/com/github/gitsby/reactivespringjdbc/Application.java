package com.github.gitsby.reactivespringjdbc;

import com.github.gitsby.reactivespringjdbc.in_service.marker_watch.MarketWatchInService;
import com.github.gitsby.reactivespringjdbc.in_service.marker_watch.impl.MarketWatchInServiceImpl;
import java.security.MessageDigest;
import javax.sql.DataSource;
import lombok.SneakyThrows;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClientConfig;
import org.asynchttpclient.Dsl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
@MapperScan("com.github.gitsby.reactivespringjdbc.dao")
public class Application {


	@Bean
	@Primary
	public DataSource dataSource() {
		return DataSourceBuilder
				.create()
				.username("postgres")
				.password("1")
				.url("jdbc:postgresql://127.0.0.1:5432/mkasyanov_aix_service_bus")
				.driverClassName("org.postgresql.Driver")
				.build();
	}

	@Bean
	@SneakyThrows
	public MessageDigest messageDigest() {
		return MessageDigest.getInstance("SHA1");
	}

	@Bean
	public MarketWatchInService marketWatchInService() {
		DefaultAsyncHttpClientConfig.Builder clientBuilder = Dsl.config();
		AsyncHttpClient client = Dsl.asyncHttpClient(clientBuilder);

		System.out.println("ServiceBusApplication.marketWatchInService");
		return new MarketWatchInServiceImpl("https://market.aix.kz/api", client);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		GreetingWebClient gwc = new GreetingWebClient();
		System.out.println(gwc.getResult());
	}

}
