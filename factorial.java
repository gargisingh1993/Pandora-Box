// How to calculate factorial of a number 


import java.io.*;
import java.util.Scanner;

public class factorial {
	// factorial formula function 
	public static int numbers(int i){
		//System.out.println(i);
		if(i==1)
			return 1;
		if(i == 0)
			return 1;
		else if(i<0)
		{
			System.out.println("negative value");
			return i;
		}
		else{
			int j = 0;
			j =  i*numbers(i-1);
			return j;
		}
		
		}
public static void main(String[] args) throws IOException{
		int i;
		Scanner kb = new Scanner(System.in);
		i = (kb).nextInt();
		System.out.println(numbers(i));
}
}