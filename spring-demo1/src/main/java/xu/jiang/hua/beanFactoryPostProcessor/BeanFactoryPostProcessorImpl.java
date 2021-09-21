package xu.jiang.hua.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class BeanFactoryPostProcessorImpl implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		GenericBeanDefinition serviceBeanDefinition = (GenericBeanDefinition)beanFactory.getBeanDefinition("service");
		/**
		 *  int AUTOWIRE_NO = 0;
		 *  目前非xml都是使用这种，需要开发者手动注入，比如用@Autowired。
		 *
		 *  int AUTOWIRE_BY_NAME = 1;
		 *  根据名字注入，需要写set方法。比如setXX(YY yy)方法，spring按set方法名字（XX）去容器查找bean并注入。
		 *
		 *  int AUTOWIRE_BY_TYPE = 2;
		 *  根据类型注入，需要写set方法。比如setXX(YY yy)  spring按set方法里面的参数类型YY去容器中查找bean
		 *
		 * int AUTOWIRE_CONSTRUCTOR = 3;
		 * 构造注入
		 */
		serviceBeanDefinition.setAutowireMode(1);


		GenericBeanDefinition instantA = (GenericBeanDefinition)beanFactory.getBeanDefinition("instantA");

		GenericBeanDefinition instantB = (GenericBeanDefinition)beanFactory.getBeanDefinition("instantB");

		instantA.setAutowireMode(1);
		instantB.setAutowireMode(1);

		//自动装配

	}
}
