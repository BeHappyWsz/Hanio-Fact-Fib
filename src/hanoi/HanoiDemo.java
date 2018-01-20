package hanoi;

import java.util.Scanner;
/**
 * ��ŵ��
 * @author wsz
 * @date 2018��1��20��
 */
public class HanoiDemo {

	static int count = 0;
	/**
	 * n=1 a->c
	 * n=2 
	 * 		|�ݹ�(1,a,c,b):a->b(1��) �����ݹ� 
	 *  	|a->c(2��)  
	 *  	|�ݹ�(1,b,a,c):b->c(3��) �����ݹ� 
	 *  	|����
	 * n=3 
	 * 		|�ݹ�(2,a,c,b) ��n=2һ��(������)
	 * 		|a->c(4��)
	 * 		|�ݹ�(2,b,a,c) ��n=2һ��(������)
	 * n=*  �ܴ���n^2-1
	 * @param n ��������
	 * @param a Դλ��
	 * @param b ������
	 * @param c Ŀ����
	 */
	static void hanoi(int n, char a, char b, char c) {
		if(n == 1) {
			System.out.println("��"+(++count)+"�δ�"+a+"��"+c);
		}else {
			hanoi(n-1,a,c,b);  //��a�ϵ�n-1���Ƶ�b
			System.out.println("��"+(++count)+"�δ�"+a+"��"+c); //��a�ϵ����һ���Ƶ�c
			hanoi(n-1,b,a,c);	//��b�ϵ�n-1���Ƶ�c
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��������:");
		int num = input.nextInt();
		hanoi(num,'a','b','c');
		input.close();
	}

}
