package string;
//Write a program to find the first and last occurence of the 
//letter 'o' and character ',' in "Hello,World".

public class Exercise5 {

	public static void main(String[] args) {
		
		String s = "Hello,World";
		int ind =0;
		for(int i =0; i<=s.length();i++) {
			
			if(s.charAt(i)=='o') {
				 ind = i;
				break;
			}
		
		}
		System.out.println("first index of 'o' is::"+ind);
		System.out.println("last index of 'o' is::"+s.lastIndexOf('o'));
		
		int t = 0;
		for(int i= 0; i<=s.length();i++) {
			
			if(s.charAt(i)==',') {
				t=i;
				break;
			}
		}
		System.out.println("first index of ','::"+t);
		System.out.println("last index of ',' ::"+s.lastIndexOf(','));

	}

}
