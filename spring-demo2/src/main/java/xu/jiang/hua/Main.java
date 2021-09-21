package xu.jiang.hua;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("springApplication.xml");

		classPathXmlApplicationContext.getBean("bean2");

	}
}
