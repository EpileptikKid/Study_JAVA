package File_work;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyCatalog {
    public static void main(String[] args) throws IOException {
        Path oldPath = Paths.get("src//File_work//catalog");
        Path newPath = Paths.get("src//File_work//newCatalog");
        Files.createDirectory(newPath);
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(oldPath)){
            for (Path p : ds) {
                Files.move(Paths.get(oldPath + "\\" + p.getFileName()), Paths.get(newPath + "\\" + p.getFileName()));
            }
        }
    }
}
