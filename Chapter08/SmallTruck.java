

public class Vehicle	{
	void vehicleRun()	{
		System.out.println("汽车在行驶 !");
	}
}

public class Truck extends Vehicle	{
	void truckRun()	{
		System.out.println("卡车在行驶 !");
	}
}

public class SmallTruck extends Truck	{
	protected void smallTruckRun()	{
		System.out.println("微型卡车在行驶!");
	}
	
	public static void main(String [] args)
	{
		SmallTruck smalltruck = new SmallTruck();
		smalltruck.vehicleRun();
		smalltruck.truckRun();
		smalltruck.smallTruckRun();
	}
	
}


