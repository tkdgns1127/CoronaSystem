

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

class Reserve{
		String reserveName = null; 		//������ ����
		String gender = null; 			//����
		int phoneNum = 0; 				//��ȭ��ȣ
		int age = 0;					//����
		String dayNum = null; 				//���೯¥
		String seattype = null; 		//�ڸ�Ÿ��
		ReserveMain rr = new ReserveMain();
		Scanner scanner = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		int pre_month = calendar.get(Calendar.MONTH)+1;
		
		
		public void resreve(Hospital01 hospital) {
			Corona19.h1.month.calendar(calendar.get(Calendar.MONTH)+1);
		
		
			//�Է� ���� �ϼ��� ���� ���� Ķ������ �ϼ��� ã�� 
			//�� �ϼ��� positive�� true���� Ȯ�� �� true��� false�� �ٲٰ� ������ ���� 
			//false��� ���� �Ұ���

			//day.substring(3);	//�Է¹��� �ϼ�
			System.out.println("�����Ͻ� ��¥�� �Է��ϼ��� : ��)08/25");
			scanner.nextLine();
			String res_day = scanner.nextLine();
			//Day day : rr.h1.month.day
			for (int i = 0; i<Corona19.h1.month.day.size(); i++) {
			
				if(hospital.month.day.get(i).getDay().equals(res_day.substring(3))){
					if(hospital.month.day.get(i).isRes_possibility()) {
					
						hospital.month.day.get(i).setRes_possibility(false);
						//����Է¿Ϸ� �� ����Ʈ�� ����
						dayNum = res_day;
					
						hospital.rl.add(new Reservelist(reserveName,gender,phoneNum,age,dayNum,seattype));
						System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						System.out.println(reserveName+"���� �������� " + dayNum + " ���Դϴ�");
						System.out.println("");
						System.out.println("�޴��� �̵��ϰڽ��ϴ�.");
						rr.reserveStart();

					
					}else {
						System.out.println("���� ������ ��¥�� ��� �ּ���");
					}
				}
			}
		}
		

		
		//static ArrayList<Reservelist> rl = new ArrayList<Reservelist>();
		
		public void Seat() { 					//����޼ҵ�
			// ���� - ������ �� �޿� �ִ� �ϼ��θ� ����Ѵ�.
			// - �ڸ��� A��,B�����γ�����,���� 2���� �ڸ��� �ִ�.
			
			
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
				System.out.println();
				
				//���� ����	[1.����뺴�� 2.�ƻ꺴�� 3.��ȭ���뺴��]
				if(hospitals == 1) {
					System.out.println("����뺴���� �����ϼ̽��ϴ�.");
					
					
					
					
	
					//�Է� ���� �ϼ��� ���� ���� Ķ������ �ϼ��� ã�� 
					//�� �ϼ��� positive�� true���� Ȯ�� �� true��� false�� �ٲٰ� ������ ���� 
					//false��� ���� �Ұ���
	
					//day.substring(3);	//�Է¹��� �ϼ�
					System.out.println("�����Ͻ� ��¥�� �Է��ϼ��� : ��)08/25");
					scanner.nextLine();
					String res_day = scanner.nextLine();
					//Day day : rr.h1.month.day
					for (int i = 0; i<Corona19.h1.month.day.size(); i++) {
						
						if(Corona19.h1.month.day.get(i).getDay().equals(res_day.substring(3))){
							if(Corona19.h1.month.day.get(i).isRes_possibility()) {
								
								Corona19.h1.month.day.get(i).setRes_possibility(false);
								//����Է¿Ϸ� �� ����Ʈ�� ����
								dayNum = res_day;
								
								Corona19.h1.rl.add(new Reservelist(reserveName,gender,phoneNum,age,dayNum,seattype));
								System.out.println("������ �Ϸ�Ǿ����ϴ�.");
								System.out.println(reserveName+"���� �������� " + dayNum + " ���Դϴ�");
								System.out.println("");
								System.out.println("�޴��� �̵��ϰڽ��ϴ�.");
								rr.reserveStart();

								
							}else {
								System.out.println("���� ������ ��¥�� ��� �ּ���");
							}
						}
					}
					
				}else if(hospitals == 2) {	// �ƻ꺴��
					
					Corona19.h2.month.calendar(calendar.get(Calendar.MONTH)+1);
					Corona19.h2.rl.add(new Reservelist(reserveName,gender,phoneNum,age,dayNum,seattype));
					
					
				}else {						// ��ȭ���� ����
					Corona19.h3.month.calendar(calendar.get(Calendar.MONTH)+1);
					Corona19.h3.rl.add(new Reservelist(reserveName,gender,phoneNum,age,dayNum,seattype));
					
				}
				
				/*
				//hospitals==1
				//�̺κп��� 1������������ 2������������ 3������������  �ش� �޼ҵ带 ȣ���ϴ��ڵ� ���Է�
				Hospital hospital = new Hospital(); //������ü ����
	//			hospital.snuh(); //����뺴���޼ҵ� ȣ��
				
				//����Է¿Ϸ� �� ����Ʈ�� ����
				rl.add(new Reservelist(reserveName,gender,phoneNum,age,dayNum,seattype));
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				System.out.println(reserveName+"���� ��������"+dayNum+"���Դϴ�");
				System.out.println("");
				*/
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
