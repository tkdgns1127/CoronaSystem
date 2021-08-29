
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Join {

	// static ArrayList<Membership> member = new ArrayList<Membership>();

	public void join(Hospital01 hospital) {

		int hospital_num = hospital.getUnique_num();
		int unique_num;
		String name;
		String id;
		String pw;

		Scanner sc = new Scanner(System.in);

		System.out.println("���� ���� ��ȣ :");
		try {
			unique_num = sc.nextInt();
			String inputNumber = Integer.toString(unique_num);

			String pattern2 = "^[0-9]*$";

			// ���� �Էµ��� �ʾ�����?

			if (inputNumber.equals("")) {

				System.out.println("��ȣ�� �Էµ��� �ʾҽ��ϴ�. �ٽ� Ȯ�����ּ���.");


				// inputPhoneNumber �Է°��� ���̰� 4�� �ƴϰŰų�, ���ڰ� �ƴҶ�
			} else if (inputNumber.length() != 4 || !Pattern.matches(pattern2, inputNumber)) {
				System.out.println("�ùٸ� ��ȣ ������ �ƴմϴ�. �ٽ� Ȯ�����ּ���.");

			}else {
			
			sc.nextLine();

			System.out.print("�̸� : ");
			name = sc.nextLine();

			System.out.print("���̵� : ");
			id = sc.nextLine();

			System.out.print("��й�ȣ : ");
			pw = sc.nextLine();

			if (unique_num != hospital_num) {
				//System.out.println("���� ������ȣ Ȯ�� : " + hospital_num);// ����������ȣȮ��
				System.out.println(" ���� ���� ��ȣ�� �ٸ��ϴ�.");
				System.out.println(" ȸ�������� �ٽ� ���ּ���.");
				join(hospital);
			} else {

				hospital.member.add(new Membership(unique_num, name, id, pw));
				System.out.println(name + "�� ȸ�������� �����Ͽ����ϴ�.");
			}

			Login login = new Login();
			login.loginstart(hospital);

			}
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
			sc = new Scanner(System.in);
			join(hospital);
		}
	}

	/*
	 * public static ArrayList<Membership> getMember() { return hospital.member; }
	 * public static void setMember(ArrayList<Membership> member) { Join.member =
	 * member; }
	 */

}
