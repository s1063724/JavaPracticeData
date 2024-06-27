import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.*;
import java.net.InetSocketAddress;
public class Server{
	public static void main(String[] args) throws IOException {
		Selector selector = Selector.open();
		ServerSocketChannel channel = ServerSocketChannel.open();
		channel.bind(new InetSocketAddress(9000));
		channel.configureBlocking(false);
		channel.register(selector, SelectionKey.OP_ACCEPT);
		for(;;) {
			selector.select();
			Iterator<SelectionKey> keys = selector.selectedKeys().iterator();
			while (keys.hasNext()) {
				SelectionKey key = keys.next();
				if(key.isAcceptable()) {
					connectAccpet(selector, key);
				} else {
					read(key);
				}
				keys.remove();
			}
		}
	}
	public static void connectAccpet(Selector selector, SelectionKey key) throws IOException {
		SocketChannel socket = ((ServerSocketChannel)key.channel()).accept();
		socket.configureBlocking(false);
		socket.register(selector, SelectionKey.OP_READ);
		System.out.println("connect "+socket.getRemoteAddress());
	}
	public static void read(SelectionKey key) throws IOException {
		ByteBuffer buffer = ByteBuffer.allocate(32);
		buffer.clear();
		if(((SocketChannel)key.channel()).read(buffer)==-1) {
			key.channel().close();
		} else {
			buffer.flip();
			while (buffer.hasRemaining()) {
				byte b = buffer.get();
				if(b==0) {
					buffer.clear();
					buffer.put("Hello World!!\n".getBytes());
					buffer.flip();
					while (buffer.hasRemaining()) {
						((SocketChannel)key.channel()).write(buffer);
					}
				} else {
					System.out.print((char)b);
				}
			}
		}
	}
}
