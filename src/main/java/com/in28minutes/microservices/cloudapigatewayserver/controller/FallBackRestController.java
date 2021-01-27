package com.in28minutes.microservices.cloudapigatewayserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackRestController {

	@RequestMapping("/limits-service-fallback")
	public String limitsServiceFallbackMethod() {
		return "limits-service ms is taking loger time to respond ";
	}

	@RequestMapping("/currency-exchange-service-fallback")
	public String currencyExchangeServiceFallbackMethod() {
		return "currency-exchange-service ms is taking loger time to respond ";
	}

	@RequestMapping("/currency-conversion-service-fallback")
	public String currencyConversionServiceFallbackMethod() {
		return "currency-conversion-service ms is taking loger time to respond ";
	}

}
