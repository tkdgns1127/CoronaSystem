import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Consult {
	public static ArrayList<Person> coronaTestList = new ArrayList<>();	//�˻� ����Ʈ
		

	
	
	
	public ArrayList<Person> getCoronaTestList() {
		return coronaTestList;
	}





	public void setCoronaTestList(ArrayList<Person> coronaTestList) {
		this.coronaTestList = coronaTestList;
	}





	public void conusltMethod(Scanner scanner) {
		//Person���� �Է�
				
				try {
				System.out.println("�̸��� �Է��ϼ���.");
				String name = scanner.nextLine();
				System.out.println("���̸� �Է��ϼ���.");
				int age = Integer.parseInt(scanner.nextLine());
				System.out.println("��ȭ��ȣ�� �Է��ϼ���.\n ����:010-oooo-oooo");
				String phoneNum = scanner.nextLine();
				
				boolean flag = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", phoneNum);
				if(flag) {
				
				//Person��ü �����Ͽ� ���� ���
				Person person = new Person(name,age,phoneNum);
				
				//����
				ArrayList<String> testList = new ArrayList<>();
				System.out.println();
				System.out.println("�˻��ڸ� �Ǵ��ϱ� ���� ��5���� ������ �մϴ�.\n yes �Ǵ� no�� �Է��ϼ���.");
				System.out.println("Q1)������ ���� ���� �ֳ���?");
				String testA1 = scanner.nextLine();
				testList.add(testA1);
				
				System.out.println("Q2)�ڷγ� 19 �ǽ� ������ �ֳ���?");
				String testA2 = scanner.nextLine();
				testList.add(testA2);
				
				System.out.println("Q3)�ֱ�(14�� �̳�) �ؿܿ��� �ٳ�� ��� �ֳ���?");
				String testA3 = scanner.nextLine();
				testList.add(testA3);
				
				System.out.println("Q4)���Ű��� �� �ֱ�(14�� �̳�) �ؿܿ��� �ٳ�� ��� �ֳ���?");
				String testA4 = scanner.nextLine();
				testList.add(testA4);
				
				System.out.println("Q5)���� ���� �� ���� �ڰ� �ݸ� ���� ������ �ֳ���?");
				String testA5 = scanner.nextLine();
				testList.add(testA5);
				
				//5�� ������ yes���� ����
				int yesCount = 0;
				for (String answer : testList) {
					if(answer.equalsIgnoreCase("yes")) {
						yesCount = yesCount + 1;
					}
				}
			
				
				//[5�� ������ yes�� 3�� �̻��� ��� -> �˻��� ����Ʈ�� �߰�]
				if(yesCount>=3) {
					 //�ڷγ��˻��ڸ���Ʈ�� �߰� 
					coronaTestList.add(person);
					person.setCheck(true);
					System.out.println("�˻��ϼ���.");
					System.out.println("�޴��� �̵��մϴ�.");
				}else {
					System.out.println("�˻� �ش��ڰ� �ƴմϴ�.");
					System.out.println("�޴��� �̵��մϴ�.");
				}
				
				}else {
				System.out.println("��ȭ��ȣ ���Ŀ� ���� �ʽ��ϴ�.");
				}
				
				} catch (Exception e) {
					//e.printStackTrace();
					System.out.println(e.getMessage() + " ���� �߻�");
				} finally {
					Patient.patientStart();
				}
				
	}
	

}