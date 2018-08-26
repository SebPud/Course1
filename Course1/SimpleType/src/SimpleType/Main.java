package SimpleType;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [][] tab = new int [3][4];
        for (int i = 0; i <tab.length ; i++) {
            System.out.println("Podaj oceny z " + (i+1) + " przedmiotu: ");
            for (int j = 0; j <tab[i].length ; j++) {
                tab[i][j] = in.nextInt();

            }

        }
        double average = average(tab);
        System.out.println(average);
    }
    public static double average(int [][] tab){
        double sum=0;
        for (int[] otherNumbers: tab) {
            for (int number: otherNumbers) {
                sum+=number;
            }
        }return sum/12;

    }
}
