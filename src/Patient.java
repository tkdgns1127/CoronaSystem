import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class Patient {
	Consult consult = new Consult();
	Scanner sc = new Scanner(System.in);
	Test test = new Test();
	Cure cure = new Cure();
	ReserveMain reserve = new ReserveMain();
	
	public void methodAA() {  consult.conusltMethod(sc);;}
	public void methodBB() {test.inputInformation(Consult.coronaTestList);}
	public void methodCC() {reserve.reserveStart();}
	public void methodDD() {cure.cureMethod(sc);}
	
	public static void patientStart() {
		Patient pp = new Patient();	// 상담, 검사, 예약, 치료 객체 생성
		Corona19 cc = new Corona19();
		Scanner sc = new Scanner(System.in);

		System.out.println("===============================");
		System.out.println("메뉴를 선택하세요!");
		System.out.println("1.상담 2.검사 3.예약 4.치료 5.뒤로가기" );
		System.out.println("===============================");
		try {
		
		int num = sc.nextInt();
		if(num == 1) {
			pp.methodAA();
		}else if(num == 2) {
			pp.methodBB();
		}else if(num == 3) {
			pp.methodCC();
		}else if(num == 4) {
			pp.methodDD();
		}else if(num == 5) {
			cc.coronaSystem();
		}else {
			System.out.println("다시 입력하세요.");
			patientStart();
		}
			
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력하세요.");
			patientStart();
		}
	}
	
	
	
}
