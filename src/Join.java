
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Join {

	// static ArrayList<Membership> member = new ArrayList<Membership>();

	public void join(Hospital01 hospital) {

		int hospital_num = hospital.getUnique_num();
		int unique_num;
		String name;
		String id;
		String pw;

		Scanner sc = new Scanner(System.in);

		System.out.println("병원 고유 변호 :");
		try {
			unique_num = sc.nextInt();
			String inputNumber = Integer.toString(unique_num);

			String pattern2 = "^[0-9]*$";

			// 값이 입력되지 않았을때?

			if (inputNumber.equals("")) {

				System.out.println("번호가 입력되지 않았습니다. 다시 확인해주세요.");


				// inputPhoneNumber 입력값의 길이가 4가 아니거거나, 숫자가 아닐때
			} else if (inputNumber.length() != 4 || !Pattern.matches(pattern2, inputNumber)) {
				System.out.println("올바른 번호 형식이 아닙니다. 다시 확인해주세요.");

			}else {
			
			sc.nextLine();

			System.out.print("이름 : ");
			name = sc.nextLine();

			System.out.print("아이디 : ");
			id = sc.nextLine();

			System.out.print("비밀번호 : ");
			pw = sc.nextLine();

			if (unique_num != hospital_num) {
				//System.out.println("병원 고유번호 확인 : " + hospital_num);// 병원고유번호확인
				System.out.println(" 병원 고유 번호가 다릅니다.");
				System.out.println(" 회원가입을 다시 해주세요.");
				join(hospital);
			} else {

				hospital.member.add(new Membership(unique_num, name, id, pw));
				System.out.println(name + "님 회원가입을 성공하였습니다.");
			}

			Login login = new Login();
			login.loginstart(hospital);

			}
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요.");
			sc = new Scanner(System.in);
			join(hospital);
		}
	}

	/*
	 * public static ArrayList<Membership> getMember() { return hospital.member; }
	 * public static void setMember(ArrayList<Membership> member) { Join.member =
	 * member; }
	 */

}
