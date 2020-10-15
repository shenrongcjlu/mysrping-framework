package com.shenrong.service.impl;

import com.shenrong.service.intf.CityService;
import org.springframework.stereotype.Component;


@Component
public class CityServiceImpl implements CityService {

	public CityServiceImpl() {
		System.out.println("init");
	}

	@Override
	public void getCity() {
		System.out.println(123123);
	}
}
