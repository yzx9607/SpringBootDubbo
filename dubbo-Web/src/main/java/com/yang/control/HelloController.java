package com.yang.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yang.service.HelloService;

/**
 * 欢迎程序入口
 * @author yzx96
 *
 */
@RestController
public class HelloController {
		@Reference
		private HelloService helloService;
		/**
		 * 欢迎程序入口
		 * @param name
		 * @return
		 */
		@RequestMapping("/hello")
		public String helloWorld(@RequestParam("name") String name){
			return helloService.sayHello(name);
		}
}
