package com.cleverbo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleverbo.entity.ClassesEntity;
import com.cleverbo.service.ClassesService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author V.Bo.Dong
 *
 */

@RestController
@RequestMapping(value = "/classes")
public class ClassesController {
	
//	@Autowired
//	private CacheManager cacheManager;
	
	@Autowired
	private ClassesService classesSevice;
	
	@PostMapping(value ="/add")
	public boolean add(@RequestBody ClassesEntity entity) {
		return classesSevice.add(entity);
	}
	@HystrixCommand(fallbackMethod = " failGetForHystrix")
	@GetMapping(value= "/get/{id}")
	public ClassesEntity get(@PathVariable("id") Long id) {
//		Cache cache = cacheManager.getCache("test");
//		cache.get("-247446376:3523116898:com.cleverbo.dao.ClassesDao.queryById:0:2147483647:select id , classes_name, db_source from classes where id = ?:1:SqlSessionFactoryBean", ClassesEntity.class);
		ClassesEntity entity = classesSevice.get(id);
		return entity;
	}
	@GetMapping(value= "/list")
	public List<ClassesEntity> list() {
		List<ClassesEntity> list = classesSevice.list();
		return list;
	}
	
	@SuppressWarnings("unused")
	private ClassesEntity failGetForHystrix(@PathVariable("id")Long id){
		ClassesEntity entity = new ClassesEntity();
		return entity;
	}
}
