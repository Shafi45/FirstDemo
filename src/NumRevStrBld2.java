
public class NumRevStrBld2 {

	public static void main(String[] args) {

		int num = 987654321;
		String name = "windows";
		
		StringBuilder sbd = new StringBuilder();
		sbd.append(num);
		
		StringBuilder rev = sbd.reverse();
		
		System.out.println("StrBldNumRev:"+ rev);
		
		StringBuilder sbd2 = new StringBuilder();
		sbd2.append(name);
		
		StringBuilder rev2 = sbd2.reverse();
		
		System.out.println(rev2);
	}

}
