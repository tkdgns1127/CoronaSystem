import java.util.ArrayList;
import java.util.Scanner;

import HospitalReserve.Hospital01;

public class Cure {
		ArrayList<Person> treatmentCompletedList = new ArrayList<>();	//완치자 리스트
		ArrayList<Person> antibodyList = new ArrayList<>();				//항생?
		ArrayList<Person> deathList = new ArrayList<>();				//사망자 리스트
		
		
	public void cureMethod(Scanner scanner){
		System.out.println("예약한 병원을 입력하세요.");
		String hospital = scanner.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = scanner.nextLine();
		System.out.println("핸드폰 뒷자리를 입력하세요.");
		String phoneNum4 = scanner.nextLine();
		
		
		//[이름과 뒷번호가 해당 병원(서울대병원) 예약리스트에 있음]
		
		//****해당병원예약리스트을 받아와서 비교해야함
		ArrayList<Person> reserveList = new ArrayList<>();
		
		for (Person person : reserveList) {
			if(person.getName().equals(name) && person.getPhoneNum().substring(9).equals(phoneNum4)) {
				//치료시작함.
				
				int h1vaccin1 = Corona19.h1.getVaccin1();
				int h1vaccin2 = Corona19.h1.getVaccin2();
				int h1vaccinselect = 0;
				int h2vaccin1 = Corona19.h2.getVaccin1();
				int h2vaccin2 = Corona19.h2.getVaccin2();
				int h2vaccinselect = 0;
				int h3vaccin1 = Corona19.h3.getVaccin1();
				int h3vaccin2 = Corona19.h3.getVaccin2();
				int h3vaccinselect = 0;
				
				//해당병원의 백신 개수를 불러와야함(1. 모더나[1개], 2. 화이자[2개])
				if(hospital.equals("서울대병원")) {
					System.out.println("치료를 시작하겠습니다.");
					System.out.println("백신을 선택하세요.");
					System.out.println("1. 모더나[" + h1vaccin1 + "], 2. 화이자["+ h1vaccin2 +"]");
					System.out.println("1 또는 2를 입력하세요");
					h1vaccinselect = Integer.parseInt(scanner.nextLine());
					Corona19.h1.hospitalCure(Corona19.h1, h1vaccinselect);
				}else if(hospital.equals("아산병원")) {
					System.out.println("치료를 시작하겠습니다.");
					System.out.println("백신을 선택하세요.");
					System.out.println("1. 모더나[" + h2vaccin1 + "], 2. 화이자["+ h2vaccin2 +"]");
					System.out.println("1 또는 2를 입력하세요");
					h2vaccinselect = Integer.parseInt(scanner.nextLine());
					Corona19.h1.hospitalCure(Corona19.h2, h2vaccinselect);
				}else if(hospital.equals("이화여대병원")) {
					System.out.println("치료를 시작하겠습니다.");
					System.out.println("백신을 선택하세요.");
					System.out.println("1. 모더나[" + h3vaccin1 + "], 2. 화이자["+ h3vaccin2 +"]");
					System.out.println("1 또는 2를 입력하세요");
					h3vaccinselect = Integer.parseInt(scanner.nextLine());
					Corona19.h1.hospitalCure(Corona19.h3, h3vaccinselect);
				}else {
					System.out.println("병원을 잘못 기입하였습니다.");
					Patient pp = new Patient();
					pp.patientStart();
					break;
				}
				
				
				if(h1vaccinselect==1 || h1vaccinselect == 2 || h2vaccinselect == 1 || h2vaccinselect == 2 || h3vaccinselect == 1 || h3vaccinselect == 2) {
				System.out.println("의사가 치료중입니다.");
				//치료과정
				int randomNum = (int)(Math.random()*100+1);
				if(randomNum<=10) {
					System.out.println("조금더 지켜봐야 할 것 같습니다.");
				}else if(randomNum<=90) {
					//확진자의 경우
					if(person.confirmed = true) {
						System.out.println("완치되었습니다.");
						person.cure = true;
							//완치자리스트에 추가?
						treatmentCompletedList.add(person);
					}else {
						//비확진자의경우
						System.out.println("항체가 생성되었습니다.");
						 	//항체생성 리스트에 추가?
						antibodyList.add(person);
					}
				}else {
					System.out.println("고인의 명복을 빕니다.");
						//사망자리스트에 추가?
					deathList.add(person);
				}
				}
				
				
			}
			//예약리스트에 없을경우
			else {
				System.out.println("예약자명단에 존재하지 않습니다.");
			}
			Patient pp = new Patient();
			pp.patientStart();
		}
		
	}

}