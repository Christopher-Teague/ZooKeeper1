package zookeepeer1;

	public class Gorilla extends Mammal {
		

		public void throwSomething() {
			System.out.println("The gorilla has thrown something at you!");
			energyLevel -= 5;
		}
		
		public void eatBananas() {
			System.out.println("Food makes the Gorilla happy!");
			energyLevel += 10;
		}
		
		public void climb() {
			System.out.println("The Gorilla is now up in a tree...");
			energyLevel -= 10;
		}
		
}
