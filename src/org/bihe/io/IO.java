package org.bihe.io;

import org.json.simple.JSONObject;

/**
 * author : PARSA
 */
public interface IO {
    boolean writeToFile(String fileName, String content);
    String[] readFromFile(String filePath);
}
