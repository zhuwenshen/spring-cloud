package com.zhuwenshen.servicecloud.service;

import java.util.List;

import com.zhuwenshen.servicecloud.model.Dept;

public interface DeptService {
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
