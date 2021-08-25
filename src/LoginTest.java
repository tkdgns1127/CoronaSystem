import java.util.Scanner;


public class LoginTest {

	public void loginTest01() {
		Scanner sc = new Scanner(System.in);
		Join jj = new Join();
		Login ll = new Login();
		
		int num;
		
		System.out.println("1.로그인 2.회원가입");
		num = sc.nextInt();
		
		
		if(num == 1) {
			ll.Hlogin();
		}else {
			jj.join();
			loginTest01();
			
		}
		


	}
	
	public static void main(String[] args) {
		
		LoginTest lt = new LoginTest();
		lt.loginTest01();
		
	}

}
