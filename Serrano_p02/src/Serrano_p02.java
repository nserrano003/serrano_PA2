import java.util.*;
import java.util.Scanner;



public class Serrano_p02 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int a;
		int b;
		int g;
		int w;
		int h;
		int f = 0;
		System.out.println("Give me your weight in pounds");
		w = scnr.nextInt();
		System.out.println("Give me your height in inches");
		h = scnr.nextInt();
		a = (703 * w)/(h * h);
		System.out.println("Give me your weight in kilograms");
		w = scnr.nextInt();
		System.out.println("Give me your height in meters");
		h = scnr.nextInt();
		b = w/(h * h);
		System.out.println("Choose how you want to calculate height and weight: \n 1.pounds and inches \n 2. kilograms and Meters");
		g = scnr.nextInt();
		if(g == 1)
			System.out.println(a);
		if(g == 2)
			System.out.println(b);
		BMI_1(a);
		BMI_2(b);
	}
	
	
	public static void BMI_1 (int a) {
		if (a < 18.5) {
			System.out.println("You are underweight.");
		}
		if (a >= 18.5 && a<= 24.9) {
			System.out.println("You are normal weight.");
		}
		if (a >= 25 && a<= 29.9) {
			System.out.println("You are overweight.");
		}
		else {
			System.out.println("You are obese.");
		}
	 }
	
	public static void BMI_2(int b) {
			if (b < 18.5) {
				System.out.println("You are underweight.");
			}
			if (b >= 18.5 && b<= 24.9) {
				System.out.println("You are normal weight.");
			}
			if (b >= 25 && b<= 29.9) {
				System.out.println("You are overweight.");
			}
			else {
				System.out.println("You are obese.");
			}
	   }
	}

