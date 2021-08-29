import java.util.Scanner;
import java.util.InputMismatchException;

public class HospitalStart {

	public String[] hospitallist = { "����뺴��", "�ƻ꺴��", "��ȭ���뺴��" };
	public Hospital01[] hospitalarraylist = { Corona19.h1, Corona19.h2, Corona19.h3 };
	static int chooseHospital;

	public void start() {
		Scanner scanner = new Scanner(System.in);

		// ���� ����
		System.out.println("============  2.����    ================");
		System.out.println("���� ������ �����ϼ���!");
		System.out.println("1.����뺴��   2.�ƻ꺴��   3.��ȭ���뺴��   4.���θ޴��� ������");
		System.out.println("=====================================");
		System.out.println("���ڸ� �Է��ϼ��� : ");

		try {
			chooseHospital = scanner.nextInt() - 1;
			switch (chooseHospital) {
			case 0:
			case 1:
			case 2:
				Login login = new Login();
				System.out.println(hospitallist[chooseHospital] + "�� ���õǾ����ϴ�.");
				login.loginstart(hospitalarraylist[chooseHospital]);
				break;
			case 3:
				Corona19 corona19 = new Corona19();
				corona19.coronaSystem();
				break;
			default:
				System.out.println("�ٽ� �Է��ϼ���.");
				start();
				break;
			}

		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
			start();

		}

	}

	public void hospitalstart(int chooseHospital) {
		Scanner scanner = new Scanner(System.in);
		// ���� �޴�����
		// int chooseHospital = Arrays.asList(hospitalarraylist).indexOf(hospital);

		System.out.println("============  " + hospitallist[chooseHospital] + "  ================");
		System.out.println("�޴��� �����ϼ���.");
		System.out.println("1.��� ��ȸ     2.��� ��û     3.���� �������� ����");
		System.out.println("=====================================");
		System.out.print("���ڸ� �Է��ϼ��� : ");

		try {
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
			} else {
				System.out.println("�ٽ� �Է��ϼ���.");
				hospitalstart(chooseHospital);
			}
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
			hospitalstart(chooseHospital);
		}

	}

	public static void main(String[] args) {
		HospitalStart hospitalstart = new HospitalStart();
		hospitalstart.start();
	}

}
