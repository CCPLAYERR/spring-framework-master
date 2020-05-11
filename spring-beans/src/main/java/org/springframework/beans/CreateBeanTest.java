package org.springframework.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CreateBeanTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		Test01 test01 = (Test01)context.getBean("test01");
		System.out.println(test01.getName());
	}
}
