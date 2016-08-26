import wencheng.TestSpider;
import wencheng.TestSpiderBuilder;

import java.io.IOException;

/**
 * Created by 60501 on 2016/8/26.
 */
public class Test {

    @org.junit.Test
    public void test() throws IOException {
        TestSpiderBuilder builder = new TestSpiderBuilder();
        TestSpider spider = builder.build();
        spider.spider("http://zhidao.baidu.com/link?url=tZkMbZAQUundgKivurUq4XoKVJ7q2uMWAAJKLLEoj_DAK4dwbyHznuQI21bXV_752d1XmvBcqJaZdgRZTsQVfq");
    }

}
