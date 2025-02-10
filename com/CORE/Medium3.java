package com.CORE;
/*3.
Write the program to arrange the following names in alphabetic order. 
The sorting is to be done on the first three characters of the first name.
(Ashok, Alok, Akash, Amit, Amol, Anil, Ashish and Anand)*/
import java.util.*;

public class Medium3 {
    public static void main(String[] args) {
        String[] names = {"Ashok", "Alok", "Akash", "Amit", "Amol", "Anil", "Ashish", "Anand"};

        Arrays.sort(names, (a, b) -> a.substring(0, 3).compareTo(b.substring(0, 3)));

        System.out.println("Sorted Names:");
        for (String x : names) {
            System.out.println(x);
        }
    }
}
