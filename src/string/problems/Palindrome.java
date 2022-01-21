package string.problems;

public class Palindrome {
    public static boolean palindromeTest(String word) {
        boolean res= false;
        for (int i = 0 ; i< word.length();i++) {
            if (!(word.charAt(i)==word.charAt(word.length()-1-i))) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        boolean b= palindromeTest("madam");
        System.out.println(b);




    }
}
