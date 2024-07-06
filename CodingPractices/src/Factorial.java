
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (factorial(7) > 1000) System.out.println("YES");
		else System.out.println("NO");
	}
	
	public static long factorial(int n) {
		if (n == 0 || n == 1) return 1;
		else return n * factorial(n - 1);
	}
}
