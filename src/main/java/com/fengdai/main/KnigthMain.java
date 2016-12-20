package com.fengdai.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fengdai.serivce.Knight;

public class KnigthMain {
		public static  void main(String args[]) {
			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config/knights.xml");
			Knight knight=context.getBean(Knight.class);
			knight.embarkOnQuest();
			context.close();
		}
}
