import java.util.ArrayList;

public class Zoo implements ZooSubject{
	private ArrayList<AnimalAddedListener> observers;
	 private Animal latestAnimal;
	 
	 public Zoo () {
	  observers = new ArrayList<AnimalAddedListener>();
	 }
	
	 /* add a registered observer */
	 public void registerAnimalAddedListener(AnimalAddedListener o) {
	  observers.add(o);
	 }
	
	 /* remove a registered observer */
	 public void removeAnimalListener(AnimalAddedListener o) {
	  observers.remove(0);
	 }
	
	 /* notify all registered observers */
	 public void notifyObservers() {
	 for (int i = 0; i < observers.size(); i++) {
		  AnimalAddedListener obs = observers.get(i);
		  obs.update(latestAnimal);
	  }
	 }
	
	 /* bidders invoke this method when they submit a bid */ 
	 public void addAnimal(Animal latestAnimal) {
	  this.latestAnimal = latestAnimal;
	
	  // notify all registered bidders (observers)
	  notifyObservers();  
	 }



}
