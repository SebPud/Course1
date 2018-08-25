package Temperature;

public class Temperature {

    public static void main(String[] args) {

        int positiveTemp = 15;
        int negativeTemp = -12;



        System.out.println(isPositive(positiveTemp));
        System.out.println(isPositive(negativeTemp));

    }

    private static boolean isPositive(int temperature) {

        boolean isTemperaturePositive = temperature > 0;

        if(isTemperaturePositive)  {
            System.out.println("Temperatura " + temperature + " jest wieksza od zera");
        }
        else  {
            System.out.println("Temperatura " + temperature + " jest mniejsza od zera");
        }
        return isTemperaturePositive;

    }
}
