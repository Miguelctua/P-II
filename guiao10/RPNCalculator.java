import p2utils.Stack;
import java.util.*;
public class RPNCalculator{

    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Stack<Double> pile = new Stack<Double>();
        double res =  0;
        while(sc.hasNext()) {
            if(sc.hasNextDouble()){
                pile.push(sc.nextDouble());
                System.out.println(pile.toSting());
            }
            else{
                String operator = sc.next();

                if(!operator.equals("*") && !operator.equals("+") && !operator.equals("/") && !operator.equals("-")){
                    System.out.println("Use the operators / or * or - or +");
                    System.exit(0);
                }
                if(pile.isEmpty()){
                    System.out.println("Error missing 2 operators");
                    System.exit(2);
                }
                double op1 = pile.top();
                pile.pop();
                assert !pile.isEmpty():"Pile is empty: add operators";
                double op2 = pile.top();
                pile.pop();
                if(operator.equals("*")){
                    res = op1*op2;
                }
            
                else if(operator.equals("/")){
                    res = op1 * op2;
                }
                else if(operator.equals("+")){
                    res = op1 + op2;
                }
                else if(operator.equals("-")){
                    res = op1 - op2;
                }
                pile.push(res);
                System.out.println(res);

            }
        }
        System.out.printf("Resultado: %s\n",pile.toSting());


    }
}