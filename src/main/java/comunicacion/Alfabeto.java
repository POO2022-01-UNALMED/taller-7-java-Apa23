package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;	

	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String alfabeto = "";
		for(int i = 0; i < letras.length-1; i++) {
			alfabeto.concat(letras[i]+", ");
		}
		alfabeto.concat(letras[letras.length-1]);
		return alfabeto;
	}

}
