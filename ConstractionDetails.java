package HomeTask4;

import java.util.*;
class ConstructionDetails
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Menu for Material standards : ");
		System.out.println("1->Standard Materials");
		System.out.println("2->Above Standard Materials");
		System.out.println("3->High Standard Materials");
		System.out.println("4->High Standard Materials and fully automated home");
		System.out.println("Enter your choice");
		int choice = in.nextInt();
		System.out.println("Enter total area of house(square feets)");
		float area=in.nextFloat();
		EstimateConstructionCost object=new EstimateConstructionCost();
		double result=object.calculateCost(choice,area);
		System.out.println("Total cost : "+result);
	}
}