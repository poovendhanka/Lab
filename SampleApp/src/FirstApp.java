/**
		*This is the main class for the project
		*author poovendhan
		*/
public class FirstApp {

	public static void main(String[] args) {
		     System.out.println("This is my application");
		     
		     int n=123456,sum=0;
				int r=0;

				while(n!=0)
				{
				    
				     r=n%10;
				     sum=sum*10+r;
				     n=n/10;

				}
				System.out.println("Reversed Number is: "+sum);  
	}

}