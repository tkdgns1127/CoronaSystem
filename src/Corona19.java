
import java.util.Scanner;


public class Corona19 {
	
	public static Hospital01 h1 = new Hospital01(1111,10,10,"����뺴��");//����뺴��
	public static Hospital01 h2 = new Hospital01(1234,5,9,"�ƻ꺴��");//�ƻ꺴��
	public static Hospital01 h3 = new Hospital01(0000,2,1,"��ȭ���뺴��");//��ȭ���뺴��
	
	
	
	
	public void mainPatientStart() {
		Patient pp = new Patient();
		pp.patientStart();
	}
	public void mainHospitalStart() {
		HospitalStart hs = new HospitalStart();
		hs.start();
	}
	public void mainSearchStart() {
		MainSearch ms = new MainSearch();
		ms.start();
	}
	
	
	public void coronaSystem() {
		
		Corona19 corona = new Corona19();// ȯ�� Ŭ����, ���� Ŭ����, ��ȸ Ŭ���� ��ü ����
		
		Scanner sc = new Scanner(System.in);

		System.out.println("===============================");
		System.out.println("�޴��� �����ϼ���!");
		System.out.println("1.ȯ�� 2.���� 3.��ȸ");
		System.out.println("===============================");
		int num = sc.nextInt();
		if(num == 1) {
			mainPatientStart();
		}else if(num == 2) {
			mainHospitalStart();
		}else {
			mainSearchStart();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Corona19 corona = new Corona19();// ȯ�� Ŭ����, ���� Ŭ����, ��ȸ Ŭ���� ��ü ����
		corona.coronaSystem();
		
		
	}
	
	

}
