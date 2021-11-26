package XCs_Pack1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class UserTest {

	public static void main(String[] args) {
		Resource rs = new ClassPathResource("ApplicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(rs);
		
		User usr = (User) bf.getBean("UserBean23");
		usr.display();
		
		

	}

}
