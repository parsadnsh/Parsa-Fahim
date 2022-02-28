package org.bihe.json;

import org.bihe.beans.Customer;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * author : PARSA
 */
public class Json implements JsonInt{


    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setFirstName("dvg");
        c1.setLastName("dvvfre");
        c1.setAge(12);
        JSONObject jo = new JSONObject();
        Map <String, String> m = new HashMap<String, String>();
        m.put("first", c1.getFirstName());
        m.put("last", "najcbiyg");
        m.put("age", "" + c1.getAge() + "");

        System.out.println(jo.put(c1, m));
    }

    private static Json instance;
    private JSONObject jsonObject;

    private Json() {

    }

    public static Json getInstance() {
        if (instance == null)
            instance = new Json();
        return instance;
    }

    @Override
    public JSONObject write (Object object, HashMap<Object, String> hashMap) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(object, hashMap);
        return jsonObject;
    }

    @Override
    public Object read(Object object) {
        Object o = getInstance().getJsonObject().get(object);
        return o;
    }

    private JSONObject getJsonObject() {
        return this.jsonObject;
    }
}
