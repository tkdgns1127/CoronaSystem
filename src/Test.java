import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Test {
	//Person(String name,int age,String phoneNum, boolean confirmed)
	
	
	
// Type 1 - 검사 후 종료
	String inputName;
	String inputPhoneNumber;
	public static ArrayList<Person> infectionList = new ArrayList<>();		
	
	void inputInformation(ArrayList<Person> arr) {
		Scanner scanner = new Scanner(System.in);
		boolean checkReservation = false;
	
	
		while (!checkReservation) {
			
			System.out.println("이름을 입력해주세요.");
			inputName = scanner.nextLine();
			
			System.out.println("전화번호 뒷자리를 입력해주세요.");
			inputPhoneNumber = scanner.nextLine();
			
			// 예약자 리스트와 입력값을 비교
			boolean correct = false; 
			Person reservedPerson = null;
			
			for(Person person: arr) {
				
				String fullNum = person.phoneNum;
				String lastNum = fullNum.substring(9);
				
				if(inputName.equals(person.name) && lastNum.equals(inputPhoneNumber)) { 
					correct = true;
					reservedPerson = person;
					break;
				}	
			}
			
			if(correct) {
				checkReservation = true;
				randomTest(reservedPerson);
			} else {
				System.out.println("일치하는 정보가 없습니다.");
				Patient.patientStart();
			}
		} ;
		
		scanner.close();
	}
	
	ArrayList<Person> randomTest(Person person) {
		
		System.out.println("Corona19 검사를 시작합니다.");

		Random random = new Random();
		person.confirmed = (random.nextInt(4)!= 0);
		 
		
		if(person.confirmed) {
			infectionList.add(person);
			System.out.println("Corona19 검사 결과 [양성] 입니다.");
		} else {
			System.out.println("Corona19 검사 결과 [음성] 입니다.");
		}
		
		// infectionList 출력 (name) - 확인용
		for (Person p : infectionList) {
			System.out.println("infectionList: " + p.getName());
		}
		
		Patient.patientStart();
		
		return infectionList;
	}
}

