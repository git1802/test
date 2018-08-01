package beans.test;


import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.CgbDataSource;
import beans.HelloService;
import beans.ObjectFactory;
//HelloService对象由谁创建(Spring)
//HelloService对象何时创建(依托于配置)
//HelloServce对象存在那(map集合)
public class TestSpring2 {
	
	private ClassPathXmlApplicationContext ctx;
	
	@Before
	public void init(){
		//初始化容器(IOC容器 Bean容器)

		 ctx=new ClassPathXmlApplicationContext("spring-configs.xml");
		
	}
	@Test
	public void testHelloService(){
		//获取bean对象
		HelloService h=ctx.getBean("helloservice",HelloService.class);
		//使用bean对象
		h.sayHello();
	}
	@Test
	public void testCalendar(){
		Calendar c=ctx.getBean("calendar",Calendar.class);
		System.out.println(c);
	}
	@Test
	public void testDate(){
		Date d=ctx.getBean("date",Date.class);
	System.out.println(d);
	}
	@Test
	public void testOBject(){
		Date obj=ctx.getBean("objFactory",Date.class);
		System.out.println(obj);
	}
	@Test
	public void testCgbDataSource(){
		CgbDataSource cgb=ctx.getBean("dataSource",CgbDataSource.class);
	
	System.out.println(cgb);
	
	}
	
	@After
	public void close(){
		ctx.close();
	}


}
