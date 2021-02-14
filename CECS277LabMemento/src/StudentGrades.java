//this is the originator class
public class StudentGrades {
	private String name;
	private int total;
	private char grade;
	private String major;
	public StudentGrades(String inname,int intotal, char ingrade, String inmajor) {
		name=inname;
		total=intotal;
		grade=ingrade;
		major = inmajor;
}
public Memento saveStatetoMemento() {
	return new Memento(name,total,grade, major);
}
public void setTotal(int intotal) {
	total=intotal;
}
public void setGrade(char ingrade) {
	grade = ingrade;
}

public void setMajor(String inmajor)	{
	major = inmajor;
}

public void getStateFromMemento(Memento m) {
	name=m.getName();
	total=m.getTotal();
	grade=m.getGrade();
	major = m.getMajor();
}
public String toString() {
	return ("student: " + name + " grade: " + grade + " total: " + total + " major: " + major);
}
}