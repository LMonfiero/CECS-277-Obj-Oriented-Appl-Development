package cecs277RoachMotel;

/**
 * The RefillBar class.
 * @author Neiman Peralta, Neil Manansala, Wei-Hao Chiang
 * @version 2020-05-05
 */

public class RoachColony {
	
	/** The name of RoachColony */
	private String name;
	
	/** The population of RoachColony */
	private int population;
	
	/** The growth rate of RoachColony */
	private double growthRate;
	
	private MotelRoom currentRoom;
	
	/** default constructor */
	public RoachColony() {}
	
	/** Constructor of RoachColony */
	public RoachColony(String name, int population, double growthRate) {
		this.name = name;
		this.population = population;
		this.growthRate = growthRate;
	}
	
	/**
	 * Get the name
	 * @return The name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Get the population
	 * @return The population
	 */
	public int getPopulation() {
		return population;
	}
	
	/**
	 * Get the Growth Rate
	 * @return The Growoth Rate
	 */
	public double getGrowthRate() {
		return growthRate;
	}
	
	/**
	 * Set the name
	 * @param name The name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Set the population
	 * @param pop The population
	 */
	public void setPopulation(int pop) {
		this.population = pop;
	}
	
	/**
	 * Set the Growth Rate
	 * @param growth The Growth Rate
	 */
	public void setGrowthRate(double growth) {
		this.growthRate = growth;
	}
	
	//Es janky
	public MotelRoom getRoom() { return currentRoom; }
	
	public void setRoom(MotelRoom room) { this.currentRoom = room; }
	
	
	public void party() {
		//When party is thrown - increase pop by growth rate
		this.population *= this.growthRate;
		//If spray resistant shower, lose only 25% of population
		RoachMotel.spray(this);
	}
	
	@Override
	public String toString() {
		return "The Colony: " + this.name + " " + this.population;
	}
	
	
	
	
	
}// end RoachColony
