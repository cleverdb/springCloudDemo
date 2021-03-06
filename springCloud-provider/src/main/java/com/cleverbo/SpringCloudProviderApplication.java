package com.cleverbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author V.Bo.Dong
 *
 */
@SpringBootApplication
@EnableCaching
@EnableEurekaClient
@ActiveProfiles("8010")
public class SpringCloudProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProviderApplication.class, args);
	}
}
