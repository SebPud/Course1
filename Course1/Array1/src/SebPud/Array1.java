package SebPud;

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] array = new int[2];
        System.out.println("Podaj pierwsza liczbe: ");

        array[0] = in.nextInt();
        System.out.println("Podaj druga liczbe: ");
        array[1] = in.nextInt();

        System.out.println("Suma liczb to: " + (array[0]+array[1]));

    }
}
