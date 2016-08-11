import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wencheng on 16/8/11.
 */
public class Test1 {


    @Test
    public void test(){
        Logger logger = LoggerFactory.getLogger(Test1.class);
        logger.info("[logger:test] 记录了一个日志");
    }


}
