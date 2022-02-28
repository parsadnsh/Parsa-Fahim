package org.bihe.io;

public class Main {

    public static void main(String[] args) {
        IOImplementation ioi = IOImplementation.getInstance();
        boolean re = ioi.writeToFile("2.txt", "salam \nparsa ");
        System.out.println(re);
        boolean r2 = ioi.writeToFile("2.txt", "by \nfahim ");
        System.out.println(r2);
        //System.out.println("==================");
        String[] s = ioi.readFromFile("2.txt");
        for (String str: s) {
            System.out.println(str);
            System.out.println("----------------------");
        }
        boolean r = ioi.writeToFile("1.txt", "salam \nparsa ");
//        boolean r2 = ioi.writeToFile("1.txt", "by \nparsa ");
//
//        System.out.println(r + " " + r2);
//        String[] s1 = ioi.readFromFile("1.txt");
//        for (String str: s1) {
//            System.out.println(str);
//            System.out.println("----------------------");
//        }
    }



}
