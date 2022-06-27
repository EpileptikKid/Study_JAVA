package File_work;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class CatalogTree {
    private static class Finder extends SimpleFileVisitor<Path> {
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
            System.out.println(file);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
            System.out.println("----------- " + dir + " -----------");
            return FileVisitResult.CONTINUE;
        }
    }

    public static void main(String[] args) {
        String dirName = new Scanner(System.in).nextLine();
        try {
            Files.walkFileTree(Paths.get(dirName), new Finder());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
