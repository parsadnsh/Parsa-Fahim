package org.bihe.io;

import org.json.simple.JSONObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * author : PARSA
 */
public class IOImplementation implements IO {

    private String filePath;
    private final static IOImplementation instance = new IOImplementation();

    private IOImplementation() {

    }

    public static IOImplementation getInstance() {
        return instance;
    }

    @Override
    public boolean writeToFile(String fileName, String content) {
        File file = new File(fileName);
        PrintWriter writer = null;
        FileWriter fileWriter = null;
        try {
            if (!file.exists())
                file.createNewFile();
            fileWriter = new FileWriter(file);
            writer = new PrintWriter(fileWriter);
            writer.println(content);
            writer.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (writer != null)
                writer.close();
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public String[] readFromFile(String filePath) {
        Path path = Path.of(filePath);
        String s = "";
        String[] result = null;
        try {
            s = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (!s.equals("")) {
            result = s.split("\n");
        }
        return result;
    }


//    @Override
//    public boolean writeToFile(String fileName, JSONObject jsonObject) {
//        boolean result = false;
//        File file = new File(fileName);
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//        try {
//            fos = new FileOutputStream(fileName);
//            oos = new ObjectOutputStream(fos);
//            oos.writeObject(jsonObject);
//            oos.close();
//            result = true;
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//
//    @Override
//    public JSONObject readFromFile(String filePath) {
//        JSONObject result = null;
//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//        try {
//            fis = new FileInputStream(filePath);
//            ois = new ObjectInputStream(fis);
//            result = (JSONObject) ois.readObject();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
}
