package collections;
import java.util.*;
public class ArrList1 {

    public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        al.add(null);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.add(2,"M");
        System.out.println(al);
    }
}

