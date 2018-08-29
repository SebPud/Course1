package Ex2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random number = new Random();
        boolean is0 = false;
        int biggest = -50;
        int secondBiggest = -50;
        double oddRadio = 1;
        int amountNumbers = 0;

        do{
            int a = (number.nextInt(151)-50);
            amountNumbers++;
            if (a>biggest){
                biggest = a;
            }
            if ((a>secondBiggest )&& a<biggest){
                secondBiggest = a;
            }
            if ((a>0)&& a%2==0){
                oddRadio *=a;
            }
            if (a == 0) {
                is0 = true;
            }
        }while(!is0);
        System.out.println(biggest + "  " + secondBiggest + "  " + oddRadio);

        int amount = 0;
        int sum2= 0;
        do{
            int a = (number.nextInt(25)-25);
            amount++;
            if(amount%2==0){
                sum2 += a;
            }

        }while (amount!=amountNumbers);
        System.out.println(sum2);

    }
}