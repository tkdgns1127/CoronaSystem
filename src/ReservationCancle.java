
import java.util.Scanner;

public class ReservationCancle {	//예약 취소 클래스

	Scanner sc = new Scanner(System.in);
	String endNum = "010-7927-7479"; 	// 예약 리스트의 뒷번호
	String phone_num;
	
	
	//예약리스트 조회 & 일치 확인 메소드
	public void res_correct() {
		//phone_num이 예약 리스트에 있는지 확인
		/*
		 * for(; array.size;)
		 * if(예약자.번호.substring(9).equals(phone_num)){
		 *  예약자 리스트 출력
		 * }
			
		 */
	}
	
	
	
	public void res_cancle() {	// 예약 취소 메소드
		
		System.out.println("예약하신 분의 뒷 번호 4자리를 입력하세요");
		System.out.print("뒷 번호 입력 :");
		phone_num = sc.nextLine();
		
		//res_correct();
		
		if(phone_num.equals(endNum.substring(9))) {
			//리스트 출력
			System.out.println("예약 리스트 출력");
			System.out.println("예약을 취소하시겠습니까? [Yes/No]");
			
			if(sc.nextLine().equals("Yes")) {
				System.out.println("예약이 취소되었습니다.");
				System.out.println("환자 메뉴로 이동");
			}else {
				System.out.println("예약이 취소 X");
				System.out.println("환자 메뉴로 이동");
			}
			
		}else{
			System.out.println("예약 리스트에 존재하지 않습니다.");
		};
		
	}
	
	public static void main(String[] args) {
		
		ReservationCancle rescan = new ReservationCancle();
		rescan.res_cancle();
		
		
	
		
	}

}
