package HospitalReserve;

import java.util.ArrayList;
import java.util.Scanner;

class Reserve{
		String reserveName = null; 		//������ ����
		String gender = null; 			//����
		int phoneNum = 0; 				//��ȭ��ȣ
		int age = 0;					//����
		int dayNum = 0; 				//���೯¥
		String seattype = null; 		//�ڸ�Ÿ��
		
		static ArrayList<Reservelist> rl = new ArrayList<Reservelist>();
		
		public void Seat() { 					//����޼ҵ�
			// ���� - ������ �� �޿� �ִ� �ϼ��θ� ����Ѵ�.
			// - �ڸ��� A��,B�����γ�����,���� 2���� �ڸ��� �ִ�.
			Scanner scanner = new Scanner(System.in);
			
			while(true) { //������ true�� ��� ����ؼ� �ݺ�
				//if/else�� �߰�
				System.out.println("==============================");
				System.out.println("�����Ͻ÷��� ���� ������ �Է����ּ���!");
				System.out.println("���� :");
				String reserveName = scanner.next();
				System.out.println("==============================");
				System.out.println("������ �Է����ּ���! ex) �� / ��");
				System.out.println("���� :");
				String gender = scanner.next();
				System.out.println("==============================");
				System.out.println("-�� ������ ��ȭ��ȣ�� �Է����ּ���!");
				System.out.println("��ȭ��ȣ :");
				int phoneNum = scanner.nextInt(); //int������ ����
				System.out.println("==============================");
				System.out.println("���̸� �Է����ּ���!");
				System.out.println("���� :");
				int age = scanner.nextInt();
				System.out.println("=============================="); //
				System.out.println("�����Ͻ� ������ �������ּ���!");
				System.out.println("1.����뺴�� 2.�ƻ꺴�� 3.��ȭ���뺴��");
				int hospitals = scanner.nextInt();
				//hospitals==1
				//�̺κп��� 1������������ 2������������ 3������������  �ش� �޼ҵ带 ȣ���ϴ��ڵ� ���Է�
				Hospital hospital = new Hospital(); //������ü ����
	//			hospital.snuh(); //����뺴���޼ҵ� ȣ��
				
				//����Է¿Ϸ� �� ����Ʈ�� ����
				rl.add(new Reservelist(reserveName,gender,phoneNum,age,dayNum,seattype));
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				System.out.println(reserveName+"���� ��������"+dayNum+"���Դϴ�");
				System.out.println("");
			}
		}
}
		/*
		public void searchSeat() { //������ȸ �޼ҵ�
			
		}

		public void CancleSeat() { //������� �޼ҵ�
				
		}*/
/*		
	//�¼��� �ڸ��� Ÿ�԰� �Ͽ� �̸��� �ִٸ� ������ڸ��Դϴ�. ���
	if(seats[seattype][dayNum].equals(reserveName)){
		System.out.println("�̹� ����� �ڸ��Դϴ�.�ٽ� �õ����ּ���.");
}
seats[seattype][dayNum] = (reserveName);
break;*/
//System.out.println();
//}
