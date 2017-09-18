/** 
 * Task 3: Read two numbers from the command line and perform the following 
 * operations:
 * 1) Print them on the terminal
 * 2) Perform addition on the numbers
 * 3) Perform subraction on the numbers
 * Hint : Utilise the functionality of parsing a string(which will be read from 
 * the terminal) to an integer or to a double.
 * Example:
 *      To convert a string to integer:
 *          int a = Integer.parseInt(args[0]);
 *          Double a = Double.parseDouble(args[0]);
	*/
class Numbers {
	public static void main(String[] args) {
		//System.out.println(Double.parseDouble(args[0]));
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double sum = a + b;//Summation
                double sub = a - b;//subtraction
		System.out.println(sum);
                System.out.println(sub);
	}
}
