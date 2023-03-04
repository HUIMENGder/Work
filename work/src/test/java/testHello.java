import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 回梦
 * @Date: 2023/02/26/16:34
 */
public class testHello {
    @Test
    public void testIOC() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        hello h  = context.getBean("One", hello.class );
        h.sayHello();
    }
}
