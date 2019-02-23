public class Contacto {
	Contacto(String nome, String telefone, String eMail){
		this.nome = nome;
		this.telefone=telefone;
		this.eMail=eMail;
	}
	Contacto(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}
	String nome(){
		return nome;
	}
	String telefone(){
		return telefone;
	}
	String eMail(){
		return eMail;
	}
	private String nome ;
	private String telefone;
	private String eMail;
}
