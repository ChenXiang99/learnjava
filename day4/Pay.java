package cn.zlxy;

public class Pay {
	public static void main(String[] args) {
		//�б��嵥
		double shoesPrice = 329.9;
		double shirtPrice = 78.5;
		double footBallPrice = 199.0;
		int shoesNum = 2;
		int shirtNum = 5;
		int footBallNum = 1;
		//�����ܶ�
		double sum;
		sum = shoesPrice*shoesNum + shirtPrice*shirtNum + footBallPrice*footBallNum;
		//��ӡСƱ
		System.out.println("-------�����嵥-------");
		System.out.print("��Ʒ\t����\t����\n");
		System.out.printf("%s\t%s\t%d\n","Ь��",shoesPrice,shoesNum);
		System.out.printf("%s\t%s\t%d\n","T��",shirtPrice,shirtNum);
		System.out.printf("%s\t%s\t%d\n","����",footBallPrice,footBallNum);
		System.out.println("--------------------");
		System.out.printf("�ܼ�\t\t%.2f\n",sum);
		System.out.println("��ӭ�ٴι��٣�");		
	}
}
