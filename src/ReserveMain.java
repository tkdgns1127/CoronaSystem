

import java.util.*;

public class ReserveMain { //메인클래스 여기서 실행
	
	
	String reserveName = null; //예약자 성명
	String gender = null;
	int phoneNum = 0; 	//전화번호
	int age = 0;		// 나이
	int dayNum = 0;		// 예약 날짜
	boolean input = true; //입력한 게 true이다.
	
	public void reserveStart() {
		reserveseat seat = new reserveseat(reserveName, phoneNum);
		ReservationCancle rc = new ReservationCancle();
		Reserve reserve = new Reserve();
		
		Scanner scanner = new Scanner(System.in); //입력할수 있는 스캐너
		
		while(input) { 	// - 예약 시스템의 메뉴는 "예약", "조회", "취소", "끝내기"가 있다.
					  	// - 없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소 등에 대해서 오류 메시지를 출력하고 사용자가 다시시도하도록 한다.
			System.out.println("==============================");
			System.out.println("1.예약하기 2.예약조회 3.예약취소 4.뒤로가기");
			
			int reservefor = scanner.nextInt(); //위의 메뉴중 4개만 입력 그외는 잘못입력출력
			switch(reservefor) {
			case 1: 
				//seat.Seat();			//예약 메소드
				 reserve.Seat();
				break;
			case 2:
				
				reserve.searchSeat();
				
				/*System.out.println("예약한 병원을 선택하세요!!");
				System.out.println("1.서울대병원 2.아산병원 3.이화여대병원");
				int num = scanner.nextInt();
				
				if(num == 1) {
					reserve.searchSeat(Corona19.h1);		//조회 메소드
					
				}else if(num ==2) {
					reserve.searchSeat(Corona19.h2);		//조회 메소드
					
				}else {
					
					reserve.searchSeat(Corona19.h3);		//조회 메소드
				}*/
				break;
			case 3: 
				rc.res_cancle();	//취소 메소드
				break;
			case 4: // 뒤로가기
				
				Patient.patientStart();
				input = false;
				return;
			default:
				System.out.println("잘못 누르셨습니다. 정확한 번호를 입력해주세요.");
			}
		}
	}
	
	
	public static void main(String[] args) {
	
		ReserveMain reserve = new ReserveMain();
		reserve.reserveStart();
		
		
	}
}