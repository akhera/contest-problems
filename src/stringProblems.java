
	import java.util.*;
	import java.util.Collections;
	import java.io.*;

	

	public class stringProblems
	{


		public static char[] escape(char[] str, int true_length)
		{
			int i = true_length - 1;
			while(i >= 0)
			{
				if(str[i] == ' ')
				{
					for(int j = i+1;j<true_length;j++)
					{
						str[j+2] = str[j];

					}
					str[i] = '%';
					str[i+1] = '2';
					str[i+2] = '0';
					i+=3;
				}
				else
				{
					i++;
				}
			}

			return str;
		}

		public static char[] reverse(char[] arr)
		{

			for(int i = 0;i<arr.length/2;i++)
			{
				char temp = arr[i];
				arr[i] = arr[arr.length-1 - i];
				arr[arr.length - 1- i] = temp;

			}

			return arr;


		}

		public static String compress(String str)
		{
			StringBuffer temp = new StringBuffer();
			int i = 0;
			int count = 1;
			while(i < str.length() && temp.length() < str.length())
			{
				if( i!= str.length()-1 && str.charAt(i) == str.charAt(i+1))
				{
					count++;
				}
				else
				{
					temp.append(str.substring(i,i+1) + count);
					count = 1;
				}
				i++;
			}
			if(temp.length() >= str.length())
				return str;
			else
				return temp.toString();
		}

		public static int findPos(char c)
		{
			int pos = Character.toLowerCase(c)- 'a';
			if(pos >=0 && pos<=25)
				return pos;
			else
				return -1;
		}
		public static boolean isPermutation(String s1, String s2)
		{

			int [] counts = new int[26]; 
			if(s1.length()!=s2.length())
				return false;
			for(int i = 0;i<s1.length();i++)
			{
				counts[findPos(s1.charAt(i))]++;
				counts[findPos(s2.charAt(i))]--;

			}

			for(int i =0;i<counts.length;i++)
			{
				if(counts[i]!=0)
					return false;
			}
			return true;

		}



		public static void main(String[] args) throws FileNotFoundException 
		{

			String test =  "hellohowareyou";
			String test2 = "";
			String test3 = "hello";
			System.out.println(reverse(test.toCharArray()));
			System.out.println(reverse(test2.toCharArray()));
			System.out.println(reverse(test3.toCharArray()));


			String first = "hello";
			String second = "";
			System.out.println(isPermutation(first, second));




		}
	}

