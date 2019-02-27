package com.github.gitsby.reactivespringjdbc;

import com.github.gitsby.reactivespringjdbc.in_service.marker_watch.MarketWatchInService;
import com.github.gitsby.reactivespringjdbc.in_service.marker_watch.impl.MarketWatchInServiceImpl;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;
import javax.sql.DataSource;
import lombok.SneakyThrows;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
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
	public OkHttpClient okHttpClient() {
		return new OkHttpClient.Builder()
				.readTimeout(15000, TimeUnit.MILLISECONDS)
				.retryOnConnectionFailure(false)
				.connectionPool(new ConnectionPool(300, 5L, TimeUnit.MINUTES))
				.build();
	}

	@Bean
	public MarketWatchInService marketWatchInService() {
		System.out.println("ServiceBusApplication.marketWatchInService");
		return new MarketWatchInServiceImpl("https://market.aix.kz/api", okHttpClient());
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		GreetingWebClient gwc = new GreetingWebClient();
		System.out.println(gwc.getResult());
	}

}
