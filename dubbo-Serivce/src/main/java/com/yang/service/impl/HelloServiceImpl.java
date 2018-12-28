package com.yang.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yang.service.HelloService;

/**
 * 欢迎类实现
 * @author yzx96
 *
 */
@Service
public class HelloServiceImpl implements HelloService{
	/**
	 * 欢迎你方法
	 * @param name
	 * @return
	 */
	public String sayHello(String name) {
		return "你好"+name;
	}
}
