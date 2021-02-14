public class Main {
    public static void main (String[] args) {
        Zoo zoo = new Zoo();
        //Create some listeners
        zoo.registerAnimalAddedListener(new PrintNameAnimalAddedListener(zoo));
        zoo.addAnimal(new Animal("Tiger"));
        PrintNameAnimalAddedListener al1 = new PrintNameAnimalAddedListener(zoo);
        PrintNameAnimalAddedListener al2 = new PrintNameAnimalAddedListener(zoo);
		zoo.registerAnimalAddedListener(al1);
		zoo.registerAnimalAddedListener(al2);
		
		//Add some new animals to the zoo
		zoo.addAnimal(new Animal("Lion"));
		
		//al1 got tired of felines and dips out
		zoo.removeAnimalListener(al1);
		zoo.addAnimal(new Animal("Bear"));
		zoo.addAnimal(new Animal("Kangaroo"));
		
		//now too much for al2, only first one remains (unnamed/not assigned to variable)
		zoo.removeAnimalListener(al2);
		
		//There's one observer left and they're unnamed
		//To show there's only one, we're going to:
		zoo.addAnimal(new Animal("Dragon"));
		String key = "ye";
		String mKey = "ye";
		if(mKey.equals(key)){
            System.out.println("We returned right");
        }
    }
}