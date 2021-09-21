package xu.jiang.hua.dependOn;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@DependsOn("b")
@Component
public class A {


}
