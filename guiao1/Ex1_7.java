import java.util.*;
import java.io.*;

public class Ex1_7 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws IOException{
		String FileIn;
		String FileOut;
		System.out.println("Digite o nome do ficheiro de entrada");
		FileIn= sc.nextLine();
		File f = new File(FileIn);
		if(!f.exists()){
			System.out.printf("ERROR:input file %s does not exist\n",FileIn);
			System.exit(2);
		}
		if (f.isDirectory()){
			System.out.printf("ERROR:input file %s is a directory\n",FileIn);
			System.exit(3);
		}
		if(!f.canRead()){
			System.out.printf("ERROR:cannot read the input file %s \n",FileIn);
			System.exit(4);
		}
		Scanner read = new Scanner(f);
		System.out.println("Ficheiro de saída");
		FileOut = sc.nextLine();
		File s = new File(FileOut);
		PrintWriter pw = new PrintWriter(s);
		while (read.hasNextLine()){
			String write = read.nextLine();
			pw.println(write);
		}
		read.close();
		pw.close();
		System.out.println("Ficheiro Guardado");
	
		
		
	}
}

