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
			//에러는 안뜸
		
			
			
			int num;
			System.out.println("================================");
			System.out.println("1.로그인   2.회원가입  3.병원선택으로 돌아가기");
			System.out.print("숫자를 입력해주세요 : ");
			
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
				System.out.println("다시 입력하세요.");
				loginstart(hospital);
			}
			}catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요.");
				loginstart(hospital);
			}
			
		}	

		
		public void Hlogin(Hospital01 hospital) {
		
		Scanner sc = new Scanner(System.in);
		
		//의원회원 확인용 출력문
		System.out.print("(의사회원리스트출력 : ");
		for(Membership m : hospital.member) {
			System.out.print(m.getName() + " ");
		}
		System.out.println(")");
		
		System.out.print("아이디 : ");
		id = sc.nextLine();
		
		
		System.out.print("비밀번호 : ");
		pw = sc.nextLine();
		
		for (int i =0; i<hospital.member.size(); i++) {
			if(id.equals(hospital.member.get(i).getId())) {
				if(pw.equals(hospital.member.get(i).getPw())) {
					login = false;
					System.out.println(hospital.member.get(i).getName() + "님 환영합니다.");
					
					//로그인 성공해서 병원 메뉴로 들어가기
					HospitalStart hs = new HospitalStart();
					int num = Arrays.asList(hs.hospitalarraylist).indexOf(hospital);
					hs.hospitalstart(num);
				}
				//System.out.println("비밀번호가 다릅니다.");
			} 
		}
		
		if(login) {
			System.out.println("로그인에 실패하셨습니다.");
			loginstart(hospital);
		}
	}
		
	/*	public static void main(String[] args) {
			Login ll = new Login();
			ll.loginTest01();
		}
		
		*/
}
