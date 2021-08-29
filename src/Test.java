import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {

	String inputName;
	String inputPhoneNumber;
	public static ArrayList<Person> infectionList = new ArrayList<>();

	void inputInformation(ArrayList<Person> arr) {
		Scanner scanner = new Scanner(System.in);
		boolean checkReservation = false;

		// ���� ó��

		try {
			while (!checkReservation) {

				System.out.println("�̸��� �Է����ּ���.");
				inputName = scanner.nextLine();

				System.out.println("��ȭ��ȣ ���ڸ��� �Է����ּ���.");
				inputPhoneNumber = scanner.nextLine();

				// inputName�� �ѱ�, ������ ���ԵǾ��ִ��� üũ�ϴ� ����ǥ����
				String pattern1 = "^[��-�Ra-zA-Z]*$";

				// inputName ���� �Էµ��� �ʾ�����?

				if (inputName.equals("")) {

					System.out.println("�̸��� �Էµ��� �ʾҽ��ϴ�. �ٽ� Ȯ�����ּ���.");
					continue;

					// inputName �Է°��� ���̰� 2���� �۰ų�, Ư�����ڰ� ���ԵǾ��� ��
				} else if (inputName.length() < 2 || !Pattern.matches(pattern1, inputName)) {
					System.out.println("�ùٸ� �̸� ������ �ƴմϴ�. �ٽ� Ȯ�����ּ���.");
					continue;
				}

				// inputPhoneNumber ���ڸ� ���ԵǾ��ִ��� üũ�ϴ� ����ǥ����
				String pattern2 = "^[0-9]*$";

				// ���� �Էµ��� �ʾ�����?

				if (inputPhoneNumber.equals("")) {

					System.out.println("��ȣ�� �Էµ��� �ʾҽ��ϴ�. �ٽ� Ȯ�����ּ���.");
					continue;

					// inputPhoneNumber �Է°��� ���̰� 4�� �ƴϰŰų�, ���ڰ� �ƴҶ�
				} else if (inputPhoneNumber.length() != 4 || !Pattern.matches(pattern2, inputPhoneNumber)) {
					System.out.println("�ùٸ� ��ȣ ������ �ƴմϴ�. �ٽ� Ȯ�����ּ���.");
					continue;
				}

				// ������ ����Ʈ�� �Է°��� ��
				boolean correct = false;
				Person reservedPerson = null;

				for (Person person : arr) {

					String fullNum = person.phoneNum;
					String lastNum = fullNum.substring(9);

					if (inputName.equals(person.name) && lastNum.equals(inputPhoneNumber)) {
						correct = true;
						reservedPerson = person;
						break;
					}
				}

				if (correct) {
					checkReservation = true;
					randomTest(reservedPerson);
				} else {
					System.out.println("��ġ�ϴ� ������ �����ϴ�.");
					Patient.patientStart();
				}
			}
			;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("������ �߻��Ͽ����ϴ�. �ٽ� �ۼ����ּ���.");
			Patient.patientStart();

		} finally {
			scanner.close();
		}
	}

	ArrayList<Person> randomTest(Person person) {

		System.out.println("Corona19 �˻縦 �����մϴ�.");

		Random random = new Random();
		person.confirmed = (random.nextInt(4) != 0);

		if (person.confirmed) {
			infectionList.add(person);
			System.out.println("Corona19 �˻� ��� [�缺] �Դϴ�.");
		} else {
			System.out.println("Corona19 �˻� ��� [����] �Դϴ�.");
		}

		/*
		 * infectionList ��� (name) - Ȯ�ο� for (Person p : infectionList) {
		 * System.out.println("infectionList: " + p.getName()); }
		 */

		Patient.patientStart();

		return infectionList;
	}
} //
