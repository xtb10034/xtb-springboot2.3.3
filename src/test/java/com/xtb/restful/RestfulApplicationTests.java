package com.xtb.restful;

import com.xtb.restful.bean.Person;
import com.xtb.restful.mapper.PersonMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class RestfulApplicationTests {

	@Autowired
	private PersonMapper personMapper;
	@Test
	public void testSelectList(){
//selectList()根据MP内置的条件构造器查询一个list集合，null表示没有条件，即查询所有
//		personMapper.selectList(null).forEach(System.out::println);
//		List<Person> list = personMapper.selectList(null);
//		list.forEach(System.out::println);
	}

	@Test
	public void test1(){
		Person person = new Person(null, "张三", 23, "zhangsan@atguigu.com");
//INSERT INTO user ( id, name, age, email ) VALUES ( ?, ?, ?, ? )
		int result = personMapper.insert(person);
		System.out.println("受影响行数："+result);
//1475754982694199298
		System.out.println("id自动获取："+person.getId());

	}

	@Test
	public void test2(){

		Map<String,Object> map = personMapper.selectMapById(1L);
		System.out.println("Map: " +map);

	}


}
