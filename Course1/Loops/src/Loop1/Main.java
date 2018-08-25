package Loop1;

public class Main {

    public static void main(String[] args) {
	
        int [] tab = new int[11];

        int a = 0;

        for (int i = 20; i >9 ; i--) {
            tab[a]= i;
            a++;

        }
        for (int tab1: tab)
              {
                  System.out.println(tab1);
        }
    }
}
