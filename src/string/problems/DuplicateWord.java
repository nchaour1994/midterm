package string.problems;

import java.util.ArrayList;

public class DuplicateWord {


    public static ArrayList<String> duplicatedWord(String st ){
        int compte;

        st=st.toLowerCase();
        String[]words=st.split(" ");
        // System.out.println(words[4]);
        ArrayList<String> duplicated=new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            compte = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    compte++;

                    words[j] = "0";
                }
            }


            if(compte >1 && words[i] != "0")
                // System.out.println(words[i]+"  "+compte);
                duplicated.add(words[i]);
        }
        return duplicated;
    }

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        String st = "Java is a programming Language . Java is also an Island of Indonesia. Java is widely used language";
        ArrayList<String>arr=DuplicateWord.duplicatedWord(st);
        System.out.println("duplicated word are "+arr);
        String[]wd=st.split(" ");
        int total=0;
        for (int i = 0 ; i < wd.length;i++){
            total=total+wd[i].length();
        }
        System.out.println("the average length of words is "+total/wd.length);

    }
}

