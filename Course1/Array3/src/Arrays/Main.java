package Arrays;

public class Main {

    public static void main(String[] args) {
        int [][][] array = new int[10][10][10];
        int a = 1;

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                for (int k = 0; k <array[i][j].length ; k++) {
                    array[i][j][k]= a;
                    a++;
                }
            }
        }
        for (int[][] someNumbers: array) {
            for (int[] anotherSomeNumbers: someNumbers) {
                for (int x:anotherSomeNumbers) {
                    System.out.println(x);
                }
            }
        }
    }
}
