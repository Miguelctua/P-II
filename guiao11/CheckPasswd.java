import p2utils.*;
import java.io.*;
import java .util.Scanner;


public class CheckPasswd{
    public static void main(String[] args) throws IOException{
        KeyValueList<String> k1 = new KeyValueList<String>();
        Scanner scf = new Scanner(new File("senhas.txt"));
        while(scf.hasNextLine()){
            String line = scf.nextLine();
            String user = line.split(" ")[0];
            String pass = line.split(" ")[1];
            k1.set(user,pass);
        }
        scf.close();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String username = sc.next();
        System.out.print("Password: ");
        String password = sc.next();
        try{
            if(k1.get(username).equals(password)){
                System.out.println("Authentication successful");

            }
            else 
            {
                System.out.println("Authentication failed(invalid password)");
            }
        }
        catch(NullPointerException e){
            System.out.println("Authentication failed(user not found)");
        }
    }

 }
