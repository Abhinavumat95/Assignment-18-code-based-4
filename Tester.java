package Assignment_18CodeBased_4;

public class Tester {

	public static void main(String[] args) {
		
		Codebased4 c = new Codebased4();
		int array[] = { 5, 8, 3, 45, 28 };
		c.search(array, 28);
		c.search(array, 55);
		
		System.out.println("::::::::::::::::::::");
		c.largestElement(array);
		
		System.out.println("::::::::::::::::::::");
		c.sortArray(array);
		
		System.out.println("::::::::::::::::::::");
		c.sortDesc(array);
		
		System.out.println("::::::::::::::::::::");
		c.sortAsc(array);
		
		System.out.println("::::::::::::::::::::");
		int array1[] = {1, 3, 4, 3, 45, 64, 1, 24, 87};
		c.removeDuplicate(array1);
		
		System.out.println("::::::::::::::::::::");
		c.mergeArrays(array, array1);
		
		System.out.println("::::::::::::::::::::");
		c.equalArray(array, array1);
		int array2[] = array;
		c.equalArray(array, array2);
		
		System.out.println("::::::::::::::::::::");
		c.removeOccurence(array1, 3);
		
		System.out.println("::::::::::::::::::::");
		c.findCommonElements(array, array1);
		
		System.out.println("::::::::::::::::::::");
		c.copyElements(array2);
		
		System.out.println("::::::::::::::::::::");
		c.arrayRotation(array2, 4);
	}

}
