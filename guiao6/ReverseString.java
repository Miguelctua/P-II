import static java.lang.System.*;

public class ReverseString {
	
	public static void main (String[] args) {
		for (String s : args){
			out.printf("\"%s\" -> \"%s\"",s, invertString(s, s.length()-1));
		}
		
	}
	public static String invertString(String s, int n){
		if (n<0){
			return "";
		}
		else {
			return s.charAt(n) + invertString(s,n-1) ;
		}
	}
}

