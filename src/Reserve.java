

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

class Reserve{
		String reserveName = null; 		//������ ����
		String gender = null; 			//����
		String phoneNum = null; 				//��ȭ��ȣ
		int age = 0;					//����
		String dayNum = null; 				//���೯¥
		String seattype = null; 		//�ڸ�Ÿ��
		
		ReserveMain rr = new ReserveMain();
		Scanner scanner = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		int pre_month = calendar.get(Calendar.MONTH)+1;
		
		public void resreve(Hospital01 hospital,String reserveName, String gender, String phoneNum, int age) {
			Corona19.h1.month.calendar(calendar.get(Calendar.MONTH)+1);
			
		
			//�Է� ���� �ϼ��� ���� ���� Ķ������ �ϼ��� ã�� 
			//�� �ϼ��� positive�� true���� Ȯ�� �� true��� false�� �ٲٰ� ������ ���� 
			//false��� ���� �Ұ���

			//day.substring(3);	//�Է¹��� �ϼ�
			System.out.println("�����Ͻ� ��¥�� �Է��ϼ��� : ��)08/25");
			System.out.println();
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
			Reserve res = new Reserve();
			
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
				String phoneNum = scanner.next(); //int������ ����
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
					
					res.resreve(Corona19.h1, reserveName, gender, phoneNum, age);
					
				}else if(hospitals == 2) {	// �ƻ꺴��
					
					System.out.println("�ƻ꺴���� �����ϼ̽��ϴ�.");
					res.resreve(Corona19.h2, reserveName, gender, phoneNum, age);
					
				}else {						// ��ȭ���� ����
					res.resreve(Corona19.h3, reserveName, gender, phoneNum, age);
					
				}
				
			
			}
		}
		
		
		public void searchSeat(Hospital01 hospital) { //������ȸ �޼ҵ�
			String find; //ã��
			
			System.out.println("��ȸ�Ͻ� ���� ��ȭ��ȣ ���ڸ� 4�ڸ��� �Է����ּ���!");
			find = scanner.nextLine();
			System.out.println();
			
			System.out.println("");
		
			for(int i = 0; i<hospital.rl.size(); i++) {
				//System.out.println(hospital.rl.get(i).getPhoneNum().equals(find.substring(8)))
				if(hospital.rl.get(0).getPhoneNum().substring(7).equals(find)) {
					System.out.println("�����Ͻź��� ��ȭ��ȣ��"+hospital.rl.get(i).getPhoneNum()+"�� �½��ϱ�?");
					System.out.println(hospital.rl.get(i).getName()+"���� ���� ��¥��"+hospital.rl.get(i).getDayNum()+"�Դϴ�.");
				}else {
					System.out.println("���ฮ��Ʈ�� �����ϴ�.");
					System.out.println("������ �������ּ���!");
				}
			}
		}
}
