package wencheng;

/**
 * Created by wencheng on 16/8/21.
 */
public class SonFactory {

    private static class HiddenSonFactory extends SonFactory{

    }

    /**
     * 静态工厂的第三个好处在于可以以子类类型的实例返回，而隐藏实际构筑的对象类型。
     * 例如：JDBC的Connection的获取
     * @return
     */
    public static SonFactory getHiddenInstance(){
        return new HiddenSonFactory();
    }

}
