import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class Patient {
	Consult consult = new Consult();
	Scanner sc = new Scanner(System.in);
	Test test = new Test();
	Cure cure = new Cure();
	ReserveMain reserve = new ReserveMain();
	
	public void methodAA() {  consult.conusltMethod(sc);;}
	public void methodBB() {test.inputInformation(Consult.coronaTestList);}
	public void methodCC() {reserve.reserveStart();}
	public void methodDD() {cure.cureMethod(sc);}
	
	public static void patientStart() {
		Patient pp = new Patient();	// ���, �˻�, ����, ġ�� ��ü ����
		Corona19 cc = new Corona19();
		Scanner sc = new Scanner(System.in);

		System.out.println("===============================");
		System.out.println("�޴��� �����ϼ���!");
		System.out.println("1.��� 2.�˻� 3.���� 4.ġ�� 5.�ڷΰ���" );
		System.out.println("===============================");
		try {
		
		int num = sc.nextInt();
		if(num == 1) {
			pp.methodAA();
		}else if(num == 2) {
			pp.methodBB();
		}else if(num == 3) {
			pp.methodCC();
		}else if(num == 4) {
			pp.methodDD();
		}else if(num == 5) {
			cc.coronaSystem();
		}else {
			System.out.println("�ٽ� �Է��ϼ���.");
			patientStart();
		}
			
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
			patientStart();
		}
	}
	
	
	
}
