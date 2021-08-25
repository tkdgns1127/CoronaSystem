
import java.util.ArrayList;
import java.util.Scanner;

public class Patient {
	Consult consult = new Consult();
	Scanner sc = new Scanner(System.in);
	Test test = new Test();
	Cure cure = new Cure();
	
	public void methodAA() {  consult.conusltMethod(sc);;}
	public void methodBB() {test.inputInformation(consult.getCoronaTestList());}
	public void methodCC() {System.out.println("예약 실행 메소드 호출");}
	public void methodDD() {cure.cureMethod(sc);}
	
	public void patientStart() {
		Patient pp = new Patient();	// 상담, 검사, 예약, 치료 객체 생성
		Corona19 cc = new Corona19();
		Scanner sc = new Scanner(System.in);

		System.out.println("===============================");
		System.out.println("메뉴를 선택하세요!");
		System.out.println("1.상담 2.검사 3.예약 4.치료 5.뒤로가기" );
		System.out.println("===============================");
		int num = sc.nextInt();
		if(num == 1) {
			pp.methodAA();
		}else if(num == 2) {
			pp.methodBB();
		}else if(num == 3){
			pp.methodCC();}
		else if(num ==4){
			pp.methodDD();
		}else{
			cc.coronaSystem();
		}
	}
	
	
	
}
