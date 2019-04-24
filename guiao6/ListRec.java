/* 
* Copyright 2019 Miguel Cabral 
*/ 
import static java.lang.System.*;
import java.io.*;
public class ListRec {
	
	public static void main (String[] args) {
		assert args.length >= 0;
		File dir = new File("");
		if(args.length > 1){
			out.println("USO: java -ea ListRec <directory>");
			System.exit(1);
		}
		else if(args.length == 0){
			String pwd = System.getProperty("user.dir");
			dir = new File(pwd);
		}
		else {
			dir = new File(args[0]);
			
		}
		printDir(dir);	
	}
	static void printDir(File file){
		out.println(file.getPath());
		if(file.isDirectory()){
			File [] dir = file.listFiles();
			for (File f : dir){
				printDir(f);
			}
		}
	}
	
}
	


