import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Set;

/**
 * Created by 60501 on 2016/8/19.
 */
public class NIOClient {

    private Selector selector;

    public NIOClient(String host, Integer port) throws IOException {
        SocketChannel channel = SocketChannel.open();
        channel.connect(new InetSocketAddress("localhost", 8000));
        channel.configureBlocking(false);
        selector = Selector.open();
        channel.register(selector, SelectionKey.OP_CONNECT);
    }

    public void listen() throws IOException {
        Set<SelectionKey> keys = selector.selectedKeys();
        for(SelectionKey k: keys){
            if(k.isAcceptable()){
                SocketChannel channel = (SocketChannel) k.channel();
                ByteBuffer buf = ByteBuffer.allocate(1024);
                channel.read(buf);
                System.out.println(new String(buf.array()));
            }
        }
    }

    public void send() throws IOException {
        while(true) {
            Set<SelectionKey> keys = selector.selectedKeys();
            for (SelectionKey k : keys) {
                SocketChannel channel = (SocketChannel) k.channel();
                ByteBuffer buf = ByteBuffer.allocate(1024);
                buf.put("hello world".getBytes());
                channel.write(buf);
                channel.register(selector, SelectionKey.OP_ACCEPT);
            }
        }
    }

    public static void main(String...args) throws IOException {
        NIOClient client = new NIOClient("localhost", 8000);
        client.send();
        System.in.read();
    }

}
