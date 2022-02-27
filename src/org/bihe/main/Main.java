package org.bihe.main;

import org.bihe.beans.Appointment;
import org.bihe.beans.Customer;
import org.bihe.beans.Staff;
import org.bihe.json.Json;

import java.util.Date;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Staff s = new Staff();
        s.setFullName("Parsa Danesh");
        s.setStaffID(1);
        Customer c = new Customer();
        c.setId(2);
//        Json j = Json.getInstance();
//        j.write()
        Json j = Json.getInstance();
        Date now = new Date();
        Appointment a = new Appointment(110, now, s, c);
        HashMap<Object, String> hm = new HashMap<>();
        hm.put(a, "" + a.getId() + "");
        hm.put(a, "now");
        hm.put(a, s.getFullName());
        hm.put(a, c.getFirstName() + c.getLastName());
        System.out.println("here we go: " + j.write(a, hm));
        System.out.println("==============================");
        System.out.println(j.read(a));
    }
}
