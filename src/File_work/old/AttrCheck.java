package File_work.old;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;
import java.util.Scanner;

public class AttrCheck {
    public static void main(String[] args) throws Exception {
        System.out.println("print name file or catalog");
        Path paths = Paths.get(new Scanner(System.in).next());
        DosFileAttributes attr = Files.readAttributes(paths, DosFileAttributes.class);
        System.out.println("Time create - " + attr.creationTime());
        System.out.println("size - " + attr.size());
        System.out.println("last modified - " + attr.lastModifiedTime());
        System.out.println("file - " + attr.isRegularFile());
        System.out.println("catalog - " + attr.isDirectory());
    }
}
