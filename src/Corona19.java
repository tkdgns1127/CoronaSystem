
import java.util.Scanner;

import HospitalReserve.Hospital01;

public class Corona19 {
	
	public static Hospital01 h1 = new Hospital01(10,10);//����뺴��
	public static Hospital01 h2 = new Hospital01(5,9);//�ƻ꺴��
	public static Hospital01 h3 = new Hospital01(2,1);//��ȭ���뺴��
	
	
	
	
	public void methodA() {Patient pp = new Patient();
	pp.patientStart();};
	public void methodB() {System.out.println("���� ���α׷� ����");};
	public void methodC() {System.out.println("��ȸ ���α׷� ����");};
	
	
	public void coronaSystem() {
		
		Corona19 corona = new Corona19();// ȯ�� Ŭ����, ���� Ŭ����, ��ȸ Ŭ���� ��ü ����
		
		Scanner sc = new Scanner(System.in);

		System.out.println("===============================");
		System.out.println("�޴��� �����ϼ���!");
		System.out.println("1.ȯ�� 2.���� 3.��ȸ");
		System.out.println("===============================");
		int num = sc.nextInt();
		if(num == 1) {
			methodA();
		}else if(num == 2) {
			methodB();
		}else {
			methodC();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Corona19 corona = new Corona19();// ȯ�� Ŭ����, ���� Ŭ����, ��ȸ Ŭ���� ��ü ����
		corona.coronaSystem();
		
		
	}

}
