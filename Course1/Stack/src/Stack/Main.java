package Stack;

public class Main {

    public static void main(String[] args) {
        long [][] tab = new long[100000][10000];

        for (int i = 0; i <tab.length ; i++) {
            for (int j = 0; j <tab[i].length ; j++) {
                int a = 1;
                tab[i][j] = a;
                a++;
            }

        }

    }
}
