package wencheng;

import java.io.IOException;

/**
 * 示例爬虫，给一个网页，自动找到所有的a标签 把资源下载到文件夹下
 */
public interface TestSpider {

    void spider(String url) throws IOException;

}
