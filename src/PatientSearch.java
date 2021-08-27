
import java.util.Scanner;

public class PatientSearch {
	Scanner scanner = new Scanner(System.in);

	PatientSearch() {
		System.out.println("ȯ�� �˻� �޴��� ���Խ��ϴ�.");
		search();
	}
	
	public void personSearch(String name) {
		//Ȯ���� ����Ʈ���� ��ȸ
		for (Person person : Test.infectionList) {
			if (name.equals(person.getName())) {
				System.out.println("�̸� : " + person.getName());
				System.out.println("Ȯ������ : Ȯ��");
				System.out.println("���� : " + person.getAge());
				System.out.println("��ȣ  : " + person.getPhoneNum());
				System.out.println();
			}
		}
		
		//ġ���� ����Ʈ���� ��ȸ
		for (Person person : Cure.treatmentCompletedList) {
			if (name.equals(person.getName())) {
				System.out.println("�̸� : " + person.getName());
				System.out.println("Ȯ������ : ��ġ");
				System.out.println("���� : " + person.getAge());
				System.out.println("��ȣ  : " + person.getPhoneNum());
				System.out.println();
			}
		}
		
		//����� ����Ʈ���� ��ȸ
		for (Person person : Cure.deathList) {
			if (name.equals(person.getName())) {
				System.out.println("�̸� : " + person.getName() + " (���)");
				System.out.println("���� : " + person.getAge());
				System.out.println("��ȣ : " + person.getPhoneNum());
				System.out.println();
			}
		}
		
		//��ȸ ����� ���ٸ�
		//�̰� ��� �ؾߵǳ�
	}

	public void search() {
		String searchname = null;
		System.out.print("�̸��� �Է��ϼ���. : ");
		searchname = scanner.nextLine();

		System.out.println(searchname + "���� �˻���...");
		System.out.println("====== " +searchname+"�� �˻���� ======");
		personSearch(searchname);
		System.out.println("==========================");
		System.out.println();

		MainSearch mainsearch = new MainSearch();
		mainsearch.start();
		
	}

}
