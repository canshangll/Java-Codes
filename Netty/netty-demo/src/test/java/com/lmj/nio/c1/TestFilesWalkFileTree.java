package com.lmj.nio.c1;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;

public class TestFilesWalkFileTree {
    public static void main(String[] args) throws IOException {
//        Files.delete(Paths.get("E:\\bizhi - 副本"));
        Files.walkFileTree(Paths.get("E:\\bizhi - 副本"), new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//                System.out.println(file);
                Files.delete(file);
                return super.visitFile(file, attrs);
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
//                System.out.println("<====== 退出" + dir);
                Files.delete(dir);
                return super.postVisitDirectory(dir, exc);
            }
        });

    }

    private static void m2() throws IOException {
        AtomicInteger jpgCount = new AtomicInteger();
        Files.walkFileTree(Paths.get("E:\\GITHUB\\Java-Codes"), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (file.toString().endsWith(".jpg")) {
                    System.out.println(file);
                    jpgCount.incrementAndGet();
                }
                return super.visitFile(file, attrs);
            }
        });
        System.out.println("jpg count:" + jpgCount);
    }

    private static void m1() throws IOException {
        AtomicInteger dirCount = new AtomicInteger();
        AtomicInteger fileCount = new AtomicInteger();
        Files.walkFileTree(Paths.get("E:\\GITHUB\\Java-Codes"), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                System.out.println("=======>" + dir);
                dirCount.incrementAndGet();
                return super.preVisitDirectory(dir, attrs);
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println(file);
                fileCount.incrementAndGet();
                return super.visitFile(file, attrs);
            }
        });
        System.out.println("dir count:" + dirCount);
        System.out.println("file count:" + fileCount);
    }
}
