package wencheng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by wencheng on 16/8/13.
 */
public class DubboMain {

    public static Logger logger = LoggerFactory.getLogger(DubboMain.class);

    public static void main(String...args) throws IOException {
        logger.info("hello world");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(1);
        context.start();
        System.in.read();
    }

}
