package week04Project;

public class week04Project {

	public static void main(String[] args) {
		// 1:
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		// A: An array named ages that subtracts the first value from the last value and prints it to the console.
		System.out.println("1 A: " + (ages[ages.length-1] - ages[0]));
		// B: An array named ages2 has more elements than ages[] but using the array.length we can still find the last value in the array
		int[] ages2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		System.out.println("1 B: " + (ages2[ages2.length-1] - ages2[0]));
		//C:This loop takes all the values in the array ages and prints the average to the console
		double sum = 0;
		for(int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		double average = sum / ages.length;
		System.out.println("1 C: " + average);
		//2:
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//A:This loop takes the length of each name in the array and then prints their average to the console
		double nameSum = 0;
		for(int i = 0; i < names.length; i++) {
			nameSum += names[i].length();
		}
		double nameAverage = nameSum / names.length;
		System.out.println("2 A: " + nameAverage);
		//B:This loop take all the names in the array names[] and concatenates them together and prints it out to the console with spaces inbetween the names
		String space = " ";
		StringBuilder allName = new StringBuilder()
;		for(int i = 0; i < names.length; i++) {
			allName.append(names[i]);
			allName.append(space);
		}
		System.out.println("2 B: " + allName.toString());
		/* 3: You can access the last element in any array by using the array.length to find the length of the array
		 *  and subtract 1 from the length to get the final element. You must subtract the one because arrays start at 0 instead of 1.
		 */
		// 4: You can find the start of any array by using array[0], because all arrays first element is at position 0.
		
		// 5: The loop uses the array names[] to add the length of each string to the array nameLengths[]
		int[] nameLengths = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		// 6: This loop adds all elements of the array nameLengths. Then prints the sum to the console.
		int arraySum = 0;
		for(int i = 0; i < nameLengths.length; i++) {
			arraySum += nameLengths[i];
		}
		System.out.println("6: " + arraySum);
		//7:Prints out the method multiWord
		System.out.println("7: " + multiWord("Hello", 3));
		//8:Prints out the method fullName.
		System.out.println("8: " + fullName("Logan", "Blum"));
		//9:Prints out the method over100 using the array test.
		int[] test = {50, 1, 1, 1};
		System.out.println("9: " + over100(test));
		//10: Prints out the method average using the array test2.
		double[] test2 = {50, 20.3, 2, 77.4};
		System.out.println("10: " + average(test2));
		//11: Prints out the method firstArrayGreater
		double[] arrayOne = {1, 2, 3, 4, 5};
		double[] arrayTwo = {10, 1, 2, 3, 4};
		System.out.println("11: " + firstArrayGreater(arrayOne, arrayTwo));
		//12: Prints out the method willBuyDrink
		System.out.println("12: " + willBuyDrink(true, 10.51));
		//13:
		feedCats(2, true);

	}
	//7:This method takes a string and a number and returns the word appended to itself that many number of times.
	public static String multiWord(String word, int multi) {
		StringBuilder multiWord = new StringBuilder();
		for(int i = 0; i < multi; i++) {
			multiWord.append(word);
		}
		return multiWord.toString();
	}
	//8:This method takes to strings, first and last, and appends them together with a space in the middle to return the full name
	public static String fullName(String first, String last) {
		StringBuilder fullName = new StringBuilder();
		fullName.append(first);
		fullName.append(" ");
		fullName.append(last);
		return fullName.toString();
	}
	//9: This method takes in the array num and returns true if all the elements in the array's sum is over 100. Returns false otherwise
	public static boolean over100(int[] num) {
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		if(sum > 100) {
			return true;
		}else 
			return false;
	}
	//10:This method takes the array ave and returns the average of all the elements inside the array
	public static double average(double[] ave) {
		double sum = 0;
		for(int i = 0; i < ave.length; i++) {
			sum += ave[i];
		}
		return sum / ave.length;
	}
	//11: This method takes 2 arrays and compares the averages to return true if array1's average is greater then array2's.
	public static boolean firstArrayGreater(double[] array1, double[] array2) {
		double sum1 = 0;
		for(int i = 0; i < array1.length; i++) {
			sum1 += array1[i];
		}
		double sum2 =0;
		for(int i = 0; i < array2.length; i++) {
			sum2 += array2[i];
		}
		if((sum1 / array1.length) > (sum2 / array2.length)) {
			return true;
		}else 
			return false;
	}
	//12: This method returns true if the boolean isHotOutside is true and if the double moneyInPocket is greater then 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if((isHotOutside) && moneyInPocket > 10.50) {
			return true;
		}else 
			return false;
	}
	//13: This method takes in an int for the amount of times the cats have been fed today and a boolean to check if the time is after 5pm.
	// I created this method so i can easily remind myself if my cats need to be fed or if i have already fed the cats more than once today
	public static void feedCats(int timesFedToday, boolean after5) {
		if((timesFedToday < 2) && (after5)) {
			System.out.println("Time to feed the Cats");
		}else
			System.out.println("The Cats have been fed");
		
	}
}

