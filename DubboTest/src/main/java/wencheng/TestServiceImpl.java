package wencheng;

import org.springframework.stereotype.Service;

/**
 * Created by wencheng on 16/8/13.
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class TestServiceImpl implements TestService {

    public String speak() {
        return "hello Server";
    }

}
