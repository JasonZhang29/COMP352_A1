
public class PermuV1 {

	public static void swap(char[] chArr, int i, int j) {
		// swap function for interchange two characters in a char array
		char temp = chArr[i];
		chArr[i] = chArr[j];
		chArr[j] = temp;
		
	}
	
	public static void find(String shortStr, String longStr) {
		// function for finding a short string in a long str
		int index = longStr.indexOf(shortStr);
		
		if (index != -1) {
			System.out.println("Found one match: " + shortStr + 
					" is in " + longStr + "at location " + index);
		}
		
	}
		
	public static void permu(String sStr, int currIndex, String lStr) {
		
		char[] chArr = sStr.toCharArray();		// char array to store short string
		if (currIndex == chArr.length - 1) {	// base case
			System.out.println(String.valueOf(chArr));
			find(String.valueOf(chArr), lStr);
		}
		
		for (int i = currIndex; i < chArr.length; ++i) { // loop to find all permutations
			swap(chArr, currIndex, i);
			permu(String.valueOf(chArr), currIndex + 1, lStr);
		}
		
	}
	
	public static void main(String[] args) {
		
		String sStr = "abcdefhigjnbbgg";
		String lStr = "aiabcdefghijggnabbxyznbcdaehfijnnggnzanxyotbadecfraxbdecafjifftdabecffhebdcafxwymgrydghhhyzptwibohtt";
		System.out.println("Short string length: " + sStr.length());
		System.out.println("Long string length: " + lStr.length());
		
		long startTime = System.currentTimeMillis();
		permu(sStr, 0, lStr);
		long endTime = System.currentTimeMillis(); 
		long elapsed = endTime - startTime;
		System.out.println("\nAlgorithm run time: " + elapsed + " milisecs");
	}

}
