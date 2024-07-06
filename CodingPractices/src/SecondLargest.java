public class SecondLargest {

	public static void main(String[] args) {
		int[] nums1 = {12, 9, 8, 10, 15};
		int[] nums2 = {11, 19, 8, 10, 15};
		System.out.println(secondLargest(nums1));
		System.out.println(secondLargest(nums2));
	}
	
	public static int secondLargest(int[] arr) {
		int largest = 0, secondLargest = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		
		return secondLargest;
	}

}
