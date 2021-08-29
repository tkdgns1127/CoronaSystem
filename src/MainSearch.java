
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainSearch {
	int menu;
	Scanner scanner = new Scanner(System.in);

	public void start() {
		System.out.println("============= 3.조회메뉴 =============");
		System.out.println("1.전체 상황판   2.환자 검색   3.나이별 확진자   4. 뒤로가기");
		System.out.println("===================================");

		try {
			System.out.print("메뉴를 입력하세요. : ");
			int result = scanner.nextInt();

			if (result == 1) {
				DashBoard dashBoard = new DashBoard();
			} else if (result == 2) {
				PatientSearch patientsearch = new PatientSearch();
			} else if (result == 3) {
				ConfirmedByAge cfba = new ConfirmedByAge();
				cfba.confirmedByAge();
			} else if (result == 4) {
				Corona19 corona19 = new Corona19();
				corona19.coronaSystem();
			} else {
				System.out.println("번호를 다시 입력해주세요.");
				start();
			}
		} catch (InputMismatchException e) {
			System.out.println("문자만 입력하세요.");
		}
	}

	public static void main(String[] args) {
		MainSearch mainsearch = new MainSearch();
		mainsearch.start();

	}

}
