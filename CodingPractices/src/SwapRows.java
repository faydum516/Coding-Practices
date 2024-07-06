import java.util.Arrays;

public class SwapRows {

	public static void main(String[] args) {
		char[] a = { 'a', 'b', 'c', 'd', 'e' };
		a = swap(a);
		System.out.println(Arrays.toString(a));	
	}
	
	public static char[] swap(char[] row) {
		
		for (int i = 0; i < row.length/2; i++) {
			char temp = row[i];
			row[i] = row[row.length - 1 - i];
			row[row.length - 1 - i] = temp;
		}
		
		return row;
	}
}
