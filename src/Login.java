import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Login {

	String id;
	String pw;
	boolean login = true;
	Join jj = new Join();

	public void loginstart(Hospital01 hospital) {
		Scanner sc = new Scanner(System.in);
		HospitalStart hospitalstart = new HospitalStart();

		int num;
		System.out.println("");

		System.out.println("===========================================");
		System.out.println("1.로그인   2.회원가입  3.병원선택으로 돌아가기");
		System.out.print("숫자를 입력해주세요 : ");

		try {
			num = sc.nextInt();

			if (num == 1) {
				Hlogin(hospital);
			} else if (num == 2) {
				jj.join(hospital);
			} else if (num == 3) {
				hospitalstart.start();
			} else {
				System.out.println("다시 입력하세요.");
				hospitalstart.start();

			}
		} catch (InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다. 숫자를 입력해주세요.");
			System.out.println();
			sc = new Scanner(System.in);
			loginstart(hospital);
		}

	}

	public void Hlogin(Hospital01 hospital) {

		Scanner sc = new Scanner(System.in);

		// 의원회원 확인용 출력문
	

		System.out.print("아이디 : ");
		id = sc.nextLine();

		System.out.print("비밀번호 : ");
		pw = sc.nextLine();

		for (int i = 0; i < hospital.member.size(); i++) {
			if (id.equals(hospital.member.get(i).getId())) {
				if (pw.equals(hospital.member.get(i).getPw())) {
					login = false;
					System.out.println("");

					System.out.println(hospital.member.get(i).getName() + "님 환영합니다.");

					// 로그인 성공해서 병원 메뉴로 들어가기
					HospitalStart hs = new HospitalStart();
					int num = Arrays.asList(hs.hospitalarraylist).indexOf(hospital);
					hs.hospitalstart(num);
				}
				// System.out.println("비밀번호가 다릅니다.");
			}
		}

		if (login) {
			System.out.println("로그인에 실패하셨습니다.");
			loginstart(hospital);
		}

	}

	/*
	 * public static void main(String[] args) { Login ll = new Login();
	 * ll.loginTest01(); }
	 * 
	 */
}
