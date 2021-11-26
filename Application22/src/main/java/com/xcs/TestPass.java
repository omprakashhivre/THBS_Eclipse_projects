package com.xcs;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class TestPass {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {		
		
		Resource rs = new ClassPathResource("app.xml");
		BeanFactory bf = new XmlBeanFactory(rs);
		
		Passenger p;
		for(int i=1;i<4;i++) {
		p = (Passenger) bf.getBean("pBean"+i);
		p.display();
		}

	}

}
