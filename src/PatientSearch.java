
import java.util.Scanner;

public class PatientSearch {

	PatientSearch() {
		search();
		System.out.println("ȯ�� �˻� �޴��� ���Խ��ϴ�.");
	}

	public void personSearch(String name) {
		System.out.println("personSearch �޼ҵ� ����");
		// Ȯ���� ����Ʈ���� ��ȸ
//		for (Person person : Test.infectionList) {
//			if (name.equals(person.getName())) {
//				System.out.println("�̸� : " + person.getName());
//				System.out.println("Ȯ������ : Ȯ��");
//				System.out.println("���� : " + person.getAge());
//				System.out.println("��ȣ  : " + person.getPhoneNum());
//			}
//		}
//
//		// ġ���� ����Ʈ���� ��ȸ
//		for (Person person : Cure.treatmentCompletedList) {
//			if (name.equals(person.getName())) {
//				System.out.println("�̸� : " + person.getName());
//				System.out.println("Ȯ������ : ��ġ");
//				System.out.println("���� : " + person.getAge());
//				System.out.println("��ȣ  : " + person.getPhoneNum());
//			}
//		}
//
//		// ����� ����Ʈ���� ��ȸ
//		for (Person person : Cure.deathList) {
//			if (name.equals(person.getName())) {
//				System.out.println("�̸� : " + person.getName() + " (���)");
//				System.out.println("���� : " + person.getAge());
//				System.out.println("��ȣ  : " + person.getPhoneNum());
//			}
//		}

		// ��ȸ ����� ���ٸ� �̰� ��� �ؾߵǳ�
		for (Person person1 : Test.infectionList) {
			if (!(name.equals(person1.getName()))) {
				System.out.println("infectionList�� �ش� �̸� ����");
				for (Person person2 : Cure.treatmentCompletedList) {
					if (!(name.equals(person2.getName()))) {

						for (Person person3 : Cure.deathList) {
							if (!(name.equals(person3.getName()))) {
								System.out.println("�˻� ����� �����ϴ�.");
							
							} else {
								System.out.println("�̸� : " + person3.getName() + " (���)");
								System.out.println("���� : " + person3.getAge());
								System.out.println("��ȣ  : " + person3.getPhoneNum());
							}
						}

					} else {
						System.out.println("�̸� : " + person2.getName());
						System.out.println("Ȯ������ : ��ġ");
						System.out.println("���� : " + person2.getAge());
						System.out.println("��ȣ  : " + person2.getPhoneNum());
					}
				}
				
			} else {
				System.out.println("�̸� : " + person1.getName());
				System.out.println("Ȯ������ : Ȯ��");
				System.out.println("���� : " + person1.getAge());
				System.out.println("��ȣ  : " + person1.getPhoneNum());
			}
		}

	}

	public void search() {
		Scanner scanner = new Scanner(System.in);

		String searchname = null;
		System.out.print("�̸��� �Է��ϼ���. : ");
		searchname = scanner.nextLine();

		System.out.println(searchname + "���� �˻���...");
		System.out.println("====== " + searchname + "�� �˻���� ======");
		personSearch(searchname);
		System.out.println("==========================");

		MainSearch mainsearch = new MainSearch();
		mainsearch.start();

	}

}
