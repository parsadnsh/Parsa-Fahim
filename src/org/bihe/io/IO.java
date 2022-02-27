package org.bihe.io;

import org.json.simple.JSONObject;

/**
 * author : PARSA
 */
public interface IO {
    boolean writeToFile(String fileName, JSONObject jsonObject);
    JSONObject readFromFile(String filePath);
}
