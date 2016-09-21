package sphereOnlineJudgeProblems;

import java.util.Scanner;

public class problem1 {

	//Problem 1 - Accept integer input and output that to stdout until
	//the number 42 (Dr. Who reference) is encountered, then terminate output.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		while( number != 42){
			System.out.println(number);
			number = input.nextInt();
		}
		input.close();
		System.exit(0);
		
	}

}
