package com.zhuwenshen.servicecloud.model;

import java.io.Serializable;

public class Dept implements Serializable{
	
	private static final long serialVersionUID = -3657081021471009766L;
	private Long deptId;
	private String deptName;
	private  String dbSource;
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDbSource() {
		return dbSource;
	}
	public void setDbSource(String dbSource) {
		this.dbSource = dbSource;
	}
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptName=" + deptName + ", dbSource=" + dbSource + "]";
	}
	
	
}
