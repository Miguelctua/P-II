import static java.lang.System.*;
import p2utils.*;

public class HanoiTowers<E>{
  	public HanoiTowers( int n, Stack<E> TA) {
	  this.TA = TA;
  	}
  	private Stack<E> TA;
  	private Stack<E> TB = new Stack<E>();
  	private Stack<E> TC = new Stack<E>();
  	private int move = 0;

  	public void printInfo(){
		out.printf("After %d moves: \n", move);
		out.println("TA " + TA.toSting());
		out.println("TB " + TB.toSting());
		out.println("TC " + TC.toSting() + "\n");

  	}
  	public void start(int n ){
		  moveDiscs(n,TA,TB,TC);

	  }
	public void moveDiscs(int n, Stack<E> origem, Stack<E> destino, Stack<E> auxiliar){
		assert n >= 0;
		if(n > 0){
			moveDiscs(n-1, origem, auxiliar, destino);
			moveOneDisc(origem,destino);
			printInfo();
			moveDiscs(n-1,auxiliar,destino,origem);
		}
	}
	public void moveOneDisc(Stack<E> origem,Stack<E> destino){
		move++;
		destino.push(origem.top());
		origem.pop();

	}
	public int move(){
		return move;
		
	}
}	