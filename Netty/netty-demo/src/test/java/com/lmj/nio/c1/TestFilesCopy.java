package com.lmj.nio.c1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestFilesCopy {
    public static void main(String[] args) throws IOException {
        String source = "D:\\Snipaste-2.4-Beta-x64";
        String target = "D:\\Snipaste-2.4-Beta-x64aaaa";

        Files.walk(Paths.get(source)).forEach(path -> {
            try {
                String targetName = path.toString().replace(source, target);
                //是目录
                if (Files.isDirectory(path)) {
                    Files.createDirectory(Paths.get(targetName));
                }
                //是普通文件
                else if (Files.isRegularFile(path)) {
                    Files.copy(path, Paths.get(targetName));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}
