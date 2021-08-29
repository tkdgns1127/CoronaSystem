import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {

	String inputName;
	String inputPhoneNumber;
	public static ArrayList<Person> infectionList = new ArrayList<>();		
	
	void inputInformation(ArrayList<Person> arr) {
		Scanner scanner = new Scanner(System.in);
		boolean checkReservation = false;
		
		// 예외 처리
		
		try {
			while (!checkReservation) {
				
				System.out.println("이름을 입력해주세요.");
				inputName = scanner.nextLine();
					
				System.out.println("전화번호 뒷자리를 입력해주세요.");
				inputPhoneNumber = scanner.nextLine();
				
				// inputName에 한글, 영문만 포함되어있는지 체크하는 정규표현식
				String pattern1 = "^[가-힣a-zA-Z]*$";
			
				//inputName 값이 입력되지 않았을때?
				
				if(inputName.equals("")) {
					
					System.out.println("이름이 입력되지 않았습니다. 다시 확인해주세요.");
					continue;	
					
				// inputName 입력값의 길이가 2보다 작거나, 특수문자가 포함되었을 때
				} else if (inputName.length() < 2 || !Pattern.matches(pattern1, inputName)) {
					System.out.println("올바른 이름 형식이 아닙니다. 다시 확인해주세요.");
					continue;
				}
				
				// inputPhoneNumber 숫자만 포함되어있는지 체크하는 정규표현식
				String pattern2 = "^[0-9]*$";
				
				//값이 입력되지 않았을때?
				
				if(inputPhoneNumber.equals("")) {
					
					System.out.println("번호가 입력되지 않았습니다. 다시 확인해주세요.");
					continue;	
					
				// inputPhoneNumber 입력값의 길이가 4가 아니거거나, 숫자가 아닐때
				} else if (inputPhoneNumber.length() != 4 || !Pattern.matches(pattern2, inputPhoneNumber)) {
					System.out.println("올바른 번호 형식이 아닙니다. 다시 확인해주세요.");
					continue;
				}
				
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
			
		} catch (Exception e){
			e.printStackTrace();
			System.out.println("오류가 발생하였습니다. 다시 작성해주세요.");
			Patient.patientStart();
			
		} finally {
			scanner.close();
		}
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
		
		/*
		infectionList 출력 (name) - 확인용
		for (Person p : infectionList) {
			System.out.println("infectionList: " + p.getName());
		}*/
		
		Patient.patientStart();
		
		return infectionList;
	}
} //
