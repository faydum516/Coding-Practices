import java.util.Arrays;

public class SortItUp {

	public static void main(String[] args) {
		int[] nums1 = {4, 2, 3, 5, 1, 9, 3};
		System.out.println(Arrays.toString(sort(nums1)));
	}
	
	public static int[] sort(int[] nums) {
		
		/*for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] > nums[i]) {
				int temp = nums[i - 1];
				nums[i - 1] = nums[i];
				nums[i] = temp;
				i = 0;
			}
		}*/
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length - i; j++) {
				if (nums[j - 1] > nums[j]) {
					int temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}
}
