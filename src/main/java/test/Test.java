package test;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");
        List<String> l1 = new ArrayList<>();
        l1.add("c");
        l1.add("d");
        l1.addAll(l);

        System.out.println("l1 " + l1.size());
        System.out.println("l1 " + l1);
        System.out.println("l " + l.size());
        System.out.println("l " + l);
    }
}
