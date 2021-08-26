import java.util.ArrayList;
import java.util.Scanner;

import HospitalReserve.Hospital01;

public class Cure {
		ArrayList<Person> treatmentCompletedList = new ArrayList<>();	//��ġ�� ����Ʈ
		ArrayList<Person> antibodyList = new ArrayList<>();				//�׻�?
		ArrayList<Person> deathList = new ArrayList<>();				//����� ����Ʈ
		
		
	public void cureMethod(Scanner scanner){
		System.out.println("������ ������ �Է��ϼ���.");
		String hospital = scanner.nextLine();
		System.out.println("�̸��� �Է��ϼ���.");
		String name = scanner.nextLine();
		System.out.println("�ڵ��� ���ڸ��� �Է��ϼ���.");
		String phoneNum4 = scanner.nextLine();
		
		
		//[�̸��� �޹�ȣ�� �ش� ����(����뺴��) ���ฮ��Ʈ�� ����]
		
		//****�ش纴�����ฮ��Ʈ�� �޾ƿͼ� ���ؾ���
		ArrayList<Person> reserveList = new ArrayList<>();
		
		for (Person person : reserveList) {
			if(person.getName().equals(name) && person.getPhoneNum().substring(9).equals(phoneNum4)) {
				//ġ�������.
				
				int h1vaccin1 = Corona19.h1.getVaccin1();
				int h1vaccin2 = Corona19.h1.getVaccin2();
				int h1vaccinselect = 0;
				int h2vaccin1 = Corona19.h2.getVaccin1();
				int h2vaccin2 = Corona19.h2.getVaccin2();
				int h2vaccinselect = 0;
				int h3vaccin1 = Corona19.h3.getVaccin1();
				int h3vaccin2 = Corona19.h3.getVaccin2();
				int h3vaccinselect = 0;
				
				//�ش纴���� ��� ������ �ҷ��;���(1. �����[1��], 2. ȭ����[2��])
				if(hospital.equals("����뺴��")) {
					System.out.println("ġ�Ḧ �����ϰڽ��ϴ�.");
					System.out.println("����� �����ϼ���.");
					System.out.println("1. �����[" + h1vaccin1 + "], 2. ȭ����["+ h1vaccin2 +"]");
					System.out.println("1 �Ǵ� 2�� �Է��ϼ���");
					h1vaccinselect = Integer.parseInt(scanner.nextLine());
					Corona19.h1.hospitalCure(Corona19.h1, h1vaccinselect);
				}else if(hospital.equals("�ƻ꺴��")) {
					System.out.println("ġ�Ḧ �����ϰڽ��ϴ�.");
					System.out.println("����� �����ϼ���.");
					System.out.println("1. �����[" + h2vaccin1 + "], 2. ȭ����["+ h2vaccin2 +"]");
					System.out.println("1 �Ǵ� 2�� �Է��ϼ���");
					h2vaccinselect = Integer.parseInt(scanner.nextLine());
					Corona19.h1.hospitalCure(Corona19.h2, h2vaccinselect);
				}else if(hospital.equals("��ȭ���뺴��")) {
					System.out.println("ġ�Ḧ �����ϰڽ��ϴ�.");
					System.out.println("����� �����ϼ���.");
					System.out.println("1. �����[" + h3vaccin1 + "], 2. ȭ����["+ h3vaccin2 +"]");
					System.out.println("1 �Ǵ� 2�� �Է��ϼ���");
					h3vaccinselect = Integer.parseInt(scanner.nextLine());
					Corona19.h1.hospitalCure(Corona19.h3, h3vaccinselect);
				}else {
					System.out.println("������ �߸� �����Ͽ����ϴ�.");
					Patient pp = new Patient();
					pp.patientStart();
					break;
				}
				
				
				if(h1vaccinselect==1 || h1vaccinselect == 2 || h2vaccinselect == 1 || h2vaccinselect == 2 || h3vaccinselect == 1 || h3vaccinselect == 2) {
				System.out.println("�ǻ簡 ġ�����Դϴ�.");
				//ġ�����
				int randomNum = (int)(Math.random()*100+1);
				if(randomNum<=10) {
					System.out.println("���ݴ� ���Ѻ��� �� �� �����ϴ�.");
				}else if(randomNum<=90) {
					//Ȯ������ ���
					if(person.confirmed = true) {
						System.out.println("��ġ�Ǿ����ϴ�.");
						person.cure = true;
							//��ġ�ڸ���Ʈ�� �߰�?
						treatmentCompletedList.add(person);
					}else {
						//��Ȯ�����ǰ��
						System.out.println("��ü�� �����Ǿ����ϴ�.");
						 	//��ü���� ����Ʈ�� �߰�?
						antibodyList.add(person);
					}
				}else {
					System.out.println("������ ���� ���ϴ�.");
						//����ڸ���Ʈ�� �߰�?
					deathList.add(person);
				}
				}
				
				
			}
			//���ฮ��Ʈ�� �������
			else {
				System.out.println("�����ڸ�ܿ� �������� �ʽ��ϴ�.");
			}
			Patient pp = new Patient();
			pp.patientStart();
		}
		
	}

}