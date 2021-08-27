
import java.util.Scanner;

public class ReservationCancle {	//예약 취소 클래스

	Scanner sc = new Scanner(System.in);
	//String endNum = "010-7927-7479"; 	// 예약 리스트의 뒷번호
	String endNum;
	
	
	//예약리스트 조회 & 일치 확인 메소드
	public void res_correct(String endNum) {
		
		for (Reservelist element : Corona19.h1.rl) {
			if(element.getPhoneNum().substring(9).equals(endNum)) {
				System.out.println("================================================");
				System.out.println("예약 확인");
				System.out.println("이름 : " + element.getName() + "\t전화번호 : " + element.getPhoneNum() );
				System.out.println("예약날짜 " + element.getDayNum() + "\t예약병원 : " +Corona19.h1.name);
				System.out.println("================================================");
				System.out.println("예약한 정보가 맞습니까?");
			}
		}
	}
	
	
	
	public void res_cancle() {	// 예약 취소 메소드
		
		ReserveMain reserve = new ReserveMain();
		System.out.println("예약하신 분의 전화번호를 입력하세요. ex)010-0000-0000");
		System.out.print("번호 입력 :");
		endNum = sc.nextLine();
		boolean tf = true;
		
		for (Reservelist element : Corona19.h1.rl) {
			if(element.getPhoneNum().equals(endNum)) {
				tf = false;
				System.out.println("===================예약 확인=============================");
				
				System.out.println("이름 : " + element.getName() + "\t전화번호 : " + element.getPhoneNum() );
				System.out.println("예약날짜 " + element.getDayNum() + "\t예약병원 : " +Corona19.h1.name);
				System.out.println("======================================================");
				System.out.println("예약을 취소하시겠습니까? [Yes/No]");
				String yn = sc.nextLine();
				if(yn.equals("Yes")) {
					Corona19.h1.rl.remove(element);
					System.out.println("예약이 취소 되었습니다.");
					reserve.reserveStart();
				}else {
					System.out.println("예약 취소가 취소되었습니다.");
					reserve.reserveStart();
					
				}
			}
		}
		
		//아산 병원
		for (Reservelist element : Corona19.h2.rl) {
			if(element.getPhoneNum().equals(endNum)) {
				tf = false;
				System.out.println("===================예약 확인=============================");
				
				System.out.println("이름 : " + element.getName()+ "님" + "\t\t전화번호: " + element.getPhoneNum() );
				System.out.println("예약날짜 " + element.getDayNum() + "\t\t예약병원 : " +Corona19.h2.name);
				System.out.println("======================================================");
				System.out.println("예약을 취소하시겠습니까? [Yes/No]");
				String yn = sc.nextLine();
				if(yn.equals("Yes")) {
					Corona19.h2.rl.remove(element);
					System.out.println("예약이 취소 되었습니다.");
					reserve.reserveStart();
				}else {
					System.out.println("예약 취소가 취소되었습니다.");
					reserve.reserveStart();
					
				}
			}
		}

		//이화여대병원
		for (Reservelist element : Corona19.h3.rl) {
			if(element.getPhoneNum().equals(endNum)) {
				tf = false;
				System.out.println("===================예약 확인=============================");
				
				System.out.println("이름 : " + element.getName() + "\t전화번호 : " + element.getPhoneNum() );
				System.out.println("예약날짜 " + element.getDayNum() + "\t예약병원 : " +Corona19.h3.name);
				System.out.println("======================================================");
				System.out.println("예약을 취소하시겠습니까? [Yes/No]");
				String yn = sc.nextLine();
				if(yn.equals("Yes")) {
					Corona19.h1.rl.remove(element);
					System.out.println("예약이 취소 되었습니다.");
					reserve.reserveStart();
				}else {
					System.out.println("예약 취소가 취소되었습니다.");
					reserve.reserveStart();
					
				}
			}
		}
		if(tf) {
			
				System.out.println("예약 리스트에 존재하지 않습니다.");
			
		}
	}
	
	public static void main(String[] args) {
		
		ReservationCancle rescan = new ReservationCancle();
		rescan.res_cancle();
		
		
	
		
	}

}
