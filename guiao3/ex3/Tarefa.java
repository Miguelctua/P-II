
public class Tarefa {
	private Data inicio;
	private Data fim;
	private String texto;
	
	public Tarefa(Data inicio,Data fim, String texto){
		this.inicio = inicio;
		this.fim= fim;
		this.texto=texto;
	}
	public Data inicio(){
		return this.inicio;
	}
	public Data fim(){
		return this.fim;
	}
	public String texto(){
		return this.texto;
	}
	public boolean intersecta(Tarefa otherTarefa){
		if(this.inicio().compareTo(otherTarefa.inicio())==1 || this.fim().compareTo(otherTarefa.fim())==1){
			return true;
		}
		else {
			return false;
		}
	}
}

