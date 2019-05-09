package beans;

public class Prodotti {

	
	public Prodotti() {
		
		idProdotti =0;
		Nome = "";
		Prezzo = 0;
		Descrizione ="";
		Categoria = "";
		Peso = 0;
		Img = "";
	}
	
	
	public int getIdProdotti() {
		return idProdotti;
	}
	public void setIdProdotti(int idProdotti) {
		this.idProdotti = idProdotti;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public float getPrezzo() {
		return Prezzo;
	}
	public void setPrezzo(float prezzo) {
		Prezzo = prezzo;
	}
	public String getDescrizione() {
		return Descrizione;
	}
	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public float getPeso() {
		return Peso;
	}
	public void setPeso(float peso) {
		Peso = peso;
	}
	public String getImg() {
		return Img;
	}
	public void setImg(String img) {
		Img = img;
	}


	private int idProdotti;
	private String Nome;
	private float Prezzo;
	private String Descrizione;
	private String Categoria;
	private float Peso;
	private String Img;
}
