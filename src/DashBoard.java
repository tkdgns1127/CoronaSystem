
import java.util.ArrayList;
import java.util.Scanner;

import Persons.Person;

public class DashBoard {

	Scanner scanner = new Scanner(System.in);

	public DashBoard() {
		dashboardstart();
	}

	public void dashboardstart() {
		System.out.println("-------��ü ��Ȳ��----------");
		System.out.println("���� Ȯ���� �� : " + Test.infectionList.size() + "��"); // Ȯ���� ����Ʈ ��ȸ
		System.out.println("�˻� ������ �� : " + Consult.coronaTestList.size() + "��"); // �˻� ����Ʈ ��ȸ
		System.out.println("���� Ȯ���� �� : " + (Test.infectionList.size() + Cure.treatmentCompletedList.size()) + "��"); // Ȯ����
																													// ����Ʈ
																													// +
																													// ġ����
																													// ����Ʈ
		System.out.println("���� ��ġ�� �� : " + Cure.treatmentCompletedList.size() + "��"); // ġ���� ����Ʈ
		System.out.println("���� ����� �� : " + Cure.deathList.size() + "��"); // ����� ����Ʈ
		System.out.println("��� ������ �� : "
				+ (Cure.treatmentCompletedList.size() + Cure.antibodyList.size() + Cure.deathList.size()) + "��"); // ġ����
																													// ����Ʈ
																													// +
																													// ��ü����
																													// ����Ʈ
																													// +
																													// �����
																													// ����Ʈ
//		System.out.println("��Ȯ���� �� : " + "��");   //���ġ�Ῡ�ΰ� ���λ��(Boolean Cure = true)�� ����� Ȯ���� ����Ʈ�� ��

		MainSearch mainsearch = new MainSearch();
		mainsearch.start();

	}

	/*
	 * public void backmenu() {
	 * 
	 * System.out.println("�ڷ� ���ðڽ��ϱ�? y/n "); char input = scanner.next().charAt(0);
	 * if(input == 'y') { MainSearch mainsearch = new MainSearch();
	 * mainsearch.start(); }else if(input == 'n') { //system.out.println }else {
	 * System.out.println("�ٽ� �Է����ּ���."); } }
	 */

}
