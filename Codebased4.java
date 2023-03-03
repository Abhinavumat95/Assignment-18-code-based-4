package Assignment_18CodeBased_4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Codebased4 {

	void search(int array[], int b) {

		// Search an Element in an Array
		boolean t = false;
		for (int a : array) {
			if (a == b) {
				t = true;
				break;
			}
		}
		if (t == true) {
			System.out.println("Element " + b + " is present");
		} else {
			System.out.println("Element " + b + " is not present");
		}
	}

	void largestElement(int array[]) {

		// Find the Largest Element in an Array
		int l = array.length;
		Arrays.sort(array);
		System.out.println("Largest element in this array = " + array[l - 1]);

	}

	void sortArray(int array[]) {

		// Sort an Array
		Arrays.sort(array);
		System.out.println("Sorted array = " + Arrays.toString(array));

	}

	void sortDesc(int array[]) {

		// Sort the Elements of an Array in Descending Order

		int l = array.length;

		for (int i = 0; i < l / 2; i++) {

			int t = array[i];
			array[i] = array[l - i - 1];
			array[l - i - 1] = t;
		}

		System.out.println("Array in Descending Order = " + Arrays.toString(array));

	}

	void sortAsc(int array[]) {

		// Sort the Elements of an Array in Ascending Order
		int t = 0;
		int l = array.length;

		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (array[i] > array[j]) {
					t = array[i];
					array[i] = array[j];
					array[j] = t;
				}
			}
		}

		System.out.println("Array in Ascending Order = " + Arrays.toString(array));
	}

	void removeDuplicate(int array[]) {

		// Remove Duplicate Elements From an Array
		HashMap<Integer, Boolean> mp = new HashMap<>();
		int l = array.length;

		System.out.println("Array after removing duplicate elements:");
		for (int i = 0; i < l; ++i) {

			if (mp.get(array[i]) == null) {
				System.out.print(array[i] + " ");
				mp.put(array[i], true);
			}
		}
	}

	void mergeArrays(int a[], int b[]) {

		// Merge Two Arrays
		int la = a.length;
		int lb = b.length;

		int c[] = new int[la + lb];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < la) {
			c[k++] = a[i++];
		}

		while (j < lb) {
			c[k++] = b[j++];
		}

		System.out.println("Merged array = " + Arrays.toString(c));
	}

	void equalArray(int a[], int b[]) {

		// Check if Two Arrays Are Equal or Not
		boolean result = Arrays.equals(a, b);

		if (result == true) {
			System.out.println("Two arrays are Equal");
		} else {
			System.out.println("Two arrays are not Equal");
		}
	}

	void removeOccurence(int array[], int a) {

		// Remove All Occurrences of an Element in an Array
		int index = 0;
		for (int i = 0; i < array.length; i++)
			if (array[i] != a)
				array[index++] = array[i];

		System.out.println("Array after removing occurence of " + a + " = " + Arrays.toString(array));
	}

	void findCommonElements(int a[], int b[]) {

		// Find Common Array Elements

		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();

		for (int i : a) {
			s1.add(i);
		}

		for (int j : b) {
			s2.add(j);
		}

		s1.retainAll(s2);
		System.out.println("Common elements between " + Arrays.toString(a) + " and " + Arrays.toString(b) + " = " + s1);
	}

	void copyElements(int a[]) {

		// Copy All the Elements of One Array to Another Array

		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		System.out.println("Elements of original array = " + Arrays.toString(a));

		System.out.println("Elements of new array = " + Arrays.toString(b));
	}

	void arrayRotation(int array[], int d) {

		// Array Rotation
		int l = array.length;
		int p = 1;
		while (p <= d) {
			int last = array[0];
			for (int i = 0; i < l - 1; i++) {
				array[i] = array[i + 1];
			}
			array[l - 1] = last;
			p++;
		}

		System.out.println(
				"Array after rotating elements to the left by " + d + " positions = " + Arrays.toString(array));
	}
}
