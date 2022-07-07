
public class NumRevStrBuffer3 {

	public static void main(String[] args) {

		int num = 321654;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		
		StringBuffer rev = sb.reverse();
		
		System.out.println("StrBufNumberRev:"+ rev);
	}

}
