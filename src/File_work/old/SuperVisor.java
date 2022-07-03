package File_work.old;

import java.nio.file.*;
import java.util.Scanner;
import static java.nio.file.StandardWatchEventKinds.*;

public class SuperVisor {
    @SuppressWarnings("uncheked")
    public static void main(String[] args) throws Exception {
        System.out.println("print name catalog");
        Path dir = Paths.get(new Scanner(System.in).nextLine());
        WatchService watcher = FileSystems.getDefault().newWatchService();
        WatchKey key = dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
        while (true) {
            key = watcher.take();
            for (WatchEvent<?> event : key.pollEvents()) {
                WatchEvent<Path> ev = (WatchEvent<Path>) event;
                Path ptr = dir.resolve(ev.context());
                String str = ptr.toString();
                if (str.endsWith(".txt")) {
                System.out.println("\"" + dir.resolve(ev.context()) + "\"");
                    System.out.printf("%s: %s\n", ev.kind().name(), dir.resolve(ev.context()));
                }
            }
            key.reset();
        }
    }
}
