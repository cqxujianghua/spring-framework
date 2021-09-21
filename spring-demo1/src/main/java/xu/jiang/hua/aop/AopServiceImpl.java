package xu.jiang.hua.aop;


import org.springframework.stereotype.Component;

@Component
public class AopServiceImpl implements IAopService {

	@Override
	public void say() {
		System.out.println("say");
	}
}
