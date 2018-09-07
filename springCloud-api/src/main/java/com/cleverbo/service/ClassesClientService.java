package com.cleverbo.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cleverbo.entity.ClassesEntity;

/**
 * @author V.Bo.Dong
 *
 */
@FeignClient(value = "SPRINGAPPLICATIONNAME-SPRINGCLOUD-PROVIDER" ,fallbackFactory = ClassesClientServiceFactory.class )
@RequestMapping(value = "/classes")
public interface ClassesClientService {

	 @PostMapping(value ="/add")
	 boolean add(ClassesEntity entity);
	 
	 @GetMapping(value= "/get/{id}")
	 ClassesEntity get(@PathVariable("id") Long id);
	
	 @GetMapping(value= "/list")
	 List<ClassesEntity> list();
}
