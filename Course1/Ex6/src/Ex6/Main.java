package Ex6;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        FileWriter output = null;
        String line;

        System.out.println("Podaj sciezke do pliku");

        try {
            output = new FileWriter(in.nextLine());
            System.out.println("Podaj zawartosc pliku");

            while (true) {
                line = in.nextLine();
                if (line.equals("-")) {
                    break;
                }
                output.write(line);
                output.write(System.lineSeparator());
            }
        } finally {
            if (output != null)
                output.close();
        }
    }
}
