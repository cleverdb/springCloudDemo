package com.cleverbo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cleverbo.entity.ClassesEntity;

/**
 * @author V.Bo.Dong
 *
 */

@RestController
@RequestMapping(value = "/consumer/classes")
public class ClassesController {
	
	//原始restApi方式访问
//	private static final String REST_URL = "http://localhost:8010";
	//eureka+ribbon访问方式 (http://+应用名称(spring.application.name))
	private static final String REST_URL = "http://SPRINGAPPLICATIONNAME-SPRINGCLOUD-PROVIDER";
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping(value ="/add")
	public boolean add(@RequestBody ClassesEntity entity) {
		return restTemplate.postForObject(REST_URL+"/classes/add", entity, boolean.class);
	}
	@GetMapping(value= "/get/{id}")
	public ClassesEntity get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL+"/classes/get/"+id, ClassesEntity.class);
	}
	@SuppressWarnings("unchecked")
	@GetMapping(value= "/list")
	public List<ClassesEntity> list() {
		return restTemplate.getForObject(REST_URL+"/classes/list", List.class);
	}
	
}
