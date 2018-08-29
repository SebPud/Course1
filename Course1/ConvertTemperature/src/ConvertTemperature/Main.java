package ConvertTemperature;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CaseTemperature c = new CaseTemperature();
        Scanner in = new Scanner(System.in);

        System.out.println("Konverter skal.");
        System.out.println("Podaj Wartość temperatury: ");

        double temperature = in.nextDouble();

        System.out.println("Wybierz skale poczatkowa.");
        System.out.println("1.Scala Celcjusza");
        System.out.println("2.Scala Fahrenheita");
        System.out.println("3.Scala Kelvina");

        switch (in.nextInt()){
            case 1:
                c.setTempCelcjusza(temperature);
                System.out.println("Wybierz skale wyjsciowa:");
                System.out.println("1.Scala Fahrenheita");
                System.out.println("2.Scala Kelvina");
                switch (in.nextInt()){
                    case 1:
                        System.out.println("Temperatura wynosi: " + c.cToF(c.getTempCelcjusza()));
                        break;
                    case 2:
                        System.out.println("Temperatura wynosi: " + c.cToK(c.getTempCelcjusza()));
                        break;
                    default:
                        System.out.println("Bledna wartosc");
                }
                break;
            case 2:
                c.setTempFahrenheita(temperature);
                System.out.println("Wybierz skale wyjsciowa:");
                System.out.println("1.Scala Celcjusza");
                System.out.println("2.Scala Kelvina");
                switch (in.nextInt()){
                    case 1:
                        System.out.println("Temperatura wynosi: " + c.fToC(c.getTempFahrenheita()));
                        break;
                    case 2:
                        System.out.println("Temperatura wynosi: " + c.fToK(c.getTempFahrenheita()));
                        break;
                    default:
                        System.out.println("Bledna wartosc");
                }
                break;
            case 3:
                c.setTempKelvina(temperature);
                System.out.println("Wybierz skale wyjsciowa:");
                System.out.println("1.Scala Fahrenheita");
                System.out.println("2.Scala Celcjusza");
                switch (in.nextInt()){
                    case 1:
                        System.out.println("Temperatura wynosi: " + c.kToF(c.getTempKelvina()));
                        break;
                    case 2:
                        System.out.println("Temperatura wynosi: " + c.kToC(c.getTempKelvina()));
                        break;
                    default:
                        System.out.println("Bledna wartosc");
                }
                break;
            default :
                System.out.println("Bledna waertosc");
        }



    }
}
