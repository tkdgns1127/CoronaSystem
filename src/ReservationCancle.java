
import java.util.Scanner;

public class ReservationCancle {	//���� ��� Ŭ����

	Scanner sc = new Scanner(System.in);
	//String endNum = "010-7927-7479"; 	// ���� ����Ʈ�� �޹�ȣ
	String endNum;
	
	
	//���ฮ��Ʈ ��ȸ & ��ġ Ȯ�� �޼ҵ�
	public void res_correct(String endNum) {
		
		for (Reservelist element : Corona19.h1.rl) {
			if(element.getPhoneNum().substring(9).equals(endNum)) {
				System.out.println("================================================");
				System.out.println("���� Ȯ��");
				System.out.println("�̸� : " + element.getName() + "\t��ȭ��ȣ : " + element.getPhoneNum() );
				System.out.println("���೯¥ " + element.getDayNum() + "\t���ິ�� : " +Corona19.h1.name);
				System.out.println("================================================");
				System.out.println("������ ������ �½��ϱ�?");
			}
		}
	}
	
	
	
	public void res_cancle() {	// ���� ��� �޼ҵ�
		
		ReserveMain reserve = new ReserveMain();
		System.out.println("�����Ͻ� ���� ��ȭ��ȣ�� �Է��ϼ���. ex)010-0000-0000");
		System.out.print("��ȣ �Է� :");
		endNum = sc.nextLine();
		boolean tf = true;
		
		for (Reservelist element : Corona19.h1.rl) {
			if(element.getPhoneNum().equals(endNum)) {
				tf = false;
				System.out.println("===================���� Ȯ��=============================");
				
				System.out.println("�̸� : " + element.getName() + "\t��ȭ��ȣ : " + element.getPhoneNum() );
				System.out.println("���೯¥ " + element.getDayNum() + "\t���ິ�� : " +Corona19.h1.name);
				System.out.println("======================================================");
				System.out.println("������ ����Ͻðڽ��ϱ�? [Yes/No]");
				String yn = sc.nextLine();
				if(yn.equals("Yes")) {
					Corona19.h1.rl.remove(element);
					System.out.println("������ ��� �Ǿ����ϴ�.");
					reserve.reserveStart();
				}else {
					System.out.println("���� ��Ұ� ��ҵǾ����ϴ�.");
					reserve.reserveStart();
					
				}
			}
		}
		
		//�ƻ� ����
		for (Reservelist element : Corona19.h2.rl) {
			if(element.getPhoneNum().equals(endNum)) {
				tf = false;
				System.out.println("===================���� Ȯ��=============================");
				
				System.out.println("�̸� : " + element.getName()+ "��" + "\t\t��ȭ��ȣ: " + element.getPhoneNum() );
				System.out.println("���೯¥ " + element.getDayNum() + "\t\t���ິ�� : " +Corona19.h2.name);
				System.out.println("======================================================");
				System.out.println("������ ����Ͻðڽ��ϱ�? [Yes/No]");
				String yn = sc.nextLine();
				if(yn.equals("Yes")) {
					Corona19.h2.rl.remove(element);
					System.out.println("������ ��� �Ǿ����ϴ�.");
					reserve.reserveStart();
				}else {
					System.out.println("���� ��Ұ� ��ҵǾ����ϴ�.");
					reserve.reserveStart();
					
				}
			}
		}

		//��ȭ���뺴��
		for (Reservelist element : Corona19.h3.rl) {
			if(element.getPhoneNum().equals(endNum)) {
				tf = false;
				System.out.println("===================���� Ȯ��=============================");
				
				System.out.println("�̸� : " + element.getName() + "\t��ȭ��ȣ : " + element.getPhoneNum() );
				System.out.println("���೯¥ " + element.getDayNum() + "\t���ິ�� : " +Corona19.h3.name);
				System.out.println("======================================================");
				System.out.println("������ ����Ͻðڽ��ϱ�? [Yes/No]");
				String yn = sc.nextLine();
				if(yn.equals("Yes")) {
					Corona19.h1.rl.remove(element);
					System.out.println("������ ��� �Ǿ����ϴ�.");
					reserve.reserveStart();
				}else {
					System.out.println("���� ��Ұ� ��ҵǾ����ϴ�.");
					reserve.reserveStart();
					
				}
			}
		}
		if(tf) {
			
				System.out.println("���� ����Ʈ�� �������� �ʽ��ϴ�.");
			
		}
	}
	
	public static void main(String[] args) {
		
		ReservationCancle rescan = new ReservationCancle();
		rescan.res_cancle();
		
		
	
		
	}

}
