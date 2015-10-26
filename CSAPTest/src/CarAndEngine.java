
public class CarAndEngine {
	public static void main(String args[])
	{
		Car car = new Car("Ford",350);
		System.out.println("Car Constructor Called");
		car.getData();
		System.out.println("Engine Constructor Called");
		car.getHorse();
		
	}
}


class Engine
{
	public int horsePower;
	
	public Engine()
	{
		horsePower = 350;
	}
	
	public int getHorse()
	{
		return horsePower;
	}

	

}


class Car
{
	String type;
	Engine engine;
	
	public Car() {
		horsePower = 350;
	}

	public String getData()
	{
		return type;
		return engine;
	}
	
	
		

}
