package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe wieksza od zera: ");
        double userIn;
        while (true) {
            try {
                userIn = in.nextDouble();
                break;
            } catch(InputMismatchException e) {
                System.out.println("Podaj wlasciwa liczbe: ");
                in.next();
            }}

            if(userIn<0){
                throw new IllegalArgumentException(String.format("Nie ma pierwiastka liczby %.4f",userIn));
        }
        System.out.print(String.format("Pierwieastek z %.4f to %.4f.", userIn, Math.sqrt(userIn)));


    }
}