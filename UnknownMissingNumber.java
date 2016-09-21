package sphereOnlineJudgeProblems;

import java.util.Random;

public class UnknownMissingNumber {

	/* Determine the number missing in an array */

	public static void main(String[] args) {
		//UNCOMMENT METHOD TO VERIFY RESULT
		
		//findMissingUnsortedArray();
		//findMissingSortedArray();
	}
	
	public static void findMissingUnsortedArray(){
		//Assume the array is unsorted
		int[] sortedArrayOfNumbers = new int[101];
		Random rand = new Random();
		int randIndex = rand.nextInt(100);
		int sum = 0;
		
		for (int i = 1; i < sortedArrayOfNumbers.length; i++) {
			sortedArrayOfNumbers[i] = i;
		 
		}

		//Randomly pick an index and set it to 0
		if (randIndex > 0 && randIndex <= 100) {
			sortedArrayOfNumbers[randIndex] = 0;
			
		}
		
		//Find sum of array
		//Array with 100 numbers from 1 100 will have a sum of 5050 (100) * (100)/2
		for(int i: sortedArrayOfNumbers){
			sum += i;
		}
		System.out.println("Missing Number is 5050-" + sum + "=" + (5050-sum));
		System.out.println("Random number chosen was: " + randIndex);
		
	}

	public static void findMissingSortedArray() {

		int[] sortedArrayOfNumbers = new int[101];

		// Assume a sorted array first
		for (int i = 1; i < sortedArrayOfNumbers.length; i++) {
			sortedArrayOfNumbers[i] = i;
		}

		// Pick a random index and set that number to zero
		Random rand = new Random();
		int randIndex = rand.nextInt(100);

		if (randIndex > 0 && randIndex <= 100) {
			sortedArrayOfNumbers[randIndex] = 0;
		}

		// find missing number iteratively - index should equal value if array
		// is sorted
		for (int i = 1; i < 101; i++) {

			if (sortedArrayOfNumbers[i] != i) {
				System.out.println("Missing number is:" + i);
			}

		}
	}
}
