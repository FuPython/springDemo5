package controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.Teacher;

/**
 * @auther fubiao
 * @date 2019/10/29/22:14
 */
public class Demo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Teacher.class);
		System.out.println("跑起来了!!!!"+annotationConfigApplicationContext.getBean(Teacher.class));
	}
}
