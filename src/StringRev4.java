
public class StringRev4 {

	public static void main(String[] args) {
		
		String name = "makeBelieve";
		
		int leng = name.length();
		
		String rev = "";
		
		for(int i=leng-1;i>=0;i--)
		{
			rev = rev + name.charAt(i);
		}
		System.out.println("Name Reverse:"+ rev);

	}

}
