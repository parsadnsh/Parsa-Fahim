package org.bihe.io;

import org.json.simple.JSONObject;

import java.io.*;

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
    public boolean writeToFile(String fileName, JSONObject jsonObject) {
        boolean result = false;
        File file = new File(fileName);
        PrintWriter pw = null;
        FileWriter fw = null;
        try {
            if (!file.exists())
                file.createNewFile();
            fw = new FileWriter(file);
            pw = new PrintWriter(fw);
            pw.write(jsonObject.toJSONString());
            pw.flush();
            pw.close();
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    @Override
    public JSONObject readFromFile(String filePath) {
        JSONObject result = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            result = (JSONObject) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
