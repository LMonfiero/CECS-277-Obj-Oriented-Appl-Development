import java.util.ArrayList;

public class PrintNameAnimalAddedListener implements AnimalAddedListener {
	 
	 
	 private ZooSubject theZoo;
		
		public PrintNameAnimalAddedListener(ZooSubject theZoo) {
			this.theZoo = theZoo;
			theZoo.registerAnimalAddedListener(this);
		}

		// this is invoked when the state of the zoo has changed
		public void update(Object newState) {
			Animal latestAnimal = (Animal)newState;
			display(latestAnimal);
		}
		
		public void display(Animal latestAnimal) {
			System.out.println("Added a new animal with " + latestAnimal);
		}
}
