package week9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Utils {

    public static String readContentFromFile(String path) {
        StringBuilder s = new StringBuilder();
        try (FileInputStream fin = new FileInputStream(path); InputStreamReader in = new InputStreamReader(fin, StandardCharsets.UTF_8)) {
            int contents;
            while ((contents = in.read()) != -1) {
                s.append((char) contents);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s.toString();
    }

    public static void writeContentToFile(String path) {
        String s = "asd\nada\nasda";
        try (FileOutputStream fout = new FileOutputStream(path); OutputStreamWriter out = new OutputStreamWriter(fout, StandardCharsets.UTF_8)) {
            out.write(s);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeContentToFileWithoutOverwriting(String path){
        String s = "\n***Next Gen***";
        File file = new File(path);
        try(FileWriter out = new FileWriter(path,true)){
            out.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }

    public static File findFileByName(String folderPath, String fileName) {
        File folder = new File(folderPath);
        if(folder.isDirectory()){
            File[] fileList = new File[100];
            FilenameFilter filter = (dir, name) -> name.equals(fileName);
            fileList = folder.listFiles(filter);
            for(File file :fileList){
                if(file == null){
                    return null;
                }
                else {
                    if (file.isFile()) {
                        return file;
                    }
                }
            }
        }
        else {
            System.out.println("Not a folder.");
        }
        return null;
    }


    public static void main(String[] args){
        String path1 = ".\\E_V.txt";
        String path2 = ".\\abcxx.txt";
        try {
            System.out.println(readContentFromFile(path1));
//            readContentFromFile(path);
            writeContentToFile(path2);
            writeContentToFileWithoutOverwriting(path2);
            File file = findFileByName("addw.txt","sda.txt");
            if(file != null) {
                System.out.println(file.getCanonicalPath());
            }else{
                System.out.println("Not found.");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
