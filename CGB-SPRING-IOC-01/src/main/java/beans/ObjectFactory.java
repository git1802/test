package beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class ObjectFactory implements FactoryBean<Date>{
//
	public Date getObject() throws Exception {
		System.out.println("getOBject");
		return new Date();
	}
//isSingleton 返回true时执行 并只执行一次
	public Class<?> getObjectType() {
	System.out.println("getobjectType");
		return Date.class;
	}
//每次获取bean对象时会调用
	public boolean isSingleton() {
		System.out.println("isSingleton");
		return false;
	}

}
