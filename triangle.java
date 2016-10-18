
import java.util.InputMismatchException;
import java.util.Scanner;

public class triangle {
// this program is for checking if 3 given integers can make a equilateral or isosceles .  
public static void main(String args[]) throws InputMismatchException{
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	if(a <=0 || b<=0 || c<=0){
		System.out.println("invalid sides restart");
	}
	else if (a+b <c || a+c <b || b+c <a){
			System.out.println("Sum of 2 sides must be greater than the third , triangle inquality");
		}
	else if (a == b && a == c){
		System.out.println("Equilateral");
	}
	else if (a == b && a !=c || a == c && a != b || b == c && b !=a){
		System.out.println("Isosceles");
	}
	else if(a+b >c && a+c>b && b+c>a){
		System.out.println("cant be equi or iso but is a valid triangle");
		}
	else 
		System.out.println("can't make a triangle : trianle inequality not satisfied ");
	}
}
