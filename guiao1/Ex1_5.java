import java.util.*;

public class Ex1_5 {
	
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		int i=0;
		int n;
		int soma=0;
		int media;
		int[] array = new int[100];
		do{
			System.out.println("Digite um número ou 0 para terminar");
			n = read.nextInt();
			if (n!=0){
				array[i]=n;
				i++;
			}
			
			
		}while(n!=0);
		int[] numeros = new int[i];
		for (int j=0;j<numeros.length;j++){
			numeros[j]=array[j];
			System.out.printf("%d\n",numeros[j]);
			soma+= numeros[j];
		}
		System.out.printf("soma=%d ",soma);
		if (i==0){
			System.out.printf("Media nao pode ser calculada");
		}
		if (i!=0){
			media = soma/i;
			System.out.printf("media= %d",media);
		}
		
		
	}
		
			
	}



