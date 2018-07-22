package com.zhuwenshen.servicecloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zhuwenshen.servicecloud.model.Dept;

@RestController
public class DeptController_Consumer {

	private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";
	
	/**
	 * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
	 * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
	 */
	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping("/consumer/dept/add")
	public ResponseEntity<Boolean> add(Dept dept) {
		return restTemplate.postForEntity(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
	}
	
	@GetMapping("/consumer/dept/get/{id}")
	public ResponseEntity<Dept> get(Long id) {
		return restTemplate.getForEntity(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/consumer/dept/list")
	public ResponseEntity<List> list() {
		return restTemplate.getForEntity(REST_URL_PREFIX+"/dept/list", List.class);
	}
}
