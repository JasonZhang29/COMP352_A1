
public class PermuV2 {
	
	public static boolean match(int[] sIntArr, int[] lIntArr) {
		// compare two integer array, return true if they are the same 
		for (int i = 0; i < 26; ++i) {
			if (sIntArr[i] != lIntArr[i]) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void find(String sStr, String lStr) {
		
		int[] sStrPatn = new int[26];
		int[] lStrPatn = new int[26];
		// initial short String pattern, and put first equal length substring of longstr into pattern int[]
		for (int i = 0; i < sStr.length(); ++i) {
			++sStrPatn[sStr.charAt(i) - 'a'];
			++lStrPatn[lStr.charAt(i) - 'a'];
		}
		// loop longstr to the end, if there is match, output it
		for (int i = 0; i < lStr.length() - sStr.length() + 1; ++i) {
			if (match(sStrPatn, lStrPatn)) {		// if matched, output the results
				String matched = lStr.substring(i, i + sStr.length());
				System.out.println(matched);
				System.out.println("Found one match: " + matched + " is in " + lStr +
						" at location " + i);
			}
			// change the pattern in longStr for next comparison
			--lStrPatn[lStr.charAt(i) - 'a'];
			if (i + sStr.length() < lStr.length()) {
				++lStrPatn[lStr.charAt(i + sStr.length()) - 'a'];
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		String shortString = "abcdefhigjnbbggaxyzn";
		String longString = "aiabcdefghijggnabbxyznbcdaehfijnnggnzanxyotbadecfraxbdecafjifftdabecffhebdcafxwymgrydghhhyzptwibohttaiabcdefghijggnabbxyznbcdaehfijnnggnzanxyotbadecfraxbdecafjifftdabecffhebdcafxwymgrydghhhyzptwibohtt";
		System.out.println("Short string length: " + shortString.length());
		System.out.println("Long string length: " + longString.length());
		
		long startTime = System.currentTimeMillis();
		find(shortString,longString);
		long endTime = System.currentTimeMillis();
		long elapsed = endTime - startTime;
		System.out.println("\nAlgorithm run time: " + elapsed + " milisecs");
	}

}
