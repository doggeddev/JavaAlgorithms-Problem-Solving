package sphereOnlineJudgeProblems;

public class StringReverse {
	
	
	public static String reverse(String str) {
		if ((str == null) || (str.length() <= 1)) {
			return str;
	    }
	    return reverse(str.substring(1)) + str.charAt(0);
	}
	
}
