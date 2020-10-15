package com.shenrong.test;

import com.shenrong.app.AppConfig;
import com.shenrong.service.impl.CityServiceImpl;
import com.shenrong.service.intf.CityService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CityService bean = (CityService) configApplicationContext.getBean("cityServiceImpl");
		bean.getCity();
	}

}
