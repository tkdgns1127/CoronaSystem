
import java.util.Scanner;


public class Login {

		String id;
		String pw;
		boolean login = true;
		Join jj = new Join();
		
		
		public void loginTest01() {
			Scanner sc = new Scanner(System.in);
			//에러는 안뜸
			//ss
			
			
			int num;
			
			System.out.println("1.로그인 2.회원가입");
			num = sc.nextInt();
			
			
			if(num == 1) {
				Hlogin();
			}else {
				jj.join();
				loginTest01();
				
			}
			
		}	

		
		public void Hlogin() {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("아이디 : ");
		id = sc.nextLine();
		
		
		System.out.println("비밀번호 : ");
		pw = sc.nextLine();
		
		for (int i =0; i<jj.member.size(); i++) {
			if(id.equals(jj.member.get(i).getId())) {
				if(pw.equals(jj.member.get(i).getPw())) {
					login = false;
					System.out.println(jj.member.get(i).getName() + "님 환영합니다.");
					
				}
				//System.out.println("비밀번호가 다릅니다.");
			} 
		}
		
		
		if(login) {
			System.out.println("로그인에 실패하셨습니다.");
			loginTest01();
		}
		
	
	}
		
		public static void main(String[] args) {
			Login ll = new Login();
			ll.loginTest01();
		}
		
		
}
