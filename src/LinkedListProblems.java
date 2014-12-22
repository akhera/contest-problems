
	import java.util.*;
	import java.util.Collections;
	import java.io.*;

	

	public class LinkedListProblems
	{
		

		public static void initList(LLNode head)
		{
			LLNode temp = head;
			int r;
			for(int i = 0;i<10;i++)
			{
				r = (int) (Math.random() * 10) + 1;
				temp.setNext(new LLNode(r)); 
				temp = temp.getNext();
			}
		}

		public static void printList(LLNode head)
		{
			LLNode temp = head;
			while(temp!=null)
			{
				System.out.print(temp);
				temp = temp.getNext();
			}
			System.out.println();

		}

		public static LLNode kthLast(LLNode head)
		{
			
			
		}
		public static int removeDuplicates( )
		{

			return -1;
		}


		public static void main(String[] args) throws FileNotFoundException 
		{
			LLNode head = new LLNode(0);
			initList(head);
			printList(head);

		
		}
	}