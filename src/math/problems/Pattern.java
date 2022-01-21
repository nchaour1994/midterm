package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90
		 * ,88,86,84,82,80,78,76,74,72,70,67
		 * ,64,61,58,55,52,49,46,43,40,36,32
		 * ............
		 *
		 *
		 */
		int j=1;
		for (int i = 0; i <101; i=i+j) {
			if(i<40){
				j=4;
				System.out.println(i);
			}else if(i<70){
				j=3;
				System.out.println(i);

			}else if (i<90){
				j=2;
				System.out.println(i);
			}
			else if(i<=100){
				j=1;
				System.out.println(i);
			}
			//System.out.println(i);
		}

	}
}

