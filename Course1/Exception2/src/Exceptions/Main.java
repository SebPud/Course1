package Exceptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        try {
            wypisz(string);
        } catch (NullPointerException n) {
            n.printStackTrace(System.out);
            throw new Exception(n);
        }
    }

    public static void wypisz(String s){
        System.out.println(s.length());
    }
}
