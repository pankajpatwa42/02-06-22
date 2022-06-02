package Assignment0206;

import java.util.Scanner;

public class Q28Recursion {
	public static void table(int n,int i)
	{
		if(i>10)
			return;
		System.out.println(n + " * " + i +" = "+(n*i));
		table(n,i+1);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for table : ");
		int input = sc.nextInt();
		Q28Recursion.table(input,1);
	}

}
