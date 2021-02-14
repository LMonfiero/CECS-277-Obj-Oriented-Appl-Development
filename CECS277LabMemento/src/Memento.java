public class Memento {
	private String name;
	private int total;
	private char grade;
	private String major;

	 public Memento(String inname,int intotal, char ingrade, String inmajor) {
		name=inname;
		total=intotal;
		grade=ingrade;
		major = inmajor;
	}

	public String getName () {
		return name;
	}

	public int getTotal() {
		return total;
	}

	public char getGrade() {
		return grade;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String toString() {
		return ("Memento student: " + name + " grade: " + grade + " total: " + total + " major: " + major);
}
}
