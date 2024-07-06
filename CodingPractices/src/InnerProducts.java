import java.util.Scanner;

public class InnerProducts {

	public static void main(String[] args) {
		// declare 2 arrays called array1 and array2 of 5 doubles each
		double[] arr1 = new double[5];
		double[] arr2 = new double[5];

		// read from the keyboard the values of each element of the arrays
		Scanner key = new Scanner(System.in);
		System.out.println("Enter all 10 doubles?");
		
		for (int i = 0; i < 5; i++) {
			double n1 = key.nextDouble();
			arr1[i] = n1;
			double n2 = key.nextDouble();
			arr2[i] = n2;
		}

		// call the static method innerProduct (that you will define below)
		// and display the result
		System.out.println(innerProducts(arr1, arr2));
		key.close();
	}
	
	public static double innerProducts(double[] arr1, double[] arr2) {
		double product = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			product += arr1[i] * arr2[i];
		}
		
		return product;
	}
}
