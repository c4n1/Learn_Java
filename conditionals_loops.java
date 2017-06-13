/*

Conditionals and Loops

*/

import java.util.Scanner; // Allows input

class condloop {
	public static void main(String[] args) {
		//Some Setup
		System.out.println("Enter an int");
		Scanner input = new Scanner(System.in);
		int input_int = input.nextInt();

		System.out.println("\nDoes yout int = 7 or 8?");
		if(input_int == 7){ // Avaliable comparison operators are <, >, !=, ==, <=, >=
			System.out.println("Yes \n");
		}
		else if (input_int == 8) {
			System.out.println("Yes \n");
		}
		else {
			System.out.println("No \n");
		}

		System.out.println("\nDoes yout int = 9 or 10?");
		if (input_int >= 9 && input_int <= 10) { //Can also use || for or
			System.out.println("Yes \n");
		}
		else {
			System.out.println("No \n");
		}

		System.out.println("\nDoes yout int work out to be a day of the week Sun-Sat 1-7?");
		switch(input_int){
			case 1:
				System.out.println("Matches Sunday \n");
				break;
			case 2:
				System.out.println("Matches Monday \n");
				break;
			case 3:
				System.out.println("Matches Tuesday \n");
				break;
			case 4:
				System.out.println("Matches Wednesday \n");
				break;
			case 5:
				System.out.println("Matches Thursday \n");
				break;
			case 6:
				System.out.println("Matches Friday \n");
				break;
			case 7:
				System.out.println("Matches Saturday \n");
				break;
			default:
				System.out.println("No Match \n");
		}

		System.out.println("\nLets count down from your int to 0");
		int count_int = input_int;
		while (count_int >= 0) {
			System.out.println(count_int--);
		}

		System.out.println("\nLets count up in 10's from your int until we reach >100");
		for (count_int = input_int; count_int <= 100; count_int = count_int + 10) { // for (initialization; condition; increment/decrement)  initialisation cannot be a straight number
			System.out.println(count_int);
		}

		System.out.println("\nCounting from 0-10 one by one only printing even numbers ");
		count_int = 0;
		do {
			count_int++;
			if (count_int == 1 || count_int == 3 || count_int == 5 || count_int == 7 || count_int == 9){
				continue;
			}
			System.out.println(count_int);
		}
		while (count_int < 10);
	}
}