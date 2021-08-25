import java.util.ArrayList;
import java.util.Scanner;

public class Consult {
	ArrayList<Person> coronaTestList = new ArrayList<>();
		
	
	
	
	
	public ArrayList<Person> getCoronaTestList() {
		return coronaTestList;
	}





	public void setCoronaTestList(ArrayList<Person> coronaTestList) {
		this.coronaTestList = coronaTestList;
	}





	public void conusltMethod(Scanner scanner) {
		//Person정보 입력
				System.out.println("이름을 입력하세요.");
				String name = scanner.nextLine();
				System.out.println("나이를 입력하세요.");
				int age = Integer.parseInt(scanner.nextLine());
				System.out.println("전화번호를 입력하세요.\n 형식:ooo-oooo-oooo");
				String phoneNum = scanner.nextLine();
				
				//Person객체 생성하여 정보 등록
				Person person = new Person(name,age,phoneNum);
				
				//질문
				ArrayList<String> testList = new ArrayList<>();
				System.out.println();
				System.out.println("검사자를 판단하기 위해 총5개의 질문을 합니다.\n yes 또는 no로 입력하세요.");
				System.out.println("Q1)귀하의 몸에 열이 있나요?");
				String testA1 = scanner.nextLine();
				testList.add(testA1);
				
				System.out.println("Q2)코로나 19 의심 증상이 있나요?");
				String testA2 = scanner.nextLine();
				testList.add(testA2);
				
				System.out.println("Q3)최근(14일 이내) 해외여행 다녀온 사실 있나요?");
				String testA3 = scanner.nextLine();
				testList.add(testA3);
				
				System.out.println("Q4)동거가족 중 최근(14일 이내) 해외여행 다녀온 사실 있나요?");
				String testA4 = scanner.nextLine();
				testList.add(testA4);
				
				System.out.println("Q5)동거 가족 중 현재 자가 격리 중인 가족이 있나요?");
				String testA5 = scanner.nextLine();
				testList.add(testA5);
				
				//5개 질문중 yes갯수 세기
				int yesCount = 0;
				for (String answer : testList) {
					if(answer.equalsIgnoreCase("yes")) {
						yesCount = yesCount + 1;
					}
				}
			
				
				//[5개 질문중 yes가 3개 이상일 경우 -> 검사자 리스트에 추가]
				if(yesCount>=3) {
					 //코로나검사자리스트에 추가 
					coronaTestList.add(person);
					person.setCheck(true);
					System.out.println("검사하세요.");
				}else {
					System.out.println("검사 해당자가 아닙니다.");
				}
				
				
	}
	

}