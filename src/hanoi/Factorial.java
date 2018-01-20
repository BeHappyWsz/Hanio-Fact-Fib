package hanoi;

import java.util.Scanner;

/**
 * 递归阶乘 n! = n*(n-1)*(n-2)*(n-3)*...*2*1
 * @author wsz
 * @date 2018年1月20日
 */
public class Factorial {

	/**
	 * 递归解决
	 * @param n
	 * @return
	 */
	static long fact(long n) {
		if(n <= 1) {
			print(n);
			return 1;
		}else {
			print(n);
			return n*fact(n-1);
		}
	}
	
	/**
	 * 循环解决
	 * @param n
	 */
	static long fact2(long n) {
		int i;
		long res =1L;
		for(i = 1; i <= n; i++) {
			res *= i;
		}
		return res;
	}
	
	static void print(long n) {
		if(n <= 1)
			System.out.print(n);
		else
			System.out.print(n+"*");
	}
	
	public static void main(String[] args) {
		System.out.println("输入需要阶乘的数字:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		long fact = fact(num);
		
		System.out.println("");
		System.out.println(fact);
		System.out.println(fact2(num));
		input.close();
	}

}
