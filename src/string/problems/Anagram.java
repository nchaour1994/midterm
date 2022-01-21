package string.problems;

public class Anagram {

    public static  boolean CompareTwo(String str,String str2) {

        boolean b=false;
        for(int i = 0 ;i< str.length();i++) {
            if(str.length()==str2.length()) {
                if(str2.contains(str.substring(i, i+1))) {
                    b= true;
                }
                else
                    b=false;

            }
        }
        return b;
    }

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is

        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        boolean res=CompareTwo("army","mary");
        System.out.println(res);

    }
}
