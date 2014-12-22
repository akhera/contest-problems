	import java.util.*;
	import java.util.Collections;
	import java.io.*;

public class challengeProblems {

	/*
	void delete(Node n)
	{
		if(n == null) //edge case: can't delete empty node
		{
			return;
		}

		if(n.next == null) //if n is the tail
		{
			n = null;
		}
		else //if n is the head or in the middle of the list
		{	
			n.value = n.next.value;
			Node temp = n.next.next;
			free(n.next);
			n.next = temp;
		}
	}
	*/



	public int recursiveBinarySearch(int[] nums, int low, int high, int value)
	{

		int mid = (low+high)/2;
		if(nums[mid] == value)
		{
			return mid;
		}
		if(nums[mid]> value)
		{
			return recursiveBinarySearch(nums, mid, (mid+high)/2, value);
		}
		if(nums[mid] < value)
		{
			return recursiveBinarySearch(nums, (low+high)/2, mid, value);
	
		}

		return 1;
	}



	
	
	public static void main(String[] args) throws FileNotFoundException {


		/*
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(4);
		ll.add(10);
		System.out.println("Original contents of ll: " + ll);


		Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
   		numbers.put("one", 1);
   		numbers.put("two", 2);

   		numbers.put("three", 3);
		*/


   		//char[] name = "Mr John Smith    ".toCharArray();
   		//name = escape(name, name.length);
   		//System.out.println(name.toString());

   		System.out.println(compress("aabcccccaaa"));





		//read from file example
		/*
		ArrayList<Integer> integers = new ArrayList<Integer>(); 
		Scanner fileScanner = new Scanner(new File(args[0]));
		while (fileScanner.hasNext()){
			integers.add(fileScanner.nextInt());
		}
		
		fileScanner.close();

		for(int i = 0;i<integers.size()/2;i++)
		{
			System.out.println(integers.get(i) + " " + integers.get(i+1));
		}
		*/
		

	}
	
	}