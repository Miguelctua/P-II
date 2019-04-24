/*
 * Copyright 2019 Miguel Cabral 
 */

import static java.lang.System.*;
public class Levenshtein {
	
	public static void main (String[] args) {
		if(args.length != 2){
			out.println("Uso: java -ea Levenshtein <palavra1> <palavra2>");
			exit(1);
		}
		
		int d = distancia(args[0],args[1]);
		out.printf("A distancia entre \"%s\" e \"%s\" é: %d",args[0],args[1],d);
	}
	public static int distancia(String s, String f){
		int d = 0;
		if(s.length() == 0){
			d = f.length();
			return d;
		}
		else if(f.length() == 0){
			d = s.length();
			return d;
		}
		else if (s.charAt(0) == f.charAt(0)){
			 d = distancia(s.substring(1),f.substring(1));
			 return d;
		}
		else {
			int[] res = new int[3];
			res[0] = 1 + distancia(s.substring(1),f);
			res[1] = 1 + distancia(s,f.substring(1));
			res[2] = 1 + distancia(s.substring(1),s.substring(2));
			d = minimo(res);
			return d;
		}
	}
	public static int minimo(int[] res){
		int min = 0;
		for (int i=0; i<2;i++){
			if(min > res[i]){
				min = res[i];
			}
		}
		return min ;
	}	
		
}

