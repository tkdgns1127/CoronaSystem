
import java.util.Scanner;


public class Login {

		String id;
		String pw;
		boolean login = true;
		Join jj = new Join();
		
		
		public void loginTest01(Hospital01 hospital) {
			Scanner sc = new Scanner(System.in);
			//������ �ȶ�
			//ss
			
			
			int num;
			
			System.out.println("1.�α��� 2.ȸ������");
			num = sc.nextInt();
			
			
			if(num == 1) {
				Hlogin(hospital);
			}else {
				jj.join(hospital);
				loginTest01(hospital);
				
			}
			
		}	

		
		public void Hlogin(Hospital01 hospital) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("���̵� : ");
		id = sc.nextLine();
		
		
		System.out.println("��й�ȣ : ");
		pw = sc.nextLine();
		
		for (int i =0; i<hospital.member.size(); i++) {
			if(id.equals(hospital.member.get(i).getId())) {
				if(pw.equals(hospital.member.get(i).getPw())) {
					login = false;
					System.out.println(hospital.member.get(i).getName() + "�� ȯ���մϴ�.");
					
					
				}
				//System.out.println("��й�ȣ�� �ٸ��ϴ�.");
			} 
		}
		
		
		if(login) {
			System.out.println("�α��ο� �����ϼ̽��ϴ�.");
			loginTest01(hospital);
		}
		
	
	}
		
	/*	public static void main(String[] args) {
			Login ll = new Login();
			ll.loginTest01();
		}
		
		*/
}
