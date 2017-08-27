
public class FactorialIterative implements Factorial{

	@Override
	public int factorial(int n) {
		int total = n;
		while(n > 1) {
			total = total * (n - 1);
			n--;
		}
		return total;
	}

}
