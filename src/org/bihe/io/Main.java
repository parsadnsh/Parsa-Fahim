package org.bihe.io;

public class Main {

    public static void main(String[] args) {
        IOImplementation ioi = IOImplementation.getInstance();
        boolean re = ioi.writeToFile("1.txt", "salam \nparsa ");
        System.out.println(re);
        //System.out.println("==================");
        String[] s = ioi.readFromFile("1.txt");
        for (String str: s) {
            System.out.println(str);
            System.out.println("----------------------");
        }
    }

}
