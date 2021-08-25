import java.util.ArrayList;
import java.util.Scanner;

public class Cure {
		ArrayList<Person> treatmentCompletedList = new ArrayList<>();
		ArrayList<Person> antibodyList = new ArrayList<>();
		ArrayList<Person> deathList = new ArrayList<>();
		
		
	public void cureMethod(Scanner scanner){
		System.out.println("예약한 병원을 입력하세요.");
		String hospital = scanner.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = scanner.nextLine();
		System.out.println("핸드폰 뒷자리를 입력하세요.");
		String phoneNum4 = scanner.nextLine();
		
		 
		//[이름과 뒷번호가 해당 병원(서울대병원) 예약리스트에 있음]
		//해당병원리스트에서 비교해야함
		ArrayList<Person> reserveList = new ArrayList<>();
		for (Person person : reserveList) {
			if(person.getName().equals(name) && person.getPhoneNum().substring(9).equals(phoneNum4)) {
				//치료시작함.
				System.out.println("치료를 시작하겠습니다.");
				System.out.println("백신을 선택하세요.");
					/*
				  		해당병원의 백신 개수를 불러와야함.?
				  		(1. 모더나[1개], 2. 화이자[2개])
					 */
				String vaccinselect = scanner.nextLine();
				
				//모더나를 선택한 경우
				if(vaccinselect.equals("1")) {
					/*
				 		백신을 선택하면서 해당병원의 백신 개수차감.?
					 */
					//치료횟수 증가
					person.setCure_count(0);
					//어떤 백신을 맞았는지 저장
					person.setVaccine("모더나");
					
				}else if(vaccinselect.equals("2")) {
					/*
			 		백신을 선택하면서 해당병원의 백신 개수차감.?
					 */
					//치료횟수 증가
					person.setCure_count(0);
					//어떤 백신을 맞았는지 저장
					person.setVaccine("화이자");
				
				}else {
					System.out.println("숫자를 잘못 기입하였습니다.");
					break;
				}
				
				
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
			//예약리스트에 없을경우
			else {
				System.out.println("예약자명단에 존재하지 않습니다.");
			}
			
		}
		
	}
	

}