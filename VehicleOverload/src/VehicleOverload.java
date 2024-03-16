public class VehicleOverload {
	static String type = " 4 Wheeler";
	static String manufacturingComp = "Mahindra";
	static double costOfVeh = 1400000;
	static int distanceTravelled = 450000;
	

	public static void getInfo( String type1, String manufacturingComp1, double costOfVeh1, int distanceTravelled1)
	{
		System.out.println("Type	: " + type1+ "Company	: " + manufacturingComp1 + "Cost		: " + costOfVeh1 + "Distance		: " + distanceTravelled1 + " km");
	}
	
	public static void getInfo()
	{
		System.out.println("Type	: " + type + "Company	: " + manufacturingComp + "Cost		: " + costOfVeh + "Distance		: " + distanceTravelled + " km");
	}
	
	public static void main(String[] args) {
		
		getInfo();
		getInfo("2 Wheeler","Bajaj",67000.87,5600); 
		
	}

}
