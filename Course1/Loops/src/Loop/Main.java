package Loop;

public class Main {

    public static void main(String[] args) {
       //First loop
        count20to10();

        //Second loop
        count10to20();

        //Third loop
        countOdd();

        //Fourth loop
        oddWhile();

        //Fifth loop
        int[] tab = new int[]{1,3,5,6,7,9,7,6};
        int a = sum(tab);
        System.out.println(a);



    }

    public static void count20to10(){
        for (int i = 20; i > 9; i--) {
            System.out.println(i);
        }
    }

    public static void count10to20(){
        int a = 10;
        while(a<21){
            System.out.println(a);
            a++;
        }
    }

    public static void countOdd(){
        for (int i =(-9) ; i <40 ; i+=2) {
            System.out.println(i);
        }
    }

    public static void oddWhile(){
        int a =(-9);
        while(a<40){
            System.out.println(a);
            a+=2;
        }
    }
    public static int sum(int[] tab){
        int sum=0;
        for (int i = 0; i <tab.length ; i++) {
            sum+=tab[i];
        }return sum;
    }
}
