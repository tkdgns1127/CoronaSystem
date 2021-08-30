
import java.util.InputMismatchException;
import java.util.Scanner;

public class Corona19 {

	public static Hospital01 h1 = new Hospital01(1111, 10, 10, "����뺴��");// ����뺴��
	public static Hospital01 h2 = new Hospital01(1234, 5, 9, "�ƻ꺴��");// �ƻ꺴��
	public static Hospital01 h3 = new Hospital01(0000, 2, 1, "��ȭ���뺴��");// ��ȭ���뺴��

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
		try {
			int num = sc.nextInt();
			if (num == 1) {
				mainPatientStart();
			} else if (num == 2) {
				mainHospitalStart();
			} else if (num == 3) {
				mainSearchStart();
			} else
				System.out.println("���ڸ� �ٽ� �Է��ϼ���.");
			coronaSystem();
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
			sc = new Scanner(System.in);
			coronaSystem();
		}

	}

	public static void main(String[] args) {

		// ������ �Է�
		Test.infectionList.add(new Person("�ڻ���", 25, "010-7926-7460", true));
		Test.infectionList.add(new Person("������", 45, "010-7925-7471", true));
		Test.infectionList.add(new Person("�ڰ���", 46, "010-7924-7472", true));
		Test.infectionList.add(new Person("������", 29, "010-7923-7473", true));
		Test.infectionList.add(new Person("��ȭ��", 78, "010-7922-7474", true));
		Test.infectionList.add(new Person("�赵��", 30, "010-7921-7475", true));
		Test.infectionList.add(new Person("�̱���", 38, "010-7920-7476", true));
		Test.infectionList.add(new Person("���Ѿ�", 19, "010-7919-7477", true));
		Test.infectionList.add(new Person("ȭ����", 61, "010-1127-7478", true));

		Cure.treatmentCompletedList.add(new Person("������", 25, "010-8000-1234", true));
		Corona19 corona = new Corona19();// ȯ�� Ŭ����, ���� Ŭ����, ��ȸ Ŭ���� ��ü ����
		corona.coronaSystem();

	}

}
