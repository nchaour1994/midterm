package string.problems;

import java.util.ArrayList;

public class Permutation {
    public  static ArrayList<String> permutation(String prefix, String str) {
        int n = str.length();
        ArrayList<String>arr=new ArrayList<>();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
               arr.add(prefix);
        }
        return arr;
    }



    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
     ArrayList<String >a= permutation(" ","abc");
        System.out.println(a);


    }
}
