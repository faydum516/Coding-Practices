public class IsPrime {

	public static void main(String[] args) {
		System.out.println(isPrime(53));
		System.out.println(isPrime(54));
		System.out.println(isPrime(49));
		System.out.println(isPrime(47));
		System.out.println(isPrime(24));
	}
	
	public static boolean isPrime(int num) {
		
		double sqrt = Math.sqrt(num);
		
		for (int i = 2; i <= sqrt; i++) {
			if (num % i == 0) return false;
		}
		
		return true;
	}
}
