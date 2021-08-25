package corona;

public class CurePerson extends Person{
	
	private String vaccine;					// 백신(모더나, 화이자)
	private int cure_count = 0;					// 치료 횟수
	private boolean cure = false;			// 완치여부
	
	CurePerson(){
		System.out.println("치료예정자 생성");
	}
	
	public String getVaccine() {
		return vaccine;
	}
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}
	public int getCure_count() {
		return cure_count;
	}
	public void setCure_countUp(int cure_count) {
		this.cure_count = cure_count + 1;
	}
	public boolean isCure() {
		return cure;
	}
	public void setCure(boolean cure) {
		this.cure = cure;
	}
	
	
}
