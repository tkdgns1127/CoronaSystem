
import java.util.InputMismatchException;
import java.util.Scanner;

public class Corona19 {

	public static Hospital01 h1 = new Hospital01(1111, 10, 10, "서울대병원");// 서울대병원
	public static Hospital01 h2 = new Hospital01(1234, 5, 9, "아산병원");// 아산병원
	public static Hospital01 h3 = new Hospital01(0000, 2, 1, "이화여대병원");// 이화여대병원

	public void mainPatientStart() {
		Patient pp = new Patient();
		pp.patientStart();
	}

	public void mainHospitalStart() {
		HospitalStart hs = new HospitalStart();
		hs.start();
	}

	public void mainSearchStart() {
		MainSearch ms = new MainSearch();
		ms.start();
	}

	public void coronaSystem() {

		Corona19 corona = new Corona19();// 환자 클래스, 병원 클래스, 조회 클래스 객체 생성

		Scanner sc = new Scanner(System.in);

		System.out.println("===============================");
		System.out.println("메뉴를 선택하세요!");
		System.out.println("1.환자 2.병원 3.조회");
		System.out.println("===============================");
		try {
			int num = sc.nextInt();
			if (num == 1) {
				mainPatientStart();
			} else if (num == 2) {
				mainHospitalStart();
			} else if (num == 3) {
				mainSearchStart();
			} else
				System.out.println("숫자를 다시 입력하세요.");
			coronaSystem();
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요.");
			sc = new Scanner(System.in);
			coronaSystem();
		}

	}

	public static void main(String[] args) {

		// 데이터 입력
		Test.infectionList.add(new Person("박상훈", 25, "010-7926-7460", true));
		Test.infectionList.add(new Person("이유경", 45, "010-7925-7471", true));
		Test.infectionList.add(new Person("박경한", 46, "010-7924-7472", true));
		Test.infectionList.add(new Person("아이유", 29, "010-7923-7473", true));
		Test.infectionList.add(new Person("이화자", 78, "010-7922-7474", true));
		Test.infectionList.add(new Person("김도현", 30, "010-7921-7475", true));
		Test.infectionList.add(new Person("이기자", 38, "010-7920-7476", true));
		Test.infectionList.add(new Person("지한얼", 19, "010-7919-7477", true));
		Test.infectionList.add(new Person("화이자", 61, "010-1127-7478", true));

		Cure.treatmentCompletedList.add(new Person("도현도", 25, "010-8000-1234", true));
		Corona19 corona = new Corona19();// 환자 클래스, 병원 클래스, 조회 클래스 객체 생성
		corona.coronaSystem();

	}

}
