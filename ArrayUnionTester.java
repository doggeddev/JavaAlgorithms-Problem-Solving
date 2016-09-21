package sphereOnlineJudgeProblems;

public class ArrayUnionTester {

	public static void main(String[] args) {
				
		ArrayUnions<Integer> test = new ArrayUnions<Integer>();
		ArrayUnions<Character> testChar = new ArrayUnions<Character>();
		
		Character[] charInput1 = {'R','I','C','H','A','R','D'};
		Character[] charInput2 = {'I','C','H','A','R','D'};
		Character[] charInput3 = {'C','H','A','R','D'};
		Character[] charInput4 = {'H','A','R','D'};
		
		testChar.addItems(charInput4);
		testChar.addItems(charInput3);
		testChar.addItems(charInput2);
		testChar.addItems(charInput1);
		
		System.out.println("Duplicate Characters Test ----> " + testChar.toString());
		System.out.println(" ");
		
		
		Integer[] input1 = {1,2,3,4,5,6};
		Integer[] input2 = {1,2,3,4,5,6};
		Integer[] input3 = {2,2,3,3,5,6};
		Integer[] input4 = {1,3,5,6};
		Integer[] input5 = {1,2,3,4,5,6,7,8,98};
		Integer[] input6 = {1,4,5,};
		
		test.addItems(input1);
		test.addItems(input2);
		test.addItems(input3);
		test.addItems(input4);
		test.addItems(input5);
		test.addItems(input6);
		
		System.out.println("Duplicate Integers Test ----> " + test.toString());
		
	}

}
