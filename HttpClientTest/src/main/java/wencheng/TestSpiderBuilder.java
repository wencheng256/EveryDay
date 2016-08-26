package wencheng;


import com.sun.deploy.util.StringUtils;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

/**
 * Created by 60501 on 2016/8/26.
 */
public class TestSpiderBuilder {

    /**
     * 爬虫内部类
     */
    private class InternalTestSpider implements TestSpider{

        private HttpClient client;

        public InternalTestSpider(){
            client = HttpClients.createDefault();
        }

        @Override
        public void spider(String url) throws IOException {
            HttpGet get = new HttpGet(url);
            HttpResponse response = client.execute(get);
            URL urle = new URL(url);
            String host = urle.getHost();
            String content = EntityUtils.toString(response.getEntity());
            Document doc = Jsoup.parse(content);
            Elements as = doc.body().getElementsByTag("a");
            for(Element a: as){
                String href = a.attr("href");
                if(!href.startsWith("http")){
                    href = "http://"+host+"/"+href;
                }
                save(href);
            }
        }

        private void save(String url) throws IOException {
            HttpGet get = new HttpGet(url);
            System.out.println(url);
            HttpResponse response = client.execute(get);
            String content = EntityUtils.toString(response.getEntity());
            String[] splits = StringUtils.splitString(url, "/");
            String filename = "";
            filename = Double.valueOf(Math.random()*100).intValue()+".html";
            File file = new File("/doc/" + filename);
            FileUtils.write(file, content, "UTF-8");
            System.out.println(file.getAbsoluteFile());
        }

    }

    public TestSpider build(){
        return new InternalTestSpider();
    }

}
