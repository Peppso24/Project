package beans;

public class Utenti {

	
	public Utenti() {
		
		Cf = "";
		Nome = "";
		Cognome = "";
		Email = "";
		Indirizzo = "";
		telefono = 0;
	}
	
	public String getCf() {
		return Cf;
	}
	public void setCf(String cf) {
		Cf = cf;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getIndirizzo() {
		return Indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	private String Cf;
	private String Nome;
	private String Cognome;
	private String Email;
	private String Indirizzo;
	private int telefono;
}
