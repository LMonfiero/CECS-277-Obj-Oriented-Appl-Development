import java.text.DecimalFormat;

abstract class Luggage implements Comparable	{
	private double volume;
	private String type;
	
	public Luggage(double mVol, String mType)	{
		volume = mVol;
		type = mType;
	}
	
	//Changed to a super.toString() so I no longer need getters

//	public String getType()	{
//		return type;
//	}
	//Oops. Still need getVol for the "total sum" in ShippingContainer display()
	public double getVol()	{
	return volume;
}
	
	public int compareTo(Object o)	{
		Luggage newLugg = (Luggage) o;
		
		if (this.volume > newLugg.volume)	{
			return 1;
		}
		
		else if (this.volume < newLugg.volume)	{
			return -1;
		}
		
		return 0;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.##");
		return type + ", Volume: " + df.format(volume);
	}
}