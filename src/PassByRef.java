import java.util.ArrayList;
import java.util.List;

public class PassByRef {

    public static void main(String[] args) {
        int i= 5 ;
        Integer x = 5 ;
        String name = "nameString";
        System.out.println(i);
        System.out.println(x);

        List<Integer> list = new ArrayList<Integer>();
        list.add(i);
        list.add(x);
        System.out.println(list);
        System.out.println(name);
        sum(i,x,list,name);
        System.out.println(name);
        System.out.println(i);
        System.out.println(x);
        System.out.println(list);

    }

    static void sum(int i , Integer x, List<Integer> list, String abc) {
        i=10;
        x=10;

       abc = "abcString";
       System.out.println(i);
       System.out.println(x);

       System.out.println(list);
    }

}
