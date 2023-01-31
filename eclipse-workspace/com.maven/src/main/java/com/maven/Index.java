package com.maven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maven.Interface;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext obj = new ClassPathXmlApplicationContext("maven.xml");
		One bean = (One) obj.getBean("myApp");
		System.out.println(bean.output());

	}

}
