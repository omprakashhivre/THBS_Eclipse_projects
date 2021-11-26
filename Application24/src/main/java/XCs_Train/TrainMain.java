package XCs_Train;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class TrainMain {

	public static void main(String[] args) {
		Resource rs = new ClassPathResource("ApplicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(rs);
		
		TrainTicket tt ;
		
		for(int i=1; i<4 ; i++ ) {
			tt = (TrainTicket) bf.getBean("trainBean"+i);
			tt.display();
			System.out.println();
		}
	}

}
