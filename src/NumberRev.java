
public class NumberRev {

	public static void main(String[] args) {
		
		int num = 987654;
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10; //1. 0*10=0 + 987654%10= "4",  2. 4*10 =40 + 98765%10=5 "45", 3. 45*10=450 + 9876%10 =6 "456"
			num = num/10;          //1. 987654 2.98765 3.9876 4.987 5.98 6.9
			
		}
		System.out.println("Number Reverse:"+ rev);
	
		
		
	}

}
