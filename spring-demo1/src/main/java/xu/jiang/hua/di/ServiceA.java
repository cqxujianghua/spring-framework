package xu.jiang.hua.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * 研究@Resource和@Autowired注解
 */
@Component
public class ServiceA {

	@Resource
	private ServiceB serviceB;


	@Autowired
	private ServiceC serviceC;

	@PostConstruct
	public void init(){

	}
	@PreDestroy
	public void destory(){

	}
}
