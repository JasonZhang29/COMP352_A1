
public class Q2 {

	public static void smallestLargestDiff(int[] intArray) {
		int l = -1;
		int s = 1000000; // could use a for loop to get the largest number in the array
						 // instead of an arbitrary large number
		int idxS = 0, idxL = 0; // smallest index, largest index
		for (int i = 1; i < intArray.length; ++i) {
			int temp = Math.abs(intArray[i - 1] - intArray[i]);
			if (temp < s) {
				s = temp;
				idxS = i - 1;
			}
			if (temp > l) {
				l = temp;
				idxL = i - 1;
			}
		}
		System.out.println("The two conductive indices with smallest difference between their values are: "
				+ "index" + idxS + " and index " + (idxS + 1) + ", storing values " + 
				intArray[idxS] + " and " + intArray[idxS + 1]);
		System.out.println("The two conductive indices with largest difference between their values are: "
				+ "index" + idxL + " and index " + (idxL + 1) + ", storing values " + 
				intArray[idxL] + " and " + intArray[idxL + 1]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {20, 52,400, 3, 30, 70, 72, 47, 28, 38, 41, 53, 20};
		smallestLargestDiff(intArray);
	}

}
