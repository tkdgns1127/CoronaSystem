import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Cure {
	public static ArrayList<Person> treatmentCompletedList = new ArrayList<>(); // ��ġ�� ����Ʈ
	public static ArrayList<Person> antibodyList = new ArrayList<>(); // �׻�?
	public static ArrayList<Person> deathList = new ArrayList<>(); // ����� ����Ʈ
	
	public void res_check(Hospital01 hospital01, String name, String phoneNum4) {
		Cure cure = new Cure();
		Scanner scanner = new Scanner(System.in);
		//ArrayList<Person> reservelist = new ArrayList<>();
		boolean tf = true;

		if (hospital01.rl.size() == 0) {
			System.out.println("�����ڸ�ܿ� �������� �ʽ��ϴ�.");
			System.out.println("���ฮ��Ʈ 0��");
			Patient.patientStart();

		}

		for (Reservelist reservelist : hospital01.rl) {

			//System.out.println( reservelist.getName()+ " " +  reservelist.getPhoneNum().substring(9));
			
			if ( reservelist.getName().equals(name) &&  reservelist.getPhoneNum().substring(9).equals(phoneNum4)) {
				// ġ�������.
				tf = false;

				int h1vaccin1 = Corona19.h1.getVaccin1();
				int h1vaccin2 = Corona19.h1.getVaccin2();
				int h1vaccinselect = 0;
				int h2vaccin1 = Corona19.h2.getVaccin1();
				int h2vaccin2 = Corona19.h2.getVaccin2();
				int h2vaccinselect = 0;
				int h3vaccin1 = Corona19.h3.getVaccin1();
				int h3vaccin2 = Corona19.h3.getVaccin2();
				int h3vaccinselect = 0;

				// �ش纴���� ��� ������ �ҷ��;���(1. �����[1��], 2. ȭ����[2��])
				if (hospital01.name.equals("����뺴��")) {
					System.out.println("ġ�Ḧ �����ϰڽ��ϴ�.");
					System.out.println("����� �����ϼ���.");
					System.out.println("1. �����[" + h1vaccin1 + "], 2. ȭ����[" + h1vaccin2 + "]");
					System.out.println("1 �Ǵ� 2�� �Է��ϼ���");
					h1vaccinselect = Integer.parseInt(scanner.nextLine());
					Corona19.h1.hospitalCure(Corona19.h1, h1vaccinselect);
				} else if (hospital01.name.equals("�ƻ꺴��")) {
					System.out.println("ġ�Ḧ �����ϰڽ��ϴ�.");
					System.out.println("����� �����ϼ���.");
					System.out.println("1. �����[" + h2vaccin1 + "], 2. ȭ����[" + h2vaccin2 + "]");
					System.out.println("1 �Ǵ� 2�� �Է��ϼ���");
					h2vaccinselect = Integer.parseInt(scanner.nextLine());
					Corona19.h1.hospitalCure(Corona19.h2, h2vaccinselect);
				} else if (hospital01.name.equals("��ȭ���뺴��")) {
					System.out.println("ġ�Ḧ �����ϰڽ��ϴ�.");
					System.out.println("����� �����ϼ���.");
					System.out.println("1. �����[" + h3vaccin1 + "], 2. ȭ����[" + h3vaccin2 + "]");
					System.out.println("1 �Ǵ� 2�� �Է��ϼ���");
					h3vaccinselect = Integer.parseInt(scanner.nextLine());
					Corona19.h1.hospitalCure(Corona19.h3, h3vaccinselect);
				} else {
					System.out.println("������ �߸� �����Ͽ����ϴ�.");
					Patient pp = new Patient();
					pp.patientStart();
					break;
				}

				if (h1vaccinselect == 1 || h1vaccinselect == 2 || h2vaccinselect == 1 || h2vaccinselect == 2
						|| h3vaccinselect == 1 || h3vaccinselect == 2) {
					System.out.println("�ǻ簡 ġ�����Դϴ�.");
					// ġ�����
					int randomNum = (int) (Math.random() * 100 + 1);
					if (randomNum <= 10) {
						System.out.println("���ݴ� ���Ѻ��� �� �� �����ϴ�.");
					} else if (randomNum <= 90) {
						// Ȯ������ ���
						if ( reservelist.confirmed == true) {
							System.out.println("��ġ�Ǿ����ϴ�.");
							 reservelist.cure = true;
							// ��ġ�ڸ���Ʈ�� �߰�?
							treatmentCompletedList.add( reservelist);
							hospital01.rl.remove( reservelist);
						} else {
							// ��Ȯ�����ǰ��
							System.out.println("��ü�� �����Ǿ����ϴ�.");
							// ��ü���� ����Ʈ�� �߰�?
							hospital01.rl.remove( reservelist);
							antibodyList.add( reservelist);
						}
					} else {
						System.out.println("������ ���� ���ϴ�.");
						// ����ڸ���Ʈ�� �߰�?
						hospital01.rl.remove( reservelist);
						deathList.add( reservelist);
					}
				}
				Patient.patientStart();

			}
			
	

		}
		// ���ฮ��Ʈ�� �������
		if(tf) {
			System.out.println("�����ڸ�ܿ� �������� �ʽ��ϴ�.");
			Patient.patientStart();
		}

	}

	public void cureMethod() {
		Scanner scanner = new Scanner(System.in);
		Cure cure = new Cure();

		System.out.println("������ ������ �Է����ּ���.");
		String hospital = scanner.nextLine();
		if ((hospital.equals(Corona19.h1.name)) || (hospital.equals(Corona19.h2.name))
				|| (hospital.equals(Corona19.h3.name))) {

			System.out.println("�̸��� �Է��ϼ���.");
			String name = scanner.nextLine();
			System.out.println("�ڵ��� �޹�ȣ 4�ڸ��� �Է��ϼ���.");
			String phoneNum4 = scanner.nextLine();

			// inputPhoneNumber ���ڸ� ���ԵǾ��ִ��� üũ�ϴ� ����ǥ����
			String pattern2 = "^[0-9]*$";

			// ���� �Էµ��� �ʾ�����?

			if (phoneNum4.equals("")) {

				System.out.println("��ȣ�� �Էµ��� �ʾҽ��ϴ�. �ٽ� Ȯ�����ּ���.");

				// inputPhoneNumber �Է°��� ���̰� 4�� �ƴϰŰų�, ���ڰ� �ƴҶ�
			} else if (phoneNum4.length() != 4 || !Pattern.matches(pattern2, phoneNum4)) {
				System.out.println("�ùٸ� ��ȣ ������ �ƴմϴ�. �ٽ� Ȯ�����ּ���.");
				cure.cureMethod();

			} else {

				if (hospital.equals(Corona19.h1.name)) {
					cure.res_check(Corona19.h1, name, phoneNum4);
				} else if (hospital.equals(Corona19.h2.name)) {
					cure.res_check(Corona19.h2, name, phoneNum4);
				} else if (hospital.equals(Corona19.h3.name)) {
					cure.res_check(Corona19.h3, name, phoneNum4);
				}
			}
		} else {
			System.out.println("������ �߸� �����Ͽ����ϴ�.");
			cure.cureMethod();
		}

		// [�̸��� �޹�ȣ�� �ش� ����(����뺴��) ���ฮ��Ʈ�� ����]

	}

}