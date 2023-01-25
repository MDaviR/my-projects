package CarShop;

public class mananginCars {
	public static void main(String[] args) {

		Car c1 = new Car();
		c1.setManufacturer("VW");
		c1.setModel("Fusca");
		c1.setYear(1977);
		c1.setEngineOn(false);
		c1.setVelocity(0);

		Car c2 = new Car("VW", "Kombi", 1980, false, 0);

		Car c3 = new Car("Chevrolet", "Opala", 1982);
		// System.out.println(c3.getVelocidade());

		c1.details();
		c2.details();
		c3.details();

		System.out.println("---__EngineSituation__---");
		System.out.println(c1.engineSituation());
		System.out.println(c2.engineSituation());
		System.out.println(c3.engineSituation());
		
		System.out.println();//Giving space between functions.
		
		System.out.println("---__StartingTheCar__---");
		System.out.println(c1.engineOn());
		//System.out.println(c2.engineOn());
		//System.out.println(c3.engineOn());
		
		System.out.println();//Giving space between functions.
		
		System.out.println("---_TurnOffTheCar__---");
		//System.out.println(c1.engineOff());
		System.out.println(c2.engineOff());
		System.out.println(c3.engineOff());
	
		System.out.println();
		
		System.out.println("---__EngineSituation__---");
		System.out.println(c1.engineSituation());
		System.out.println(c2.engineSituation());
		System.out.println(c3.engineSituation());
		
		System.out.println(); //Giving space between functions.
		
		System.out.println("---__SpeedUp__---");
		System.out.println(c1.accelerator(30));
		System.out.println(c1.accelerator(20)); // 30 + 20 = 50
		//System.out.println(c2.accelerator(30));
		//System.out.println(c3.accelerator(30));
		
		System.out.println(); //Giving space between functions.
	
		System.out.println("---__Braked__---");
		System.out.println(c1.frear(10)); // -10 de speed
		System.out.println(c2.frear(10));
		System.out.println(c3.frear(10));
		
	}
}
