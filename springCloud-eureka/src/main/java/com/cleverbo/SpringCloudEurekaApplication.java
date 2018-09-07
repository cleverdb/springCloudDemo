package com.cleverbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author V.Bo.Dong
 *
 */
@SpringBootApplication
@EnableEurekaServer
//@EnableAutoConfiguration
//@ActiveProfiles(value = "7010")
//@ActiveProfiles(value = "7020")
@ActiveProfiles(value = "7030")
public class SpringCloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaApplication.class, args);
	}
}
