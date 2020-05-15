
public class Q1 {

	public static String replaceStr(char[] chArr) {
		
		StringBuilder newStr = new StringBuilder();
		int counter = 1;
		
		for (int i = 1; i < chArr.length; ++i) {
		
			if (chArr[i - 1] == chArr[i] && i != chArr.length - 1) {
				++counter;
			}
			
			if (chArr[i - 1] == chArr[i] && i == chArr.length - 1) {
				++counter;
				newStr.append(chArr[i - 1]);
				newStr.append(Integer.toString(counter));
			}
			
			if (chArr[i - 1] != chArr[i] && i != chArr.length - 1) {
				newStr.append(chArr[i - 1]);
				if (counter > 1) {
					newStr.append(Integer.toString(counter));
				}
				counter = 1;
			}
			
			if (chArr[i - 1] != chArr[i] && i == chArr.length - 1) {
				newStr.append(chArr[i - 1]);
				if (counter > 1) {
					newStr.append(Integer.toString(counter));
				}
				newStr.append(chArr[i]);
			}
			
		}
		
		return newStr.toString();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "ggaaaNN@@@@@KKeeeejjdsmmuu";
		char[] str = source.toCharArray();
		
		System.out.println("Source string is: " + source);
		System.out.println("Replaced string is: " + replaceStr(str));
	}

}
