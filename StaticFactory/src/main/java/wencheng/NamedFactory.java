package wencheng;

import javax.lang.model.element.Name;

/**
 * Created by wencheng on 16/8/21.
 */
public class NamedFactory {

    public NamedFactory(){

    }

    /**
     * 使用静态工厂代替构造函数的第一个优势是可以拥有名字
     * @return
     */
    public static NamedFactory newInstance(){
        return new NamedFactory();
    }

}
