
import java.util.Arrays;

public class SortingAndSearching {



	public static int recursiveBinarySearch(int[] nums, int low, int high, int value)
	{

		int mid = (low+high)/2;
		if(low > high || high < low)
			return -1;
		if(nums[mid] == value)
			return mid;
		if(nums[mid]> value)
			return recursiveBinarySearch(nums, low, mid-1, value);
		else
			return recursiveBinarySearch(nums, mid+1, high, value);	
	}



	public static int iterativeBinarySearch(int[] nums, int value)
	{
		int low = 0;
		int high = nums.length-1;
		while(low <= high)
		{
			int mid = (low+high)/2;
			if(nums[mid] == value)
				return mid;
			if(nums[mid] > value)
				high = mid-1;
			else
				low = mid+1;
			
		}
		return -1;
	}


	/*Array of size (n-m) with numbers from 1..n with m of them missing. Find one all of the missing numbers in O(log). Array is sorted. 

	Example: 
	n = 8 
	arr = [1,2,4,5,6,8] 
	m=2 
	Result has to be a set {3, 7}.*/
	public static ArrayList<Integer> findMissingNumbers(int[] nums, int m, int n)
	{
		int low = 0;
		int high = nums.length-1;
		int foundNums = 0;
		ArrayList<Integer> missingNums = new ArrayList<Integer>();
		if(m == 0)
			return missingNums;
		while(foundNums < m && low <= high)
		{
			int mid = (low+high)/2;
			if(nums[mid] > mid+1)
				high = mid-1;
			else
				low = mid+1;
			
		}
		return -1;
	}



	
	
	public static void main(String[] args)  {

		int [] nums = new int[10];
		for(int i = 0;i<10;i++)
		{
			nums[i] = i; 
		}
		
		System.out.println(Arrays.toString(nums));
		System.out.println(recursiveBinarySearch(nums, 0,nums.length-1, 2));
		System.out.println(iterativeBinarySearch(nums, 2));

	}
	
	}