package zookeepeer1;

public class Bat extends Mammal {
		
	public Bat() {
		energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Flap flap flap.. the bat flys..");
		energyLevel -=50;
	}

	public void eatHumans() {
		System.out.println("Batman took a bit out of crime...");
		energyLevel +=25;
	}
	
	public void attackTown() {
		System.out.println("The town burns as the bat flys overhead...");
		energyLevel -=100;
	}


	
}
