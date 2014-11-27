
	import java.util.*;
	import java.util.Collections;
	import java.io.*;

	

	public class stringProblems
	{


		public static char[] escape(char[] str, int true_length)
		{
			int i = 0;
			while(i < true_length)
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
	}

