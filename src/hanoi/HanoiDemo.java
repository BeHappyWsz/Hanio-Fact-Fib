package hanoi;

import java.util.Scanner;
/**
 * 汉诺塔
 * @author wsz
 * @date 2018年1月20日
 */
public class HanoiDemo {

	static int count = 0;
	/**
	 * n=1 a->c
	 * n=2 
	 * 		|递归(1,a,c,b):a->b(1次) 结束递归 
	 *  	|a->c(2次)  
	 *  	|递归(1,b,a,c):b->c(3次) 结束递归 
	 *  	|结束
	 * n=3 
	 * 		|递归(2,a,c,b) 与n=2一致(共三次)
	 * 		|a->c(4次)
	 * 		|递归(2,b,a,c) 与n=2一致(共三次)
	 * n=*  总次数n^2-1
	 * @param n 盘子数量
	 * @param a 源位座
	 * @param b 辅助座
	 * @param c 目标座
	 */
	static void hanoi(int n, char a, char b, char c) {
		if(n == 1) {
			System.out.println("第"+(++count)+"次从"+a+"到"+c);
		}else {
			hanoi(n-1,a,c,b);  //将a上的n-1个移到b
			System.out.println("第"+(++count)+"次从"+a+"到"+c); //将a上的最后一个移到c
			hanoi(n-1,b,a,c);	//将b上的n-1个移到c
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入数量:");
		int num = input.nextInt();
		hanoi(num,'a','b','c');
		input.close();
	}

}
