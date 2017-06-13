import java.util.Scanner; 

class Hello {
	public static void main(String[] args) {
		//Hello World
		String outtext = "please enter an int";
		System.out.println(outtext);

		//User Input
		Scanner input = new Scanner(System.in);
		int integ = input.nextInt();

		//Print int then incriment by one
		System.out.println(integ++);

		//Print int as it is now after being incrimented
		System.out.println(integ);
	}
}