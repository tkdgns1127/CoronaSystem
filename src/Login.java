
import java.util.Scanner;


public class Login {

		String id;
		String pw;
		boolean login = true;
		Join jj = new Join();
		
		
		public void loginTest01(Hospital01 hospital) {
			Scanner sc = new Scanner(System.in);
			//에러는 안뜸
			//ss
			
			
			int num;
			
			System.out.println("1.로그인 2.회원가입");
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
		
		
		
		
		System.out.println("아이디 : ");
		id = sc.nextLine();
		
		
		System.out.println("비밀번호 : ");
		pw = sc.nextLine();
		
		for (int i =0; i<hospital.member.size(); i++) {
			if(id.equals(hospital.member.get(i).getId())) {
				if(pw.equals(hospital.member.get(i).getPw())) {
					login = false;
					System.out.println(hospital.member.get(i).getName() + "님 환영합니다.");
					
					
				}
				//System.out.println("비밀번호가 다릅니다.");
			} 
		}
		
		
		if(login) {
			System.out.println("로그인에 실패하셨습니다.");
			loginTest01(hospital);
		}
		
	
	}
		
	/*	public static void main(String[] args) {
			Login ll = new Login();
			ll.loginTest01();
		}
		
		*/
}
