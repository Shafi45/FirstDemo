
public class StringRev3 {

	public static void main(String[] args) {
		String name = "gnimooz";
		int leng = name.length();
		String rev = "";
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("String Reverse: "+ rev);

	}

}
