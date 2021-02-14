import java.util.ArrayList;
import java.util.Random;
public class planet {
    int total = 0;
    String officialName;
    int planetSize;
    int waterDist, mineralDist, plantDist, animalDist;
    ArrayList<waterObject> waterList = new ArrayList <waterObject>();
    ArrayList<animalObject> animalList = new ArrayList<animalObject>();
    ArrayList<plantObject> plantList = new ArrayList<plantObject>();
    ArrayList<mineralObject> mineralList = new ArrayList <mineralObject>();

    AbstractFactory waterFac = FactoryMaker.getFactory("water");
    AbstractFactory mineralFac = FactoryMaker.getFactory("mineral");
    AbstractFactory plantFac = FactoryMaker.getFactory("plant");
    AbstractFactory animalFac = FactoryMaker.getFactory("animal");

//    planet(int water, int mineral, int animal, int plant, String name)
    planet(int size, String name, int water, int mineral, int animal, int plant)	{
        Random randomizer = new Random();
        this.waterDist = water;
        this.mineralDist = mineral;
        this.plantDist = plant;
        this.animalDist = animal;
        this.officialName = name;
        if (size == 1)	{
        	this.planetSize = randomizer.nextInt(500 - 200 + 1) + 1;
        }
        
        else if (size == 2)	{
        	this.planetSize = randomizer.nextInt(1000 - 501 + 1) + 1;
        }
        
        else if (size == 3)	{
        	this.planetSize = randomizer.nextInt(1500 - 1001 + 1) + 1;
        }
        
        else if (size == 4)	{
        	this.planetSize = randomizer.nextInt(10000 - 1501 + 1) + 1;
        }

        //Populate the planet randomly
        for (int i = 0; i < waterDist; i++) {
            waterObject item = (waterObject) waterFac.getObject(randomizer.nextInt(4));
            total += item.getImpact();
            waterList.add(item);
        }
        
        for (int j = 0; j < mineralDist; j++)   {
            mineralObject item = (mineralObject) mineralFac.getObject(randomizer.nextInt(4));
            total += item.getImpact();
            mineralList.add(item);
        }
            
        for (int k = 0; k < plantDist; k++)	{
        	plantObject item = (plantObject) plantFac.getObject(randomizer.nextInt(4));
        	total += item.getImpact();
        	plantList.add(item);
        }

        for (int l = 0; l < animalDist; l++)  {
            animalObject item = (animalObject) animalFac.getObject(randomizer.nextInt(4));
            total += item.getImpact();
            animalList.add(item);
        }
    }

    public String toString()    {
        return "Planet name: " + officialName + ", Terra Objects: " + planetSize + ", Impact Score:" + total;
    }
    
    public void allWater()    {
        for(int i = 0; i < waterList.size(); i++)        {
            System.out.println((i + 1) + ":" + waterList.get(i).toString());
        }
    }
    
    public void allAnimals()    {
        for(int i = 0; i < animalList.size(); i++)        {
            System.out.println((i + 1) + ":" + animalList.get(i).toString());
        }
    }
    
    public void allMinerals()    {
        for(int i = 0; i < mineralList.size(); i++)        {
            System.out.println((i + 1) + ":" + mineralList.get(i).toString());
        } 
    }
    
    public void allPlants()    {
        for(int i = 0; i < plantList.size(); i++)        {
            System.out.println((i + 1) + ":" + plantList.get(i).toString());
        }
    }
}
