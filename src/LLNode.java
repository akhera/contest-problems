
	import java.util.*;
	import java.util.Collections;
	import java.io.*;

	

	public class LLNode
	{

		private int data;
		private LLNode next = null;;
		private LLNode prev = null;

		public LLNode(int d)
		{
			data = d;

		}

		public void setNext(LLNode temp)
		{
			next = temp;

		}

		public void setPrev(LLNode temp)
		{
			prev = temp;

		}

		public LLNode getNext()
		{
			return next;

		}

		public LLNode getPrev()
		{
			return prev;
		}

		public int getData()
		{
			return data;

		}

		public String toString()
		{
			if(next!=null)
				return data  + "->";
			else
				return ""+ data; 
		}

	}