package string;

public class Exercise3 {

	public static void main(String[] args) {
		
		
		String a = "umbrella";
		boolean per = false;
		for(int i =0; i<= a.length();i++) {
			
			if(a.charAt(i)=='e') {
				per=true;
				break;

			}
		}
		System.out.println(per);

	}

}
