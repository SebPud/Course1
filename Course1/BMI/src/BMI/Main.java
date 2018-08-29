package BMI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main m = new Main();
        Scanner in = new Scanner(System.in);

        double weight;
        double height;

        System.out.print("Podaj wage: ");
        weight = in.nextDouble();
        System.out.print("Podaj wzrost: ");
        height = in.nextDouble();

        double bmi = m.bmi(weight,height);
        if (bmi<18.5) {
            System.out.println(String.format("Bmi równe %f , masz niedowage", bmi));
        }else if (bmi<24.9){
                System.out.println(String.format("Bmi rowne %f , masz dobra wage",bmi));
            }else
                System.out.println(String.format("Bmi na poziome %f , masz nadwage",bmi));

    }

    public double bmi(double w, double h){
        return w/(Math.pow(h/100,2));
    }
}
