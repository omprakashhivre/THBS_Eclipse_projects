package pack11;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class TestUser {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Resource rs = new ClassPathResource("ApplicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(rs);
		
		User usr = (User) bf.getBean("bbn");
		usr.display();

	}

}
