public class TestMemento {
	public static void main(String [] args) {
		StudentGrades abc = new StudentGrades("sam",15,'c', "Computer Science");
		CareTaker ct = new CareTaker();
		System.out.println("original state 0: " + abc);
		ct.add(abc.saveStatetoMemento());
		abc.setTotal(20);
		abc.setGrade('x');
		abc.setMajor("Computer Engineering");
		System.out.println("original state 1: " + abc);
		ct.add(abc.saveStatetoMemento());
		abc.setTotal(30);
		abc.setGrade('a');
		abc.setMajor("Biochem");
		System.out.println("original state 2: " + abc);
		ct.add(abc.saveStatetoMemento());
		abc.setTotal(50);
		abc.setGrade('q');
		abc.setMajor("Biomedical Engineering");
		System.out.println("original state 3: " + abc);
		ct.add(abc.saveStatetoMemento());
		abc.getStateFromMemento(ct.get(2));
		System.out.println("memento state 2: " + abc);
		abc.getStateFromMemento(ct.get(1));
		System.out.println("memento state 1: " + abc);
	}
}
