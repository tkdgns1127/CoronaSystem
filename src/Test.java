import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


	//Test�� ���� arr ����
//class A {
//	
//	
//	public static void main(String[] args) {
//		
//		ArrayList<Person> arr = new ArrayList<Person>();
//			
//			arr.add(new Person("������", "01055552222"));
//			arr.add(new Person("ȫ�浿", "01022223333"));
//			arr.add(new Person("����", "01022224444"));
//			
//			Test test = new Test();
//				
//			test.inputInformation(arr);
//	}
//} 

public class Test {
	
// Type 1 - �˻� �� ����
	String inputName;
	String inputPhoneNumber;

	Corona19 c19 = new Corona19();
	public static ArrayList<Person> infectionList = new ArrayList<>();

	public ArrayList<Person> getinfectionList() {
		return infectionList;
	}

	public void setinfectionList(ArrayList<Person> infectionList) {
		this.infectionList = infectionList;
	}
	
	void inputInformation(ArrayList<Person> coronaTestList) {
		
		//Test2 
//		coronaTestList.add(new Person("�׽�Ʈ(2) ����(�⺻)", 22, "010-2555-6666"));
//		for (Person p : coronaTestList) {
//			System.out.println("coronaTestList: " + p.getName());
//		}
		
		Scanner scanner = new Scanner(System.in);

			System.out.println("�̸��� �Է����ּ���.");
			inputName = scanner.nextLine();
			
			System.out.println("��ȭ��ȣ ���ڸ��� �Է����ּ���.");
			inputPhoneNumber = scanner.nextLine();
			
			// ������ ����Ʈ�� �Է°��� ��
			boolean correct = false; 
			Person reservedPerson = null;
			
			for(Person person: coronaTestList) {
				
				String fullNum = person.phoneNum;
				String lastNum = fullNum.substring(9);
				
				if(inputName.equals(person.name) && lastNum.equals(inputPhoneNumber)) { 
					correct = true;
					reservedPerson = person;
					break;
				}	
			}
			
			if(correct) {
				randomTest(reservedPerson);
			} else {
				System.out.println("��ġ�ϴ� ������ �����ϴ�. �޴��� ���ư��ϴ�.");
				
				c19.methodA();
			}
			
			scanner.close();
		} 
		
	
	ArrayList<Person> randomTest(Person person) {
		
		System.out.println("Corona19 �˻縦 �����մϴ�.");

		Random random = new Random();
		person.confirmed = (random.nextInt(2)!= 0);
		
		if(person.confirmed) {
			infectionList.add(person);
			System.out.println("Corona19 �˻� ��� [�缺] �Դϴ�.");
		} else {
			System.out.println("Corona19 �˻� ��� [����] �Դϴ�.");
		}
		
		// Test3
//		for (Person p : infectionList) {
//			System.out.println("infectionList: " + p.getName());
//		}
		
		c19.methodA();
		
		return infectionList;		
	}
}

	
//Type 1 - �˻� �Ŀ��� �̸�/��ȣ ���� �ݺ�

//	public void inputInformation(ArrayList<Person> arr) { 
//		Scanner scanner = new Scanner(System.in);
//		boolean checkReservation = false;
//		
//		while (!checkReservation) {
//			System.out.println("�̸��� �Է����ּ���.");
//			inputName = scanner.nextLine();
//			
//			System.out.println("��ȭ��ȣ ���ڸ��� �Է����ּ���.");
//			inputPhoneNumber = scanner.nextLine();
//					
//			for(Person person: arr) {
//				
//				String fullNum = person.phoneNum;
//				String lastNum = fullNum.substring(7);
//				
//				if(inputName.equals(person.name) && lastNum.equals(inputPhoneNumber)) {
//					
//					System.out.println("Corona19 �˻縦 �����մϴ�.");
//					
//					Random random = new Random();
//					
//					person.confirmed = (random.nextInt(2)!= 0);
//					
//					if(person.confirmed) {
//						infectionList.add(person);
//						System.out.println("Corona19 �˻� ��� [�缺] �Դϴ�."); 
//						// infectionList ���
//						for (Person p : infectionList) {
//							System.out.println("������ �̸�: " + p.getName());
//						}
//					} else  {
//						System.out.println("Corona19 �˻� ��� [����] �Դϴ�.");
//					} 
//				} 
//			} 
//		}
//	}
//}	