package Naz_Algorithm_Java;

import java.util.Scanner;

/*- 
 * Linear search is like searching an element in multiple elements 
 * and the position of that element
 * Linear search is used less today because it's slower than
 * binary search and hashing
 */
public class Naz_Algorithm_01_Linear_Search_User_Input {

	public static void main(String[] args) {

		// CREATE A Scanner to take user input
		Scanner userInput = new Scanner(System.in);

		// print this line
		System.out.print("Enter how many numbers you want to insert: ");

		// take input from user
		int totalElements = userInput.nextInt();

		// new line
		System.out.println();

		// declare an array which size is defined by the user "totalElements"
		int[] elementArray = new int[totalElements];

		// a variable which will be printed as element number
		int j = 1;

		// loop which will run until the "i" is smaller than "elementArray"
		// length
		for (int i = 0; i < elementArray.length; i++) {

			// print this line
			System.out.print("Element number " + j + " is : ");

			// take input from user which is the element and will be stored in
			// elementArray
			elementArray[i] = userInput.nextInt();
			System.out.println();

			// every time I take input than increase "j" for one time
			// as it will show up every time as element number
			j++;
		} // for loop

		// print as an instruction to input the element the user is searching for
		System.out.println("Enter the elemetn you want to search in this Array: ");

		// take input
		int lookingForElement = userInput.nextInt();

		// declare a variable
		int totalIndexSearch;

		//
		for (totalIndexSearch = 0; totalIndexSearch < totalElements; totalIndexSearch++) {

			// if the searching element is present in the array then print the below line
			if (elementArray[totalIndexSearch] == lookingForElement) {
				System.out.println(

						"Element " + lookingForElement + " is present " + " in " + totalIndexSearch + " position");
				// now break the loop when you get the element
				break;
			} // if ends
				// close the scanner
			userInput.close();
		} // for loop ends

		// when you get that the totalIndexSearch is same as totalElements because
		// by searching one by one then when it moves to the last and didn't match then
		//
		if (totalIndexSearch == totalElements) {
			System.out.println(lookingForElement + " is not present. Sorry!");
		}

	}// main method
}// class
