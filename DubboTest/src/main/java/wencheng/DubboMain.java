package wencheng;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by wencheng on 16/8/13.
 */
public class DubboMain {

    public static void main(String...args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(1);
        context.start();
        System.in.read();
    }

}
