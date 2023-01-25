package CarShop;

public class Car {
	private String manufacturer;
	private String model;
	private int year;
	private boolean engineOn;
	private int velocity;
	
	public String frear (int valor) {
		

		if(!this.engineOn) {
			return this.model + " ATENTION: Car engine is ON! The car is stopped!";
			}
		
		//Check if velocity is 0
		if (this.velocity == 0) {
			return this.model + " ATENTION: The car is already stopped!";
			}
				
		//Check if the velocity is negative value
		if ((this.velocity - valor) <  0) {
			this.velocity = 0;
			
			return this.model + " --> BRAKED!!! The car is STOPPED!";
			}
		
		
		// Apply negative value to the velocity
		this.velocity -= valor; // it is equal than this.velocidade = this.velocidade - valor;
		
		return this.model + " BRAKED!!! The actual velocity is: " + this.velocity + "Km/h.";
		}
	
	//Accelerator
	public String accelerator(int valor) {
		
		if (this.engineOn) {
		 
			this.velocity += valor;
			return this.model + " --> ACCELERATED!!! Increased speed!! " + this.velocity + "Km/h";
		} else {
			return this.model + " --> Atention, it's not possible speed up with engineOff, "
					+ "you must turn on the engine;";
			
		} 
		
	}
	
	public String engineOff() {
		
		if (!this.engineOn) {
			return "The engine of " + this.model + " is already off.";
		}
		
		// Check if the velocity of car is equal 0
		if (this.velocity == 0) {
			//shut down the engine
			this.engineOn = false;
			
			return "The engine of " + this.model + " is already off now.";
			
		}
		//Only execute this line when the engine is ON and velocity big than 0
		return "ATENTION: The engine of " + this.model + " can't be turned off because the car is moving.";
	}
	
	
	
	public String engineOn() {
			if ( this.engineOn) {//Start the engine.
				return "The engine of " + this.model + " it was already on.";
			} else { 
				this.engineOn = true;
				return "The engine of " + model + " was started now. ";
			}
		}

	public String engineSituation() {

		if (this.engineOn) {
			return this.model + " --> Engine is ON. ";
		} else {
			return this.model + " --> Engine is Off. ";
		}
		
	}

	public void details() {

		System.out.println("---__Vehicle__---" + "\n");
		System.out.println("Manufacturer: " + this.manufacturer);
		System.out.println("Model: " + this.model);
		System.out.println("Year: " + this.year + "\n");

	}

	// Simple constructor method
	public Car() {
		super();
	}

	// Complex constructor method
	public Car(String manufacturer, String model, int year, boolean engineOn, int velocity) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
		this.engineOn = engineOn;
		this.velocity = velocity;

	}

	// Third custom constructor method
	public Car(String manufacturer, String model, int year) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
		this.engineOn = false;
		this.velocity = 0;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String Manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isEngineOn() {
		return engineOn;
	}

	public void setEngineOn(boolean engineOn) {
		this.engineOn = engineOn;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

}
