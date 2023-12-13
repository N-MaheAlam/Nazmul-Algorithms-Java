package Naz_Algorithm_Java;

import java.util.Arrays;
/*-
  selection sort is the algorithm when we have an unsorted array
  we sort them using this algorithm
 */
import java.util.Scanner;

public class Naz_Algorithm_02_Selection_Sort {

	public static void main(String[] args) {

		// Scaner object to take any input from user
		Scanner input = new Scanner(System.in);

		// print
		System.out.print("Enter The Array Size: ");

		// enter the size of the array
		int arraySize = input.nextInt();

		// declare the array size
		int[] arrayElement = new int[arraySize];
		System.out.println("Enter the array value: ");

		// run the loop for till the arraySize one by one using
		// loop
		for (int i = 0; i < arrayElement.length; i++) {

			arrayElement[i] = input.nextInt();

			// print new line after printing each value
			System.out.println();
		} // end for loop

		// close the scanner object
		input.close();

		// print the unsorted user input array as String by calling
		// the Arrays built in class
		System.out.println("Unsorted Inputed Array" + Arrays.toString(arrayElement));

		// declare a variable and call the method to sort the value
		int[] newArrayElement = Naz_Algorithm_02_Selection_Sort.seleactionSortAlgo(arrayElement);

		// now print the new sorted array "newArrayElement" as string
		System.out.println("Sorted Inputted Array " + Arrays.toString(newArrayElement));
		int[] testArray = { 7, 1, 8, 4, 0, 6, 2, 5, 10, 3, 9 };

		// print this line
		System.out.print("Unsorted Array:           ");

		// using enhanced for loop to print all the value of testArray
		for (int ele : testArray) {
			System.out.print(ele + ",");
		}

		// print this line
		System.out.print("\n  Sorted Array:           ");

		// now sorting the testArray using Demo class then call a in method
		// "seleactionSortAlgo"( at the bottom , this method is expanded
		// which will sort the array from smaller to bigger
		// bigger number. And store in "arr"
		int[] arr = Naz_Algorithm_02_Selection_Sort.seleactionSortAlgo(testArray);

		// again using enhanced for loop to print the new sorted array
		for (int ele : arr) {
			System.out.print(ele + ",");
		}

		System.out.print("\n\n Filling with 13 in index number[3] to [8] Array: ");

		// from index[3] the value will be replaced by 13 till index[8] as index[8]
		// is the 9th element of "arr" array
		java.util.Arrays.fill(arr, 4, 9, 13);
		for (int ele : arr) {
			System.out.print(ele + ",");
		}
		System.out.println();

		// now converting the int array 'arr' into String and printing all the values
		System.out.println(Arrays.toString(arr));

	}// main method

	public static int[] seleactionSortAlgo(int[] array) {

		// In this for loop, first, I store the first index in "minValue" variable
		// as I assume its the minimum value
		// then it goes to the child for loop runs till the condition
		// and comes back again to parent loop to run the parent loop till its
		// condition
		for (int i = 0; i < array.length; i++) {
			int minValue = array[i];
			int minIndex = i;

			// Now, in this for loop it's control goes to the next index (i+1)
			// if the minValue that we get from the parent loop is greater than the
			// array[j] index value then the new minValue is array[j]
			// it checks till the last index of array and gives control back to the
			// parent loop and this process continues until i>= array.length
			for (int j = i + 1; j < array.length; j++) {

				// if the condition is true
				if (minValue > array[j]) {
					// change the minValue into array[j] value
					minValue = array[j];
					// change the minIndex (suppose change minIndex i = j)
					minIndex = j;

				}

			} // end child for loop
				// now if the new minIndex that we get from child loop is not same as "i"
				// then the new index array[i]
			if (minIndex != i) {
				// array[i] will be array[minIndex]
				array[minIndex] = array[i];
				// new minValue will be put in array[i]
				array[i] = minValue;
			}
		} // end parent for loop
			// after organising the array return this new array
		return array;
	} // seleactionSortAlgo method ends

}// class ends
