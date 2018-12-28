class Vehicle{
	int passengers;
	int fuelcap;
	int mpg;
	
	//with no returen value
	void range(){
		System.out.println("Range is " + fuelcap * mpg);
	}
	
	//with return value
	int range1(){
		return fuelcap * mpg;
	}
	
	//calculate the need of fuel
	double fuelneeded(int miles){
		return (double) miles /mpg;
	}
}

class AddMeth{
	public static void main(String [] args){
		Vehicle minivan = new Vehicle();
		
		int ranges;
		int range1;
		int dist = 252;
		
		minivan.passengers = 12;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		minivan.range();
		range1 = minivan.range1();
		System.out.println("Minivan can carry " + minivan.passengers + " .");
		System.out.println("Minvan can run " + range1 + "  miles ");
		
		System.out.println( dist + " miles need " +  minivan.fuelneeded(dist) + " liters");
	}
}