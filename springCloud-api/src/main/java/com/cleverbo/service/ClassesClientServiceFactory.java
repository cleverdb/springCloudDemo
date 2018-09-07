package com.cleverbo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cleverbo.entity.ClassesEntity;

import feign.hystrix.FallbackFactory;

@Component
public class ClassesClientServiceFactory implements FallbackFactory<ClassesClientService> {

	@Override
	public ClassesClientService create(Throwable cause) {
		return new ClassesClientService() {
			
			@Override
			public List<ClassesEntity> list() {
				return null;
			}
			
			@Override
			public ClassesEntity get(Long id) {
				ClassesEntity entity = new ClassesEntity();
				entity.setId(id);
				entity.setClassesName("不存在对应信息");
				return entity;
			}
			
			@Override
			public boolean add(ClassesEntity entity) {
				return false;
			}
		};
	}

}
