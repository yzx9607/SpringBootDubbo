package com.yang.service;

/**
 * dubbo服务类
 * @author yzx96
 *
 */
public interface HelloService {
	/**
	 * 欢迎你方法
	 * @param name
	 * @return
	 */
	public String sayHello(String name);
}
