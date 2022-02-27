package org.bihe.json;

import org.json.simple.JSONObject;

import java.util.HashMap;

public interface JsonInt {
    JSONObject write (Object object, HashMap<Object, String> hashMap);
    Object read(Object object);
}
