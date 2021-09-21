package xu.jiang.hua.autowiredmode;


import org.springframework.stereotype.Component;

@Component
public class Service {

	private Service1 service1;

	private Service2 service2;


	public Service1 getService1() {
		return service1;
	}

	public void setService1(Service1 service1) {
		this.service1 = service1;
	}

	@Override
	public String toString() {
		return "Service{" +
				"service1=" + service1 +
				", service2=" + service2 +
				'}';
	}
}
