package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.beans.Test;

public class Clint {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("resource/Spring.xml");		
		BeanFactory factory = new XmlBeanFactory(r);		
		Test t = (Test)factory.getBean("t");
		Test t1 = (Test)factory.getBean("t");
		Test t2 = (Test)factory.getBean("t");
		Test t3 = (Test)factory.getBean("t");
		
		t.display();
		t2.display();
		t3.display();
		t1.display();
		System.out.println(t1==t);
		System.out.println(t1==t2);
		System.out.println(t2==t3);

	}

}
