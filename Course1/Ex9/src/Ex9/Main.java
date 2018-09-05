package Ex9;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        DataInputStream inputStream = null;
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Podaj sciezke do pliku");
        try {
            inputStream = new DataInputStream(new FileInputStream(in.nextLine()));
            day = inputStream.readInt();
            month = inputStream.readInt();
            year = inputStream.readInt();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }

        }
        System.out.println(day + " " + month + " " + year);
    }
}
