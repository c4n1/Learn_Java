/*
Classes and Objects
*/

class Hello2 {

	//Method sayHello which takes the string name as an argument
	static void sayHello(String name) {
    	System.out.println("Hello " + name);
 	}

	//Return note the return type is defined where void went previously
	static int sum(int val1, int val2) {
  		return val1 + val2;
  	}





	public static void main(String[ ] args) {
    	sayHello("Jesus");
    	System.out.println(sum(2, 2));
	}

}

//Creating classes and using a method from the class
class use_Animals {
	public static void main (String[] args) {
		Animal dog = new Animal();
		dog.bark();
	}
}


//Adding attributes to a class
class add_bottles {
	public static void main(String[] args) {
		wine w1 = new wine();
		wine w2 = new wine();	

		w1.colour = "red";
		w2.drink();
	}
}


//User getters and setters
class getset_vehicles{
	public static void main (String[] args) {
		//Add Vehicle
		Vehicle v1 = new Vehicle();
		v1.setFuelCapacity(12.56);
		System.out.println(v1.getFuelCapacity());
	}
}

//Using constructors
class Constructors {
  public static void main(String[ ] args) {
    Vehicle v = new Vehicle(4);
  }
}