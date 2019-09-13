import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;

public class SortInts
{
  public static void main(String[] args) throws IOException {
    if(args.length == 0){
      out.print("Usage : java -ea SortInts file1 ...");
    }
    SortedListInt numbers = new SortedListInt();
    File file;
    for(String s : args){
      file = new File(s);
      assert file.isFile();
      numbers = insertNumbers(numbers,new Scanner(file));
      assert numbers.isSorted();
    }
    numbers.print();


}
  static SortedListInt insertNumbers(SortedListInt numbers,Scanner read){
    if(!read.hasNext())return numbers;
    try{
      int elem = Integer.parseInt(read.nextLine());
      numbers.insert(elem);
    }
    catch(NumberFormatException e){

    }
  return insertNumbers(numbers, read);
  }
}




