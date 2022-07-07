
public class NumRevStrBuffer2 {

	public static void main(String[] args) {
		
		int num = 654987;

		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
		System.out.println("StringBuffer NumRev:"+ rev);
	}

}
