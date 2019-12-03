/*
 * Ziyang Zeng
 * zengzg@mail.uc.edu
 * Due date:
 * IS 4010
 * FALL 2019
 * Demonstrating the String and StringBuilder data types
 */
package strings;
public class Main {

	public static void main(String[] args) {
		testSomeStrings();
		testSomeStringBuilders();
	}
	public static void testSomeStrings() {
		String test = "Todd Lindemann";
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000000000; i++) {  //One billion iterations
			String fruit = "Applee";// Oops. Spelled wrong!
			fruit = fruit.replace("ee",  "e");
			//System.out.println(fruit);
		}
		long endTime = System.nanoTime();

		// get difference of two nanoTime values
		long timeElapsed = endTime - startTime;
		System.out.println("testSomeStrings(): Execution time in milliseconds : " + (double)timeElapsed / 1000000);
	}
	/***
	 * Run some StringBuilder operations and see how long it takes
	 */
	public static void testSomeStringBuilders() {
		StringBuilder test = new StringBuilder("Todd Lindemann");
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000000000; i++) {
			//                        01234567
			test = new StringBuilder("Applee"); // Essentially the same as above"
//			System.out.println("After replace, test = " + test.toString());
			test.replace(4, 7, "e"); // replace ee with e
//			System.out.println("After replace, test = " + test.toString());		
//			System.out.println("");
		}
		long endTime = System.nanoTime();

		// get difference of two nanoTime values
		long timeElapsed = endTime - startTime;
		System.out.println("testSomeStringBuilders(): Execution time in milliseconds : " + (double)timeElapsed / 1000000);
	}

}
