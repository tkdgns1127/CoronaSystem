
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Patient {
	Consult consult = new Consult();
	Scanner sc = new Scanner(System.in);
	Test test = new Test();
	Cure cure = new Cure();
	ReserveMain reserve = new ReserveMain();

	public void startConsult() {
		consult.conusltMethod(sc);
		;
	}

	public void startTest() {
		test.inputInformation(Consult.coronaTestList);
	}

	public void startReserve() {
		reserve.reserveStart();
	}

	public void startCure() {
		cure.cureMethod();
	}

	public static void patientStart() {
		Patient patient = new Patient(); // 상담, 검사, 예약, 치료 객체 생성
		Corona19 corona = new Corona19();
		Scanner sc = new Scanner(System.in);

		System.out.println("===========================================================");
		System.out.println("메뉴를 선택하세요!");
		System.out.println("1.상담 2.검사 3.백신예약 4.백신접종 5.전체상황판 6.나이별확진자 7.메인메뉴");
		System.out.println("===========================================================");
		try {

			int num = sc.nextInt();
			if (num == 1) {
				patient.startConsult();
			} else if (num == 2) {
				patient.startTest();
			} else if (num == 3) {
				patient.startReserve();
			} else if (num == 4) {
				Cure cure = new Cure();
				cure.cureMethod();
				//patient.startCure();
			} else if (num == 5) {
				DashBoard board = new DashBoard();
				
			} else if(num == 6) {
				ConfirmedByAge cfmb = new ConfirmedByAge();
				cfmb.confirmedByAge();
			}else if(num == 7){
				corona.coronaSystem();
			}else {
				System.out.println("다시 입력하세요.");
				patientStart();
			}

		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요.");
			sc = new Scanner(System.in);
			patientStart();
		}
	}

}
