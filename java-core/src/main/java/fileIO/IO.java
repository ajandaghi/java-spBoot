package fileIO;


import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IO {
    public static void main(String[] args) throws IOException {
       File file0=new File(Paths.get("src/main/java/fileIO/test.xml").toAbsolutePath().toUri());
       File file=new File(System.getProperty("user.dir"));
        Files.copy(file0.toPath(), file.toPath());

    }
}
