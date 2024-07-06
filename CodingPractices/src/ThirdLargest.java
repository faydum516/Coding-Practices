
public class ThirdLargest {

	public static void main(String[] args) {
		int[] nums1 = {12, 9, 8, 10, 15};
		int[] nums2 = {11, 19, 8, 10, 15};
		int[] nums3 = {12, 19, 8, 12, 16};
		int[] nums4 = {12, 19, 8, 20, 16};
		System.out.println(thirdLargest(nums1));
		System.out.println(thirdLargest(nums2));
		System.out.println(thirdLargest(nums3));
		System.out.println(thirdLargest(nums4));
	}
	
	public static int thirdLargest(int[] arr) {
		int largest = 0, secondLargest = 0, thirdLargest = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = arr[i];
			}
			else if (arr[i] > secondLargest && arr[i] != largest) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
			}
			else if (arr[i] > thirdLargest && arr[i] != secondLargest) {
				thirdLargest = arr[i];
			}
		}
		
		return thirdLargest;
	}


}
