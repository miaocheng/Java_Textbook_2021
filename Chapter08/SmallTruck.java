

public class Vehicle	{
	void vehicleRun()	{
		System.out.println("��������ʻ !");
	}
}

public class Truck extends Vehicle	{
	void truckRun()	{
		System.out.println("��������ʻ !");
	}
}

public class SmallTruck extends Truck	{
	protected void smallTruckRun()	{
		System.out.println("΢�Ϳ�������ʻ!");
	}
	
	public static void main(String [] args)
	{
		SmallTruck smalltruck = new SmallTruck();
		smalltruck.vehicleRun();
		smalltruck.truckRun();
		smalltruck.smallTruckRun();
	}
	
}


