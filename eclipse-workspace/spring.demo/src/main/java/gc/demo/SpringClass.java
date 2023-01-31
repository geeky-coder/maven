package gc.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext obj = new ClassPathXmlApplicationContext("config.xml");
		vehicle bean = obj.getBean("myApp",vehicle.class);
		System.out.println(bean.getMileage());
		FestDisc bean1 = obj.getBean("Disc",FestDisc.class);
		System.out.println(bean1.getDisc());
	}
	

}