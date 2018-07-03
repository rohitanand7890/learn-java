package collections;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add("Rohit");
        l1.add(30);
        l1.add(null);
        l1.add("Rohit");
        System.out.println(l1);
        l1.set(0,"Software");
        System.out.println(l1);
        l1.add(0,"Vicky");
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
        l1.addFirst("ccc");
        System.out.println(l1);
    }
}
