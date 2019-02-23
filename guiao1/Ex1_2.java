import java.util.*;

public class Ex1_2 {
	
	public static void main (String[] args) {
		Nota nota = lerNota();
		int Nf = calcularNota(nota);
		System.out.printf("A nota final do aluno é %d",Nf);
		
		
	}
	static Nota lerNota(){
		Nota nota = new Nota();
		Scanner read = new Scanner(System.in);
		System.out.print("ATP1: ");
		nota.atp1= read.nextDouble();
		System.out.print("ATP2: ");
		nota.atp2 = read.nextDouble();
		System.out.print("ATP3: ");
		nota.atp3 = read.nextInt();
		System.out.print("AP1: ");
		nota.ap1 = read.nextDouble();
		System.out.print("AP2: ");
		nota.ap2 = read.nextDouble();
		return nota;
	}
	static int calcularNota(Nota nota){
		double ctp = (nota.atp1+nota.atp2+nota.atp2)/3;
		double cp = (nota.ap1+nota.ap2)/2;
		return (int)(0.7*cp+0.3*ctp);
	}
}
class Nota {
	double atp1;
	double atp2;
	double atp3;
	double ap1;
	double ap2;
}
