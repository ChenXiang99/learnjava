package cn.zlxy;
import java.util.Scanner;

public class CardNum {
	public static void main(String[] args) {
		System.out.println("����/Ůʿ�����������Ŀ���(4λ)��");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int amount = number;
		int sum = 0;
		for (int i=0; i<4; i++) {
			sum += amount%10;
			amount /= 10;	
		}
		input.close();
		System.out.println("�������п���λ�� "+number+"\t��λ֮��λ�� "+sum);
	}
}
