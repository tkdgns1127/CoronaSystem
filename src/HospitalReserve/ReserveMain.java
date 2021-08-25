package HospitalReserve;

import java.util.*;

public class ReserveMain { //메인클래스 여기서 실행
	
	public static void main(String[] args) {
		
		String reserveName = null; //예약자 성명
		int phoneNum = 0; //전화번호
		boolean input = true; //입력한 게 true이다.
		
		reserveseat seat = new reserveseat(reserveName, phoneNum);
		
		Scanner scanner = new Scanner(System.in); //입력할수 있는 스캐너
		
		while(input) { // - 예약 시스템의 메뉴는 "예약", "조회", "취소", "끝내기"가 있다.
					  // - 없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소 등에 대해서 오류 메시지를 출력하고 사용자가 다시시도하도록 한다.
			System.out.println("==============================");
			System.out.println("1.예약하기 2.예약조회 3.예약취소 4.뒤로가기");
			
			int reservefor = scanner.nextInt(); //위의 메뉴중 4개만 입력 그외는 잘못입력출력
			switch(reservefor) {
			case 1: 
				seat.Seat();
				break;
			case 2: 
				seat.searchSeat();
				break;
			case 3: 
				seat.CancleSeat();
				break;
			case 4: // 뒤로가기
				System.out.println("환자메뉴로 이동합니다.");
				input = false;
				return;
			default:
				System.out.println("잘못 누르셨습니다. 정확한 번호를 입력해주세요.");
			}
		}
	}
}