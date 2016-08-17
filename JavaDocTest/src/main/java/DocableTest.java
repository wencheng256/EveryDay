/**
 * 这是一个生成Doc的类
 */
public class DocableTest {

    private String name;

    /**
     * 这是一个静态方法
     * @return 返回一个hello
     */
    public static String hello(){
        System.out.println("hello");
        return "hello";
    }

    /**
     * 带参数的方法
     * @param integer  参数哦
     * @return  返回它本身哦
     */
    public Integer getInt(Integer integer){
        return integer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
