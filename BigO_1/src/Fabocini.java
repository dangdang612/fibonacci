
public class Fabocini {
	public static void main(String[] args) {
		int number = 8;
		System.out.println("Fibonacci of number is " + fibo(number));
	}

	public static int fibo(int number) {
		int index0 = 0;
		int index1 = 1;
		int indexn = 0;
		for (int i = 0; i < number; i++) {
			if (i < 2) {
				System.out.println(i);
			} else {
				indexn = index0 + index1;
				index0 = index1;
				index1 = indexn;
				System.out.println(indexn);
			}
		}
		return indexn;
	}
}
