package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        for (int i=0;i<6;i++) {

            for(int k= 6-i;k>0;k--) {
                System.out.print(" ");
            }
            for(int j=0;j<=i*2;j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}

