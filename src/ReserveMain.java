

import java.util.*;

public class ReserveMain { //����Ŭ���� ���⼭ ����
	
	
	String reserveName = null; //������ ����
	String gender = null;
	int phoneNum = 0; 	//��ȭ��ȣ
	int age = 0;		// ����
	int dayNum = 0;		// ���� ��¥
	boolean input = true; //�Է��� �� true�̴�.
	
	public void reserveStart() {
		reserveseat seat = new reserveseat(reserveName, phoneNum);
		ReservationCancle rc = new ReservationCancle();
		Reserve reserve = new Reserve();
		
		Scanner scanner = new Scanner(System.in); //�Է��Ҽ� �ִ� ��ĳ��
		
		while(input) { 	// - ���� �ý����� �޴��� "����", "��ȸ", "���", "������"�� �ִ�.
					  	// - ���� �̸�, ���� ��ȣ, ���� �޴�, �߸��� ��� � ���ؼ� ���� �޽����� ����ϰ� ����ڰ� �ٽýõ��ϵ��� �Ѵ�.
			System.out.println("==============================");
			System.out.println("1.�����ϱ� 2.������ȸ 3.������� 4.�ڷΰ���");
			
			int reservefor = scanner.nextInt(); //���� �޴��� 4���� �Է� �׿ܴ� �߸��Է����
			switch(reservefor) {
			case 1: 
				//seat.Seat();			//���� �޼ҵ�
				 reserve.Seat();
				break;
			case 2:
				
				reserve.searchSeat();
				
				/*System.out.println("������ ������ �����ϼ���!!");
				System.out.println("1.����뺴�� 2.�ƻ꺴�� 3.��ȭ���뺴��");
				int num = scanner.nextInt();
				
				if(num == 1) {
					reserve.searchSeat(Corona19.h1);		//��ȸ �޼ҵ�
					
				}else if(num ==2) {
					reserve.searchSeat(Corona19.h2);		//��ȸ �޼ҵ�
					
				}else {
					
					reserve.searchSeat(Corona19.h3);		//��ȸ �޼ҵ�
				}*/
				break;
			case 3: 
				rc.res_cancle();	//��� �޼ҵ�
				break;
			case 4: // �ڷΰ���
				
				Patient.patientStart();
				input = false;
				return;
			default:
				System.out.println("�߸� �����̽��ϴ�. ��Ȯ�� ��ȣ�� �Է����ּ���.");
			}
		}
	}
	
	
	public static void main(String[] args) {
	
		ReserveMain reserve = new ReserveMain();
		reserve.reserveStart();
		
		
	}
}