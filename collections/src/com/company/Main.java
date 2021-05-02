package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;


public class Main {

    public static void main(String[] args) {
     /*
list -done
queue-
set-
tree-
*/
        System.out.println("This is list.");
        List numberList = new ArrayList();
        numberList.add("43");
        numberList.add("21");
        numberList.add("88");
        numberList.add("64");
        numberList.add("51");
        numberList.add("51");
        for (Object str : numberList){
            System.out.println((String)str);
        }
        System.out.println("This is HashSet.");
        HashSet<String> place = new HashSet<String>();
        place.add("43");
        place.add("21");
        place.add("88");
        place.add("64");
        place.add("51");
        place.add("51");

        for (Object str : place){
            System.out.println((String)str);

        }


        System.out.println("This is Queue.This works with a first in first out method.");
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("43");
        deque.add("21");
        deque.add("88");
        deque.add("64");
        deque.add("51");
        deque.add("51");
        for (String str : deque){
            System.out.println(str);
        }


        System.out.println("This is Tree.This will sort your numbers and will not place duplicates");
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("43");
        tree.add("21");
        tree.add("88");
        tree.add("64");
        tree.add("51");
        tree.add("51");
        tree.add("87");
        tree.add("88");

        for (Object str : tree) {
            System.out.println((String) str);
        }
    }
}
