package HospitalReserve;
import java.util.Scanner;

class Hospital_Ref {

	String name;
	int v1; //ȭ����
	int v2; //�����
	
	public static Supplyer supplyer = new Supplyer(); // static r
	
	public Hospital_Ref(String name, int v1, int Hospital_Ref) {
		this.name = name;
		this.v1 = v1;
		this.v2 = v2;
	}
	// 1. ��� ��ȸ
	public void search( ) {
		
		System.out.println("=================================");
		System.out.println(name);
		System.out.println();
		System.out.print("ȭ���� : " + v1);
		System.out.println(", ����� : " + v2);
		System.out.println("=================================");		
	}
	// 2. ��� ����	
	public void request(Hospital_Ref hospital, int inputV1, int inputV2) {
		
		search();
		
		if ((inputV1 <= supplyer.sv1) && (inputV2 <= supplyer.sv2)){
			supplyer.supply(hospital, inputV1, inputV2);
			System.out.println("ȭ���� " + inputV1 + "���� " +  "����� " + inputV2 + "���� �ֹ��Ǿ����ϴ�.");
			System.out.println("���� " + name + "�� ȭ���� " + v1 + "���� " +  "����� " + v2 + "���� ������ �ֽ��ϴ�.");
		} else if((inputV1 > supplyer.sv1) && (inputV2 > supplyer.sv2)) {
			System.out.println("ȭ���� �� ������� ������ �����մϴ�.");
			System.out.println("���� �ֹ� ������ ȭ���� ���� : " + supplyer.sv1 + " / ����� ���� : " + supplyer.sv2);
		} else if (inputV1 > supplyer.sv1) {
			System.out.println("ȭ������ ������ �����մϴ�. ���� �ֹ� ������ ȭ���� ���� : " + supplyer.sv1);
		} else if(inputV2 > supplyer.sv2) {
			System.out.println("������� ������ �����մϴ�. ���� �ֹ� ������ ����� ���� : " + supplyer.sv2); 
		}
	}
		
	public void add(int inputV1, int inputV2) {
		
		this.v1 += inputV1;
		this.v2 += inputV2;	
	}
}

class Supplyer {
	
	int sv1 = 100; //�����ڰ� ���� ȭ����
	int sv2 = 100; //�����ڰ� ���� �����
	
	public void supply(Hospital_Ref hospital, int inputV1, int inputV2) {
		sv1 -=  inputV1;
		sv2 -=	inputV2;
		
		hospital.add(inputV1, inputV2);
	}
};

// ��� ��ȸ, ��� ���� �׽�Ʈ  (�׽�Ʈ��)
//public class Test {
//	
//	public static void main(String[] args) {
//		Hospital_Ref h1 = new Hospital_Ref("����뺴��", 20, 30);
//		Hospital_Ref h2 = new Hospital_Ref("�ƻ꺴��", 40, 50);
//		Hospital_Ref h3 = new Hospital("��ȭ���뺴��", 46, 57);
//		
//		h1.search();
//		h1.request(h1, 5, 6);
//		h1.request(h1, 100, 100);
//		
//		
//	}
//}