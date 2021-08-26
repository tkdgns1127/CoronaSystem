import java.util.Scanner;

public class HospitalStart {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//병원 선택
		System.out.println("=======================================");
		System.out.println("병원을 선택하세요");
		System.out.println("1.서울대 병원 2.아산 병원 3.이화여대 병원");
		System.out.println("=======================================");
		System.out.print("번호 입력 : ");
		
		int num = sc.nextInt();
		if(num == 1) {
			System.out.println();
			LoginTest.loginTest01(Corona19.h1);
		}else if(num == 2) {
			System.out.println();
			LoginTest.loginTest01(Corona19.h2);
		}else {
			System.out.println();
			LoginTest.loginTest01(Corona19.h3);
		}
		
	}

}
