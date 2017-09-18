/** 
 * Task 4: 
 * To read a number from the terminal and perform the summation of all the 
 * numbers starting from 1 till the number provided via the terminal
 * Hint : Use for loop to perform the addition over all the elements
 */
class SumIT {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = 0;		
		for(int i=0; i<n; i=i+1)
		{
			sum = sum + i;
		}
		System.out.println("Summation of numbers from " + 1 + " till " + args[0] + " :is");
		System.out.println(sum);
	}
}
