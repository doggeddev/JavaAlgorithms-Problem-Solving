package sphereOnlineJudgeProblems;

/* Created by Richard Drexel
 * 09/20/16
 *  */

public class RemoveArrayElementInPlace {

	public static void main(String[] args) {

		// sorted array of ints needs duplicate elements removed in place
		// Output should be [1,2,3,4,5,6,7,8,9,10,11,12,13]

		int[] a = { 1, 1, 1, 1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 11, 11, 12, 13, 13 };

		int placeHolder = 0;
		int newArrayLength = a.length;

		for (int next = 1; next < a.length; next++) {

			if (a[placeHolder] == a[next]) {
				newArrayLength--;
			}

			if (a[placeHolder] != a[next]) {
				placeHolder++;
				a[placeHolder] = a[next];

			}
		}	
		
		//the rest of the array after a[newArrayLength - 1] still exist and is untouched.
		for (int i = 0; i < newArrayLength; i++) {
			if (i == newArrayLength - 1)
				System.out.print(a[i]);
			else
				System.out.print(a[i] + ", ");

		}

	}
}