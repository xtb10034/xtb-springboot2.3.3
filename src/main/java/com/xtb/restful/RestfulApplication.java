package com.xtb.restful;

import com.xtb.restful.Service.Service;
import com.xtb.restful.Service.TestSerializable;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.xtb.restful.mapper")
public class RestfulApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(RestfulApplication.class, args);
//		Service service = context.getBean(Service.class);
//
//		try{
//			service.printLian();
//		}catch(Exception e){
//			System.out.println(e.getMessage());
//		}

		//2、查看容器里面的组件
//		String[] names = context.getBeanDefinitionNames();
//		for (String name : names) {
//			System.out.println(name);
//		}

	}

}
