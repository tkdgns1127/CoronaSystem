
import java.util.Scanner;

public class Membership {

	int unique_num;
	String name;
	String id;
	String pw;
	
	
	public Membership(int unique_num, String name, String id, String pw) {
		super();
		this.name = name;
		this.unique_num = unique_num;
		this.id = id;
		this.pw = pw;
	}


	public int getUnique_num() {
		return unique_num;
	}


	public void setUnique_num(int unique_num) {
		this.unique_num = unique_num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}
	



}
