

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
			
			hospital.month.calendar(calendar.get(Calendar.MONTH)+1);
			
		
			//�Է� ���� �ϼ��� ���� ���� Ķ������ �ϼ��� ã�� 
			//�� �ϼ��� positive�� true���� Ȯ�� �� true��� false�� �ٲٰ� ������ ���� 
			//false��� ���� �Ұ���

			//day.substring(3);	//�Է¹��� �ϼ�
			System.out.println("�����Ͻ� ��¥�� �Է��ϼ��� : ��)8/25");
			System.out.println();
			String resDay = scanner.nextLine();
			String[] res_day = resDay.split("/");
			String res_day1 = res_day[1];
			//Day day : rr.h1.month.day
			for (int i = 0; i<hospital.month.day.size(); i++) {
			
				if(hospital.month.day.get(i).getDay().equals(res_day1)){
					if(hospital.month.day.get(i).isRes_possibility()) {
					
						hospital.month.day.get(i).setRes_possibility(false);
						//����Է¿Ϸ� �� ����Ʈ�� ����
						dayNum = resDay;
					
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
				System.out.println("010-0000-0000�������� ��ȭ��ȣ�� �Է����ּ���!");
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
					System.out.println("�ƻ꺴���� �����ϼ̽��ϴ�.");
					res.resreve(Corona19.h3, reserveName, gender, phoneNum, age);
					
				}
				
			
			}
		
		
		public void searchSeat() { //������ȸ �޼ҵ�
			String find; //ã��
			
			System.out.println("��ȸ�Ͻ� ���� ��ȭ��ȣ ���ڸ� 4�ڸ��� �Է����ּ���!");
			find = scanner.nextLine();
			System.out.println();

		
			boolean tf = true;
			
			
			for(int i = 0; i<Corona19.h1.rl.size(); i++) {
				
				if(Corona19.h1.rl.get(i).getPhoneNum().substring(9).equals(find)) {
					tf = false;
					System.out.println("------------------------------------------------------------------------");
					System.out.println("������: " +Corona19.h1.rl.get(i).getName()+"�� " + "\t���ິ��: " + Corona19.h1.name + "\t\t������: " + Corona19.h1.rl.get(i).getDayNum() + "\t��ȭ��ȣ: " + Corona19.h1.rl.get(i).getPhoneNum());
					System.out.println("------------------------------------------------------------------------");

				}	
			}
			
			for(int i = 0; i<Corona19.h2.rl.size(); i++) {
				
				if(Corona19.h2.rl.get(i).getPhoneNum().substring(9).equals(find)) {
					tf = false;

					System.out.println("------------------------------------------------------------------------");
					System.out.println("������: " +Corona19.h2.rl.get(i).getName()+"�� " + "\t���ິ��: " + Corona19.h2.name + "\t\t������: " + Corona19.h2.rl.get(i).getDayNum() + "\t��ȭ��ȣ: " + Corona19.h2.rl.get(i).getPhoneNum());
					System.out.println("------------------------------------------------------------------------");

				}	
			}
			
			for(int i = 0; i<Corona19.h3.rl.size(); i++) {
				
				if(Corona19.h3.rl.get(i).getPhoneNum().substring(9).equals(find)) {
					tf = false;

					System.out.println("------------------------------------------------------------------------");
					System.out.println("������: " +Corona19.h3.rl.get(i).getName()+"�� " + "\t���ິ��: " + Corona19.h3.name + "\t\t������: " + Corona19.h3.rl.get(i).getDayNum() + "\t��ȭ��ȣ: " + Corona19.h1.rl.get(i).getPhoneNum());
					System.out.println("------------------------------------------------------------------------");

}	
			}
			
			
			
			
			if(tf) {
				{
				System.out.println("���ฮ��Ʈ�� �����ϴ�.");
				System.out.println("������ �������ּ���!");
			}
		}
		}
}