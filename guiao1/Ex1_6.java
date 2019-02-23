import java.util.*;
public class Ex1_6 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int sorte = (int) (Math.random()*(101));
		int tentativa;
		int pontuacao=0;
		System.out.println("Tente adivinhar o número");
		do{
			tentativa = sc.nextInt();
			pontuacao++;
			if(tentativa>sorte) System.out.println("Número muito alto");
			if (tentativa<sorte) System.out.println("Número muito baixo");
			if (tentativa==sorte) System.out.printf("Acertou em %d tentativas",pontuacao);
		}while(tentativa!=sorte);
		
	}
}

