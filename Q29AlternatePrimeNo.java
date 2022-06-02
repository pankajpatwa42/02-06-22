package Assignment0206;


public class Q29AlternatePrimeNo {
	static int checkPrime(int num)
	{
		boolean flag = true;
		for(int i = 2;i<=num/2;i++)
		{
				if(num%i==0) 
				{
				flag = false;
				break;
				}
		}
		if(flag==true)
			return 1;
		else 
			return 0;
	}
	
	static void printAltPrime(int n) 
	{
		int temp = 2;   
		for(int number = 2; number <= n-1; number++)   
		{   
			if (checkPrime(number) == 1)   
			{    
				if (temp % 2 == 0)   
					System.out.print(number + " ");   
				temp ++;  
			}
		}
	}

	public static void main(String[] args) {
		int num = 20;   
		System.out.print("Alternate prime numbers up to " + num+" are: "); 
		printAltPrime(num); 
	
	}

	}


