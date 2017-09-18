// Task 5:

class Display {
	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		for(int i=1; i<=num; i=i+1)
		{
			System.out.println("Argument " + i + " is: " + args[i]);
		}
	}
		
}
