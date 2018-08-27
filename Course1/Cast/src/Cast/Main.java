package Cast;

import java.util.Scanner;

public class Main {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Main example1 = new Main();
        example1.ex1();
        example1.ex2();
       // example1.ex3();
        example1.ex4();
    }

    public void ex1(){
        System.out.println("Podaj liczbe: ");
        int number = in.nextInt();
        System.out.println(number*Math.PI);
        System.out.println((int)(number*Math.PI));
    }

    public void ex2(){
        System.out.println("Podaj 2 liczby: ");
        double number1 = in.nextDouble();
        double number2 = in.nextDouble();
        System.out.println(number1/number2);
    }

    public void ex3(){
        Integer a = null;
        int b = 5;
        b+=a;

    }

    public void ex4(){
        char a = 'c';
        int b = a;
        System.out.println(b);
    }
}
