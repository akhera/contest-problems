
	import java.util.*;
	import java.util.Collections;
	import java.io.*;

	

	public class arrayProblems
	{

		public static int challengeProblem2(int[] nums)
		{
			//You are given an unsorted array of integers that contain duplicate numbers. 

			//Only one number is duplicated odd number of duplications, other numbers are repeated even number of duplications. 

			//Find this number
			HashMap<Integer,Integer> values = new HashMap<Integer, Integer>();
			Integer count = null;
			for(int i = 0;i<nums.length;i++)
			{
				values.put(nums[i],values.get(nums[i]+1));
				
			}
			
			for(Map.Entry <Integer,Integer> entry: values.entrySet())
			{
				 count =  entry.getValue();
				if(count%2 != 0)
				{
					count =  entry.getKey();
					break;
				}
			}
			
			return count;
		}

		public static int[][] rotate(int [][]nums)
		{
			for(int depth =0;depth<nums.length/2;depth++)
			{

				for(int width = 0;width<nums.length-depth;width++)
				{
					nums[width+ depth][width] = nums[width][width+ depth]; 

				}

			}

			return nums;
		}


		public static Map.Entry<Integer,Integer> twoSum()
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
			
			for(Map.Entry<Integer, Integer> entry: differences.entrySet())
			{
				if(differences.containsKey(entry.getValue()))
				{
						pair = entry;
						break;
				}
			}
			
			return pair;	
		}

		public static int removeDuplicates(int [] arr)
		{
			
			for(int i = 0;i<arr.length;i++)
			{
				
				

			}





		}


	}