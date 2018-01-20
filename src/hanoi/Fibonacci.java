package hanoi;

import java.util.Scanner;

/**
 * 菲波那切数列:1+1+2+3+5+8+13+...
 * @author wsz
 * @date 2018年1月20日
 */
public class Fibonacci {

	/**
	 * 获取某一下标位置的值
	 * @param n
	 * @return
	 */
	static long fib(long n) {
		if(n <= 2 ) {
			return 1;
		}else {
			return fib(n-1)+fib(n-2); //返回之前2个数字的求和
		}
	}
	
	/**
	 * 进行求和
	 * @param n
	 * @return
	 */
	static long fib2(long n) {
		int i;
		long res =0L;
		String str = "";
		for(i = 1; i <= n; i++) {
			long fib = fib(i);
			res += fib;
			str += String.valueOf(fib)+"+";
		}
		System.out.println(str.substring(0, str.length()-1)+"="+res);
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println("获取斐波那契数的下标位置:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		long fib = fib(num);	//获取下标位置的值
		System.out.println(fib);
		System.out.println(fib2(num)); //进行求和输出
		input.close();
	}

}
