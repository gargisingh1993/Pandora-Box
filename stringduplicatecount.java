import java.io.*;
import java.util.*;

// Count the number of duplicate characters in a string using hash map

public class stringduplicatecount {
	public static void main(String args[]) throws IOException {
		String ch;
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter the string you want to match:");
		ch = br.readLine();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for (int i=0;i<ch.length();i++)
		{
			if(!hm.containsKey(ch.charAt(i))){
				hm.put(ch.charAt(i), (Integer)1);
			}
			else{
				hm.put(ch.charAt(i),hm.get(ch.charAt(i))+1);
				//System.out.println(ch.charAt(i)); 				To print the first repeating character 
			}
		}
		System.out.println("The Characters are:"+hm);
		
		}

}
