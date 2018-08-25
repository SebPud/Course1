package SebPud;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] array = new int[3];

        System.out.println("Podaj pierwsza liczbe: ");
        array[0] = in.nextInt();
        System.out.println("Podaj druga liczbe: ");
        array[1] = in.nextInt();
        System.out.println("Podaj trzecia liczbe: ");
        array[2] = in.nextInt();

        int maxNumber = biggest(array);
        int maxNumber2 = biggest2(array);

        System.out.println("Najwieksza liczba to: " + maxNumber);
        System.out.println("Najwieksza liczba druga metoda to: " + maxNumber2);

    }

    public static int biggest(int[] array){
    int maxNumber = array[0];

        if (maxNumber<array[1]){
        maxNumber=array[1];
    }
        if (maxNumber<array[2]) {
            maxNumber = array[2];
        }
        return maxNumber;
    }

    public static int biggest2(int[] array){

        int maxNumber = Math.max(Math.max(array[1],array[2]),array[0]);
        return maxNumber;
    }

}
