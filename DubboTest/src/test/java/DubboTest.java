import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import wencheng.TestService;

/**
 * Created by wencheng on 16/8/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DubboTest {

    @Autowired
    TestService testService;

    @Test
    public void testDubbo(){
        System.out.println(testService.speak());
    }

}