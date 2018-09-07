package com.cleverbo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleverbo.entity.ClassesEntity;
import com.cleverbo.service.ClassesClientService;

/**
 * @author V.Bo.Dong
 *
 */

@RestController
@RequestMapping(value = "/consumer/classes")
public class ClassesFeignConttoller {
	
	@Autowired
	private ClassesClientService service;
	
	
	@PostMapping(value ="/add")
	public boolean add(@RequestBody ClassesEntity entity) {
		return service.add(entity);
	}
	@GetMapping(value= "/get/{id}")
	public ClassesEntity get(@PathVariable("id") Long id) {
		return service.get(id);
	}
	
	@GetMapping(value= "/list")
	public List<ClassesEntity> list() {
		return service.list();
	}
	
}
