package GloballogicPractics;

public class SubString {
	public static void main(String[] args) {
		String s = "rahul";
		for(int i=0;i<s.length();i++){
			for(int j=i;j<s.length();j++){
				System.out.println(s.substring(i, j+1));
			}
		}
	}
}
