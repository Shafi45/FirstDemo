
public class NumRevStringBuffer {

	public static void main(String[] args) {
		
		int num = 6543210;
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("StringBuffer NumRev:"+ rev);

	}

}
