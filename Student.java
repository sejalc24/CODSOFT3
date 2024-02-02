package Internship;
import java.util.*;

public class Student {
	public static void main(String args[])
	{
		int n;
		double marks,sum=0;
		double avg;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter total number of subjects");
		n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the marks of each subject out of 100");
			marks=in.nextDouble();
			
			if(marks<=100)
			{
				sum=sum+marks;
			}
			else {
				System.out.println("Invalid number");
			}
		}
		avg=sum/n;
		
		System.out.println("Total Marks="+sum);
		System.out.println("Percentage="+avg);

		if(avg>=85 && avg<=100) {
			System.out.println("Grade O");
		}
			else if(avg>=75 && avg<85) {
				System.out.println("Grade A");
			}
			else if(avg>=65 && avg<75) {
				System.out.println("Grade B");
			}
			else if(avg>=55 && avg<65) {
				System.out.println("Grade C");
			}
			else if(avg>=40 && avg<55) {
				System.out.println("Grade P");
			}
			else {
				System.out.println("Grade F");
			}
	}
}
