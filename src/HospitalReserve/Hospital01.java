package HospitalReserve;

import java.util.Scanner;

public class Hospital01 {
	
	int vaccin1;		// ȭ����
	int vaccin2;		// �����
	
	Month month = new Month();// �������� �Ǿ�ߵǴµ�
	
	
	public Hospital01(int vaccin1, int vaccin2) {
		super();
		this.vaccin1 = vaccin1;
		this.vaccin2 = vaccin2;
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
	public void hospitalCure(Hospital01 hospital,int vaccinSelect) {
		if(vaccinSelect == 1) {
			hospital.setVaccin1(hospital.getVaccin1()-1);
		}else if(vaccinSelect == 2){
			hospital.setVaccin2(hospital.getVaccin2()-1);
		}else{
			System.out.println("�߸� �����ϼ̽��ϴ�.");
		}
	}
	//�����ȸ �޼ҵ�
	
	//��� ��û �޼ҵ�
}
