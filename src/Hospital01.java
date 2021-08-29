
import java.util.ArrayList;

public class Hospital01 {

	private int vaccin1; // ȭ����
	private int vaccin2; // �����

	String name; // ���� �̸�
	private int unique_num; // ���� ���� ��ȣ

	Month month = new Month(); // Ķ����

	ArrayList<Membership> member = new ArrayList<Membership>(); // ���� ������

	ArrayList<Reservelist> rl = new ArrayList<Reservelist>(); // ���� ����Ʈ

	public Hospital01(int unique_num, int vaccin1, int vaccin2, String name) {
		super();
		this.unique_num = unique_num;
		this.vaccin1 = vaccin1;
		this.vaccin2 = vaccin2;
		this.name = name;
	}

	public Hospital01(int unique_num, int vaccin1, int vaccin2) {
		super();
		this.unique_num = unique_num;
		this.vaccin1 = vaccin1;
		this.vaccin2 = vaccin2;
	}

	public int getUnique_num() {
		return unique_num;
	}

	public void setUnique_num(int unique_num) {
		this.unique_num = unique_num;
	}

	public int getVaccin1() {
		return vaccin1;
	}

	public void setVaccin1(int vaccin1) {
		this.vaccin1 = vaccin1;
	}

	public int getVaccin2() {
		return vaccin2;
	}

	public void setVaccin2(int vaccin2) {
		this.vaccin2 = vaccin2;
	}

	// Ȯ�� ���� �޼ҵ�(�˻�)

	// ġ�� �޼ҵ�(ġ��)
	public void hospitalCure(Hospital01 hospital, int vaccinSelect) {
		if (vaccinSelect == 1) {
			hospital.setVaccin1(hospital.getVaccin1() - 1);
		} else if (vaccinSelect == 2) {
			hospital.setVaccin2(hospital.getVaccin2() - 1);
		} else {
			System.out.println("�߸� �����ϼ̽��ϴ�.");
		}
	}

	// ��� ��ȸ �޼ҵ�
	public void vaccinsearch() {// ��� ��ȸ
		System.out.println("������ ���� ��� ����");
		System.out.println("ȭ���� : " + getVaccin1());
		System.out.println("����� : " + getVaccin2());

		HospitalStart hs = new HospitalStart();
		System.out.println("chooseHospital : " + hs.chooseHospital);
		hs.hospitalstart(hs.chooseHospital);
	}

	// ��� ��û �޼ҵ�
	// ��� ��û �޼ҵ�
	public void vaccinrequest(Hospital01 hospital, int inputV1, int inputV2) {
		Supplyer supplyer = new Supplyer();
		if ((inputV1 <= supplyer.sv1) && (inputV2 <= supplyer.sv2)) {
			supplyer.supply(hospital, inputV1, inputV2);
			System.out.println("ȭ���� " + inputV1 + "���� " + "����� " + inputV2 + "���� �ֹ��Ǿ����ϴ�.");
			System.out.println("����  ȭ���� " + vaccin1 + "���� " + "����� " + vaccin2 + "���� ������ �ֽ��ϴ�.");
		} else if ((inputV1 > supplyer.sv1) && (inputV2 > supplyer.sv2)) {
			System.out.println("ȭ���� �� ������� ������ �����մϴ�.");
			System.out.println("���� �ֹ� ������ ȭ���� ���� : " + supplyer.sv1 + " / ����� ���� : " + supplyer.sv2);
		} else if (inputV1 > supplyer.sv1) {
			System.out.println("ȭ������ ������ �����մϴ�. ���� �ֹ� ������ ȭ���� ���� : " + supplyer.sv1);
		} else if (inputV2 > supplyer.sv2) {
			System.out.println("������� ������ �����մϴ�. ���� �ֹ� ������ ����� ���� : " + supplyer.sv2);
		}

		HospitalStart hs = new HospitalStart();
		// hs.hospitalstart(HospitalStart.chooseHospital);
		hs.hospitalstart(hs.chooseHospital);
	}

	public void add(int inputV1, int inputV2) {

		this.vaccin1 += inputV1;
		this.vaccin2 += inputV2;
	}

	class Supplyer {

		int sv1 = 100; // �����ڰ� ���� ȭ����
		int sv2 = 100; // �����ڰ� ���� �����

		public void supply(Hospital01 hospital, int inputV1, int inputV2) {
			sv1 -= inputV1;
			sv2 -= inputV2;

			hospital.add(inputV1, inputV2);
		}
	}
}
