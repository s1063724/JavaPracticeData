import static java.nio.file.StandardWatchEventKinds.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
public class Main158{
	public static void main(String[] args) throws InterruptedException, IOException {
		Path p = Paths.get("/tmp");
		WatchService watcher = p.getFileSystem().newWatchService();
		p.register(watcher, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);
		Thread t = new Thread(()->{
			try{
				WatchKey key = watcher.take();
				while(Objects.nonNull(key)) {
					for(WatchEvent<?> e: key.pollEvents()) {
						System.out.print(e.kind()+"\n"+e.context()+"\n=======\n");
					}
					key.reset();
					key = watcher.take();
				}
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		});
		t.start();
		t.join();
	}
}
