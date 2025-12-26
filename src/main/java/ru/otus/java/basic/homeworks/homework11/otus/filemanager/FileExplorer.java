package ru.otus.java.basic.homeworks.homework11.otus.filemanager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileExplorer {
    private static List<File> listTextFiles() {
        File file = new File(".");
        List<File> files = new ArrayList<>();
        File[] files1 = file.listFiles();
        if (files1 == null) {
            throw new IllegalArgumentException("В нашей директории нету файлов с расширением .txt");
        }
        for (File listFile : files1) {
            if (listFile.getName().toLowerCase().endsWith(".txt")) {
                files.add(listFile);
            }
        }
        return files;
    }

    public static void printTextFiles() {
        System.out.println(listTextFiles());
    }
}
