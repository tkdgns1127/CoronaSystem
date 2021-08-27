import java.util.Scanner;

public class HospitalStart {
	Scanner scanner = new Scanner(System.in);
	
	public String[] hospitallist = { "서울대병원", "아산병원", "이화여대병원" };
	public Hospital01[] hospitalarraylist = { Corona19.h1, Corona19.h2, Corona19.h3 };
	static int chooseHospital;
	
	
	public void start() {


		// 병원 선택
		System.out.println("============  2.병원    ================");
		System.out.println("현재 병원을 선택하세요!");
		System.out.println("1.서울대병원   2.아산병원   3.이화여대병원");
		System.out.println("=====================================");
		System.out.print("숫자를 입력하세요 : ");
		chooseHospital = scanner.nextInt() - 1;
		System.out.println(hospitallist[chooseHospital] + "이 선택되었습니다.");
		
		Login login = new Login();
		
		
		login.loginstart(hospitalarraylist[chooseHospital]);
		
		//hospitalstart(chooseHospital);
	}

	public void hospitalstart(int chooseHospital) {
		// 병원 메뉴선택
		//int chooseHospital = Arrays.asList(hospitalarraylist).indexOf(hospital);
		
		System.out.println("============  " + hospitallist[chooseHospital] + "  ================");
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.백신 조회     2.백신 요청     3.병원 선택으로 가기");
		System.out.println("=====================================");
		System.out.print("숫자를 입력하세요 : ");
		int choosemenu = scanner.nextInt();

		if (choosemenu == 1) {
			hospitalarraylist[chooseHospital].vaccinsearch();
		} else if (choosemenu == 2) {
			System.out.println(hospitallist[chooseHospital] + "의 백신요청입니다.");
			System.out.print("필요한 화이자 백신수를 입력하세요 : ");
			int inputV1 = scanner.nextInt();
			System.out.print("필요한 모더나 백신수를 입력하세요 : ");
			int inputV2 = scanner.nextInt();
			
			hospitalarraylist[chooseHospital].vaccinrequest(hospitalarraylist[chooseHospital], inputV1, inputV2);

		} else if (choosemenu == 3) {
			start();
		}

	}

	public static void main(String[] args) {
		HospitalStart hospitalstart = new HospitalStart();
		hospitalstart.start();
	}

}
