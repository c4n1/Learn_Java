/*
default: A variable or method declared with no access control modifier is available to any other class in the same package.
public: Accessible from any other class.
protected: Provides the same access as the default access modifier, with the addition that subclasses can access protected methods and variables of the superclass (Subclasses and superclasses are covered in upcoming lessons).
private: Accessible only within the declared class itself.
*/

public class Vehicle {
  private int maxSpeed;
  //constructor sets default value when object is created
  Vehicle() {
  	maxSpeed = 200;
  }
  private int wheels;
  //Constructor that takes a paremeter to initialise
  Vehicle(int x) {
  	wheels = x;
  }
  private String color;
  private double fuelCapacity;

  public void horn() {
    System.out.println("Beep!");
  }

  //getter
  public Double getFuelCapacity(){
  	return fuelCapacity;
  }

  //setter
  public void setFuelCapacity(Double x){
  	this.fuelCapacity = x;
  }

}
