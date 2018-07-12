package com.cleverbo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * @author V.Bo.Dong
 *
 */
@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		
		return new RestTemplate();
	}
	
	/**
	 * 修改默认策略（轮询）；可实现IRule接口，自定义实现
	 * @return 
	 */
	@Bean
	public IRule defineRule(){
		/**
		 * com.netflix.loadbalancer包
		 */
		return new RandomRule();
	}
}
