package HospitalReserve;
import java.util.ArrayList;
import java.util.Iterator;

public class Month {
	
	ArrayList<Day> day = new ArrayList<>();
	
	Month(){
		
		for(int i =1; i<33; i++) {
			day.add(new Day( Integer.toString(i),true));
		}
		
	}
	
	
	public String TrueFalse(boolean tf) {
		String trueOrfalse = null;
		
		if(tf) {
			trueOrfalse = "O";
		}else {
			trueOrfalse = "X";
		}
		
		return trueOrfalse;
	}
	
	public void calendar(int n) {
		

	
		
		System.out.println("======================= "+n+"¿ù =============================");
		System.out.println();
		
		if(n<8) {
			
			
		for(int j=0; j<3; j++) {
			for(int i=0; i<7; i++) {
				
				System.out.print( i+1+(j*7) +"("+ TrueFalse(day.get(i+(j*7)).isRes_possibility()) +")\t" );
				
				}System.out.println();
			}if((n%2)==0) {
				
				for(int i=0; i<3; i++) {
				
					System.out.print(i+28 + "("+  TrueFalse(day.get(i+28).isRes_possibility()) +")\t");
					
				}
			}else {
				for(int i=0; i<4; i++) {
					System.out.print(i+28 + "(" + TrueFalse(day.get(i+28).isRes_possibility()) +")\t");
				}
			}
		}else {
			for(int j=0; j<3; j++) {
				for(int i=0; i<7; i++) {
						System.out.print( i+1+(j*7) +"("+ TrueFalse(day.get(i+(j*7)).isRes_possibility()) +")\t" );
					}System.out.println();
				}if((n%2)==0) {
					for(int i=0; i<4; i++) {
						System.out.print(i+28 + "("+  TrueFalse(day.get(i+28).isRes_possibility()) +")\t");
					}
				}else {
					for(int i=0; i<3; i++) {
						System.out.print(i+28 + "("+  TrueFalse(day.get(i+28).isRes_possibility()) +")\t");
					}
				}
			
		}
		System.out.println();
		System.out.println("========================================================");
		
	}
	
	
	
	 ArrayList<Day> getDay() {
		return day;
	}

	void setDay(ArrayList<Day> day) {
		this.day = day;
	}


}
