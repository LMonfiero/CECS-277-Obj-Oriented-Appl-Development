package cecs277MementoLab;

public enum DaysOfTheWeek {
	MONDAY_WEDNESDAY, TUESDAY_THURSDAY, FRIDAY, SATURDAY;
	
	public String to_string()	{
		String day = "";
		String[] str = this.name().split("_");
		if (str.length > 1)	{	day = " " + str[1].substring(0, 1).toUpperCase() + str[1].substring(1).toLowerCase();	}
		
		return str[0].substring(0, 1).toUpperCase() + str[0].substring(1).toLowerCase() + day;
	}
}
