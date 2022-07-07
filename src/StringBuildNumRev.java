
public class StringBuildNumRev {

	public static void main(String[] args) {
		
		int num = 6543210;
		StringBuilder sbd = new StringBuilder();
		sbd.append(num);
		StringBuilder rev = sbd.reverse();
		
		System.out.println("StringBuilder NumRev:"+ rev);

	}

}
