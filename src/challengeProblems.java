import java.util.HashMap;
import java.util.Map;


public class challengeProblems {

	public static int euler_problem1()
	{
		// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
		//Find the sum of all the multiples of 3 or 5 below 1000.
		int sum = 0;
		
		for(int i = 1;i<1000;i++)
		{
			if(i%3==0 || i%5==0)
				sum+=i;	
		}
		return sum;
	}
	
	
	public static int euler_problem2(int term)
	{
		//Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
		//By starting with 1 and 2, the first 10 terms will be:1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
		//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
		
		
		int sum = 0;
		int fib = 0;
		int num1 = 1;
		int num2 = 2;
		for(int i = 0;i<term;i++)
		{
			fib = num1+num2;
			if(fib%2 == 0)
				sum+=fib;
			num1 = num2;
			num2= fib;	
		}
		return fib;
	}
	
	public static Map.Entry<Integer,Integer> challengeProblem1()
	{
		//An array contains the following elements [9,6,-3,1,7] and a value is equal to 4.
		//Find a pair of numbers in the array that equal the sum.
		int[] nums = {9,6,-3,1,7};
		Map.Entry<Integer, Integer> pair = null;
		HashMap<Integer,Integer> differences = new HashMap<Integer, Integer>();
		for(int i = 0;i<nums.length;i++)
		{
			differences.put(nums[i],4 -nums[i]);  
		}
		
		for(Map.Entry entry: differences.entrySet())
		{
		
			if(differences.containsKey(entry.getValue()))
			{
					pair = entry;
					break;
			}
			
			
		}
		
		return pair;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	//Test
		
		//System.out.println(challengeProblem1());
		
		

	}

}