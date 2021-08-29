import java.util.Scanner;


public class LoginTest {

	public static void loginTest01(Hospital01 hospital) {
		Scanner sc = new Scanner(System.in);
		Join jj = new Join();
		Login ll = new Login();
		
		
		
		int num;
		
		System.out.println("[ " + hospital.name + " ]");
		System.out.println("1.로그인 	2.회원가입");
		num = sc.nextInt();
		
		
		if (num == 1) {
			ll.Hlogin(hospital);
		}else {
			jj.join(hospital);
			loginTest01(hospital);
			
		}
		


	}
	
	public static void main(String[] args) {
		

		LoginTest lt = new LoginTest();
		lt.loginTest01(Corona19.h1);
		
	}

}
