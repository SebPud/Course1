package Ex7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        BufferedReader br = null;
        int numberOfLines = 0;
        String userPath;
        String line;

        System.out.println("podaj sciezke do pliku");
        userPath = in.nextLine();
        System.out.println("Zawartosc: ");
        try {
            br = new BufferedReader(new FileReader(userPath));

            while (true) {
                line = br.readLine();
                if (line == null){
                    break;
                }
                numberOfLines++;
                System.out.println(line);
            }
        } finally {
            if (br != null)
                br.close();
        }
        System.out.println("liczba lini: " + numberOfLines);
    }
}
