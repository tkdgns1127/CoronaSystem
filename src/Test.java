import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Test {
	//Person(String name,int age,String phoneNum, boolean confirmed)
	
	
	
// Type 1 - �˻� �� ����
	String inputName;
	String inputPhoneNumber;
	public static ArrayList<Person> infectionList = new ArrayList<>();		
	
	void inputInformation(ArrayList<Person> arr) {
		Scanner scanner = new Scanner(System.in);
		boolean checkReservation = false;
	
	
		while (!checkReservation) {
			
			System.out.println("�̸��� �Է����ּ���.");
			inputName = scanner.nextLine();
			
			System.out.println("��ȭ��ȣ ���ڸ��� �Է����ּ���.");
			inputPhoneNumber = scanner.nextLine();
			
			// ������ ����Ʈ�� �Է°��� ��
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
				System.out.println("��ġ�ϴ� ������ �����ϴ�.");
				Patient.patientStart();
			}
		} ;
		
		scanner.close();
	}
	
	ArrayList<Person> randomTest(Person person) {
		
		System.out.println("Corona19 �˻縦 �����մϴ�.");

		Random random = new Random();
		person.confirmed = (random.nextInt(4)!= 0);
		 
		
		if(person.confirmed) {
			infectionList.add(person);
			System.out.println("Corona19 �˻� ��� [�缺] �Դϴ�.");
		} else {
			System.out.println("Corona19 �˻� ��� [����] �Դϴ�.");
		}
		
		// infectionList ��� (name) - Ȯ�ο�
		for (Person p : infectionList) {
			System.out.println("infectionList: " + p.getName());
		}
		
		Patient.patientStart();
		
		return infectionList;
	}
}

