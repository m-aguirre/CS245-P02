
public class FibonacciIterative implements Fibonacci {

	@Override
	public int fibonacci(int n) {
		if(n <= 2) {
			return 1;
		}
		
		int i = 3;
		int fib1 = 1;
		int fib2 = 2;
		int fibTotal = 2;
		
		while(i < n) {		
			fibTotal = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibTotal;		
			i++;
		}
		return fibTotal;
	}
}
