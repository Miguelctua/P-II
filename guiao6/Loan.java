/*
 * Copyright 2019 Miguel Cabral 
 */

public class Loan {
	
	public static void main (String[] args) {
		double t=0, P=0, M=0;
		int n=0;
		try{
			n = Integer.parseInt(args[0]);
			M = Double.parseDouble(args[1]);
			t = Double.parseDouble(args[2]);
			P = Double.parseDouble(args[3]);
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
			System.out.println("USO: java -ea Loan <n> <M> <t> <P>");
			System.exit(1);
		}
		System.out.println("Método Iterativo: "+iterativeMode(M,t,P,n));
		System.out.println("Método Recursivo: "+recursiveMode(M,t,P,n));
		
	}
	public static double iterativeMode(double M, double t, double P, int n){
		double div = M;
		for(int i = 0; i<n ; i++){
			div = ((100+t)*div/100)-P;
		}
		return div;
	}
	public static double recursiveMode(double M, double t, double P, int n){
		if(n==0) return M;
		M = ((100+t)*recursiveMode(M,t,P,n-1)/100)-P;
		return M;
	}
}
	
			


