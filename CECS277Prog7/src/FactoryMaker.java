public class FactoryMaker {
    public static AbstractFactory getFactory(String type){
        if (type.equalsIgnoreCase("water"))
            return new waterFactory();
        
        else if(type.equalsIgnoreCase("mineral"))
            return new mineralFactory();
        
        else if(type.equalsIgnoreCase("animal"))
            return new animalFactory();
        
        else if (type.equalsIgnoreCase("plant"))
            return new plantFactory();
        return null;
    }
}
