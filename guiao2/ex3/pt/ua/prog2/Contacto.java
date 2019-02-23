package pt.ua.prog2;
public class Contacto {
	public Contacto(String nome, String telefone, String eMail){
		this.nome = nome;
		this.telefone=telefone;
		this.eMail=eMail;
	}
	public Contacto(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
		this.eMail="";
	}
	public String nome(){
		nome = nome.toUpperCase();
		return nome;
	}
	public String telefone(){
		return telefone;
	}
	public String eMail(){
		return eMail;
	}
	private String nome ;
	private String telefone;
	private String eMail;
}
