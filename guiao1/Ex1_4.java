import java.util.*;
public class Ex1_4 {
	
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
			System.out.println("Digite a frase ");
			String s = read.nextLine();
			System.out.println(translateString(s));
	}
	static String translateString(String s){
		String frasenova = new String();
		for (int i=0;i<s.length();i++){
			if (s.charAt(i)=='R' || s.charAt(i)=='r' || s.charAt(i)=='L' || s.charAt(i)=='l'){
				frasenova=s.replace("r","").replace("R","").replace("L","U").replace("l","u");
			}
		}
		return frasenova;
	}
				
}

