
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
		
		/*System.out.println("�����Ͻ� ���� �� ��ȣ 4�ڸ��� �Է��ϼ���");
		System.out.print("�� ��ȣ �Է� :");
		endNum = sc.nextLine();
		
		res_correct(endNum);
		
		if(phone_num.equals(endNum.substring(9))) {
			//����Ʈ ���
			System.out.println("���� ����Ʈ ���");
			System.out.println("������ ����Ͻðڽ��ϱ�? [Yes/No]");
			
			if(sc.nextLine().equals("Yes")) {
				System.out.println("������ ��ҵǾ����ϴ�.");
				System.out.println("ȯ�� �޴��� �̵�");
			}else {
				System.out.println("������ ��� X");
				System.out.println("ȯ�� �޴��� �̵�");
			}
			
		}else{
			System.out.println("���� ����Ʈ�� �������� �ʽ��ϴ�.");
		};*/
		
	}
	
	public static void main(String[] args) {
		
		ReservationCancle rescan = new ReservationCancle();
		rescan.res_cancle();
		
		
	
		
	}

}
