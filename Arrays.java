/*
Arrays
*/

class arrays {
	public static void main(String[] args) {

		//Define an array with type int with 5 data points
		int[] array = new int[5];

		//Assign the int 20 to position 1(0) in the array
		array[0] = 20;

		//If you already know the values for an array you can use the array literal to initialise
		String[] days = { "Monday", "Tuesday"};

		//Print element 0 in an array
		System.out.println(array[0]);

		//Get length of array
		System.out.println(days.length);

		//Sum all elements in an array
		int[] arr = {2, 10, 15,20};
		int arrsum = 0;
		for (int x = 0; x < arr.length; x++ ){
			arrsum += arr[x];
		}
		System.out.println(arrsum);

		//for each loop of array
		for (String x: days) {
			System.out.println(x);
		}

		//Multi dimensional array (essentially an array of arrays)
		int[][] test = { {1, 2, 3 } , { 4, 5, 6 } , { 7, 8, 9 }};
		//The two indexes are called the row and column indexe
		System.out.println(test[2][2]);
	}
}