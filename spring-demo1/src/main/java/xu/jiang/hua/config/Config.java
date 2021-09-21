package xu.jiang.hua.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import xu.jiang.hua.im.ImportBean;
import xu.jiang.hua.im.ImportBeanDefinitionRegistrarImpl;
import xu.jiang.hua.im.ImportSelectorImpl;

@Configuration
@Import({ImportBeanDefinitionRegistrarImpl.class, ImportSelectorImpl.class, ImportBean.class})
//@ImportResource(value="classpath:spring-config.xml")
@ComponentScan("xu.jiang.hua")
public class Config {

	//ImportResource导入配置
	//@PropertySource() 实现配置文件映射到实体上
	/**
	 * Import总结，总共三种情况：1、引入普通的类；2、引入实现ImportSelector的类；3、引入ImportBeanDefinitionRegistrar实现的类
	 */



}
