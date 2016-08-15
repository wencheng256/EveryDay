import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.junit.Test;

import java.io.File;

/**
 * Created by wencheng on 16/8/14.
 */
public class EhcacheTest {

    @Test
    public void test1(){
        CacheManager cm = CacheManager.getInstance();
        cm.addCache("cache1");
        Cache c1 = cm.getCache("cache1");
        c1.put(new Element("111", "22222"));
    }

}
