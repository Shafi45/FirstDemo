
public class NumberRev3 {

	public static void main(String[] args) {
		int num = 90104050;
		int rev = 0;
		while(num!=0)
		{
			rev = rev*10 + num%10; //we can't print last number value is '0' with this method
			num = num/10;
		}
		System.out.println("Number Reverse:"+ rev);

	}

}
