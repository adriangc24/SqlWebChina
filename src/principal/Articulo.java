package principal;

public class Articulo {
	String referencia;
	String categoria;
	
	public Articulo() {
		super();
	}

	public Articulo(String referencia, String categoria) {
		super();
		this.referencia = referencia;
		this.categoria = categoria;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
