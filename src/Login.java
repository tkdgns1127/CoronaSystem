import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Login {

		String id;
		String pw;
		boolean login = true;
		Join jj = new Join();
		
		
		public void loginstart(Hospital01 hospital) {
			Scanner sc = new Scanner(System.in);
			//������ �ȶ�
		
			
			
			int num;
			System.out.println("================================");
			System.out.println("1.�α���   2.ȸ������  3.������������ ���ư���");
			System.out.print("���ڸ� �Է����ּ��� : ");
			
			try {
			num = sc.nextInt();
			
			
			if(num == 1) {
				Hlogin(hospital);
			}else if(num == 2) {
				jj.join(hospital);
			}else if(num == 3) {
				HospitalStart hospitalstart = new HospitalStart();
				hospitalstart.start();
			}else {
				System.out.println("�ٽ� �Է��ϼ���.");
				loginstart(hospital);
			}
			}catch(InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ���.");
				loginstart(hospital);
			}
			
		}	

		
		public void Hlogin(Hospital01 hospital) {
		
		Scanner sc = new Scanner(System.in);
		
		//�ǿ�ȸ�� Ȯ�ο� ��¹�
		System.out.print("(�ǻ�ȸ������Ʈ��� : ");
		for(Membership m : hospital.member) {
			System.out.print(m.getName() + " ");
		}
		System.out.println(")");
		
		System.out.print("���̵� : ");
		id = sc.nextLine();
		
		
		System.out.print("��й�ȣ : ");
		pw = sc.nextLine();
		
		for (int i =0; i<hospital.member.size(); i++) {
			if(id.equals(hospital.member.get(i).getId())) {
				if(pw.equals(hospital.member.get(i).getPw())) {
					login = false;
					System.out.println(hospital.member.get(i).getName() + "�� ȯ���մϴ�.");
					
					//�α��� �����ؼ� ���� �޴��� ����
					HospitalStart hs = new HospitalStart();
					int num = Arrays.asList(hs.hospitalarraylist).indexOf(hospital);
					hs.hospitalstart(num);
				}
				//System.out.println("��й�ȣ�� �ٸ��ϴ�.");
			} 
		}
		
		if(login) {
			System.out.println("�α��ο� �����ϼ̽��ϴ�.");
			loginstart(hospital);
		}
	}
		
	/*	public static void main(String[] args) {
			Login ll = new Login();
			ll.loginTest01();
		}
		
		*/
}
