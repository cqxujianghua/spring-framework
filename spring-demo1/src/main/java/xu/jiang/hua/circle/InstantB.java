package xu.jiang.hua.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class InstantB {
	@Autowired
	private InstantA instantA;
}
