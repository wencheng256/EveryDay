package wencheng;

/**
 * Created by wencheng on 16/8/21.
 */
public class InstanceFactory {

    private static InstanceFactory instance;

    private InstanceFactory(){}

    /**
     * 使用静态工厂的好处不一定每次获取都需要构造一个新的实例。
     * 这里只是做演示，没有考虑多线程情况。
     * @return
     */
    public static InstanceFactory getInstance(){
        if(instance == null){
            instance = new InstanceFactory();
        }
        return instance;
    }

}
