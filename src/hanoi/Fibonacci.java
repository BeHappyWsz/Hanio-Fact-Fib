package hanoi;

import java.util.Scanner;

/**
 * �Ʋ���������:1+1+2+3+5+8+13+...
 * @author wsz
 * @date 2018��1��20��
 */
public class Fibonacci {

	/**
	 * ��ȡĳһ�±�λ�õ�ֵ
	 * @param n
	 * @return
	 */
	static long fib(long n) {
		if(n <= 2 ) {
			return 1;
		}else {
			return fib(n-1)+fib(n-2); //����֮ǰ2�����ֵ����
		}
	}
	
	/**
	 * �������
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
		System.out.println("��ȡ쳲����������±�λ��:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		long fib = fib(num);	//��ȡ�±�λ�õ�ֵ
		System.out.println(fib);
		System.out.println(fib2(num)); //����������
		input.close();
	}

}
