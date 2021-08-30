
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Patient {
	Consult consult = new Consult();
	Scanner sc = new Scanner(System.in);
	Test test = new Test();
	Cure cure = new Cure();
	ReserveMain reserve = new ReserveMain();

	public void startConsult() {
		consult.conusltMethod(sc);
		;
	}

	public void startTest() {
		test.inputInformation(Consult.coronaTestList);
	}

	public void startReserve() {
		reserve.reserveStart();
	}

	public void startCure() {
		cure.cureMethod();
	}

	public static void patientStart() {
		Patient patient = new Patient(); // ���, �˻�, ����, ġ�� ��ü ����
		Corona19 corona = new Corona19();
		Scanner sc = new Scanner(System.in);

		System.out.println("===============================");
		System.out.println("�޴��� �����ϼ���!");
		System.out.println("1.��� 2.�˻� 3.���� 4.ġ�� 5.�ڷΰ���");
		System.out.println("===============================");
		try {

			int num = sc.nextInt();
			if (num == 1) {
				patient.startConsult();
			} else if (num == 2) {
				patient.startTest();
			} else if (num == 3) {
				patient.startReserve();
			} else if (num == 4) {
				Cure cure = new Cure();
				cure.cureMethod();
				//patient.startCure();
			} else if (num == 5) {
				corona.coronaSystem();
			} else {
				System.out.println("�ٽ� �Է��ϼ���.");
				patientStart();
			}

		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
			sc = new Scanner(System.in);
			patientStart();
		}
	}

}
