

import java.util.ArrayList;

public class Hospital01 {
	
	private int vaccin1;		// ȭ����
	private int vaccin2;		// �����
	
	String name;
	private int unique_num;
	
	Month month = new Month();// �������� �Ǿ�ߵǴµ�
	
	ArrayList<Membership> member = new ArrayList<Membership>();	// ���� ������
	
	ArrayList<Reservelist> rl = new ArrayList<Reservelist>();	// ���� ����Ʈ
	
	
	
	
	
	public Hospital01(int unique_num,int vaccin1, int vaccin2, String name) {
		super();
		this.unique_num = unique_num;
		this.vaccin1 = vaccin1;
		this.vaccin2 = vaccin2;
		this.name = name;
	}
	

	public Hospital01(int unique_num,int vaccin1, int vaccin2) {
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


	
	//Ȯ�� ���� �޼ҵ�(�˻�)
	
	//ġ�� �޼ҵ�(ġ��)
	
	//��� ��ȸ �޼ҵ�
	
	//��� ��û �޼ҵ�
}
