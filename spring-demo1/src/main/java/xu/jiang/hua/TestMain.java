package xu.jiang.hua;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xu.jiang.hua.config.Config;
import xu.jiang.hua.di.ServiceB;

public class TestMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		ServiceB service =(ServiceB) annotationConfigApplicationContext.getBean("serviceB");
		service.say();

		 annotationConfigApplicationContext.getBean("instantA");
	}
}
