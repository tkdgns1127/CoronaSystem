import java.util.Scanner;

public class HospitalStart {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//���� ����
		System.out.println("=======================================");
		System.out.println("������ �����ϼ���");
		System.out.println("1.����� ���� 2.�ƻ� ���� 3.��ȭ���� ����");
		System.out.println("=======================================");
		System.out.print("��ȣ �Է� : ");
		
		int num = sc.nextInt();
		if(num == 1) {
			System.out.println();
			LoginTest.loginTest01(Corona19.h1);
		}else if(num == 2) {
			System.out.println();
			LoginTest.loginTest01(Corona19.h2);
		}else {
			System.out.println();
			LoginTest.loginTest01(Corona19.h3);
		}
		
	}

}
