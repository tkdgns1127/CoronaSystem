import java.util.Scanner;

public class HospitalStart {
	Scanner scanner = new Scanner(System.in);
	
	public String[] hospitallist = { "����뺴��", "�ƻ꺴��", "��ȭ���뺴��" };
	public Hospital01[] hospitalarraylist = { Corona19.h1, Corona19.h2, Corona19.h3 };
	static int chooseHospital;
	
	
	public void start() {


		// ���� ����
		System.out.println("============  2.����    ================");
		System.out.println("���� ������ �����ϼ���!");
		System.out.println("1.����뺴��   2.�ƻ꺴��   3.��ȭ���뺴��");
		System.out.println("=====================================");
		System.out.print("���ڸ� �Է��ϼ��� : ");
		chooseHospital = scanner.nextInt() - 1;
		System.out.println(hospitallist[chooseHospital] + "�� ���õǾ����ϴ�.");
		
		Login login = new Login();
		
		
		login.loginstart(hospitalarraylist[chooseHospital]);
		
		//hospitalstart(chooseHospital);
	}

	public void hospitalstart(int chooseHospital) {
		// ���� �޴�����
		//int chooseHospital = Arrays.asList(hospitalarraylist).indexOf(hospital);
		
		System.out.println("============  " + hospitallist[chooseHospital] + "  ================");
		System.out.println("�޴��� �����ϼ���.");
		System.out.println("1.��� ��ȸ     2.��� ��û     3.���� �������� ����");
		System.out.println("=====================================");
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int choosemenu = scanner.nextInt();

		if (choosemenu == 1) {
			hospitalarraylist[chooseHospital].vaccinsearch();
		} else if (choosemenu == 2) {
			System.out.println(hospitallist[chooseHospital] + "�� ��ſ�û�Դϴ�.");
			System.out.print("�ʿ��� ȭ���� ��ż��� �Է��ϼ��� : ");
			int inputV1 = scanner.nextInt();
			System.out.print("�ʿ��� ����� ��ż��� �Է��ϼ��� : ");
			int inputV2 = scanner.nextInt();
			
			hospitalarraylist[chooseHospital].vaccinrequest(hospitalarraylist[chooseHospital], inputV1, inputV2);

		} else if (choosemenu == 3) {
			start();
		}

	}

	public static void main(String[] args) {
		HospitalStart hospitalstart = new HospitalStart();
		hospitalstart.start();
	}

}
