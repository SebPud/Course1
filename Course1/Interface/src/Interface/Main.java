package Interface;

import java.util.Scanner;

public class Main {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiply();
        }
        else {
            computation = new Addition();
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Wpisz M jesli chcesz mnozyc, jesli nie wpisz cokolwiek innego");
        return in.next().equals("M");
    }

    private double getArgument() {
        System.out.println("Podaj liczbe");
        return in.nextDouble();
    }
}