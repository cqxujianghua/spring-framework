package xu.jiang.hua.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * @Autowired和@Resource可以标在filed以及set方法上
 */

@Component
@Scope("prototype")
public class InstantA {

	@Autowired
	private InstantB instantB;
}
