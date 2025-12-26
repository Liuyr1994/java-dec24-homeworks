package ru.otus.java.basic.homeworks.homework11.otus.filemanager;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileHandler {

    public String readFile(String nameFile) {
        StringBuilder sb = new StringBuilder();
        try (FileInputStream in = new FileInputStream(nameFile)) {
            byte[] buffer = new byte[256];
            int n = in.read(buffer);
            while (n > 0) {
                sb.append(new String(buffer, 0, n, StandardCharsets.UTF_8));
                n = in.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public void writeLine(String fileName, String line) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName, true))) {
            out.write(line.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void overwriteFile(String fileName, String content) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName))) {
            out.write(content.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
