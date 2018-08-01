package beans.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.HelloService;

public class TestSpring01 {

	public static void main(String[] args) {
		//初始化容器(IOC容器 Bean容器)
ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring-configs.xml");
//获取bean对象
	HelloService h=ctx.getBean("helloservice",HelloService.class);
	//使用bean对象
	h.sayHello();
	ctx.close();
	
	
	}

}
