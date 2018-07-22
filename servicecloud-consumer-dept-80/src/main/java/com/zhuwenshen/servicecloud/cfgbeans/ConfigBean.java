package com.zhuwenshen.servicecloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean // boot -->spring applicationContext.xml --- @Configuration配置 ConfigBean =
						// applicationContext.xml
{
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}

// @Bean
// public UserServcie getUserServcie()
// {
// return new UserServcieImpl();
// }
// applicationContext.xml == ConfigBean(@Configuration)
// <bean id="userServcie" class="com.atguigu.tmall.UserServiceImpl">