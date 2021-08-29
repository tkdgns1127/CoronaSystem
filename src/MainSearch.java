
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainSearch {
	int menu;
	Scanner scanner = new Scanner(System.in);

	public void start() {
		System.out.println("============= 3.��ȸ�޴� =============");
		System.out.println("1.��ü ��Ȳ��   2.ȯ�� �˻�   3.���̺� Ȯ����   4. �ڷΰ���");
		System.out.println("===================================");

		try {
			System.out.print("�޴��� �Է��ϼ���. : ");
			int result = scanner.nextInt();

			if (result == 1) {
				DashBoard dashBoard = new DashBoard();
			} else if (result == 2) {
				PatientSearch patientsearch = new PatientSearch();
			} else if (result == 3) {
				ConfirmedByAge cfba = new ConfirmedByAge();
				cfba.confirmedByAge();
			} else if (result == 4) {
				Corona19 corona19 = new Corona19();
				corona19.coronaSystem();
			} else {
				System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
				start();
			}
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
		}
	}

	public static void main(String[] args) {
		MainSearch mainsearch = new MainSearch();
		mainsearch.start();

	}

}
