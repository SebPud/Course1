package Ex5;

import java.util.*;

public class Main {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

      Main main = new Main();
     /* List<String> list = new ArrayList<>();
      list =  main.getName();

        for (String o: list
             ) {
            System.out.println(o);
        }*/

     Map<String,String> map = new HashMap<>();
     map = main.getPair();
     main.get2Name(map);



    }

    public  List getName(){

        List<String> list = new ArrayList<>();
        String a ;

        do{
            a = in.next();
            list.add(a);
        }while(!a.equals("-"));
     return list;
    }

    public Map getPair(){
        Map<String, String> map = new HashMap<>();


        do{
            String a = in.next();
            if (a.equals("-")) break;
            String b = in.next();
            if (b.equals("-")) break;
            map.put(a,b);

        }while(true);
        return map;
    }

    public void get2Name(Map<String,String> map){
        System.out.println("Wpisz imie");
        String name = in.next();
        String key = null;
        String value = null;

        for (Map.Entry<String,String> entry : map.entrySet()) {
                key = entry.getKey();
                value = entry.getValue();

                if (key.equals(name)) {
                    System.out.println(value);
                    break;
                }

                if (value.equals(name)) {
                    System.out.println(key);
                    break;

                }
        }

    }
}
