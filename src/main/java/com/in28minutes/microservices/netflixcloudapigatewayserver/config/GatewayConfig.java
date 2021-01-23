package com.in28minutes.microservices.netflixcloudapigatewayserver.config;
/*
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.context.annotation.Configuration;

@EnableHystrix
@Configuration
public class GatewayConfig {
	
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(
						p -> p.path("/get")
						.filters(f -> f.addRequestHeader("hello","world")
						)
						.uri("http://localhost:8081")).build();
	}
}
*/