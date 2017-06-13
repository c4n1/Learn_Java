public class Bird {

	//Define atribute of object
	private String colour;

	//Setter for attribute
	public void setColour(String col) {
		this.colour = col;
	}

	//Getter for attribute
	public String getColour() {
		return colour;
	}

	//Constructor with default value
	Bird() {
		this.setColour("Blue");
	}
	Bird(String co){
		this.setColour = co;
	}

}