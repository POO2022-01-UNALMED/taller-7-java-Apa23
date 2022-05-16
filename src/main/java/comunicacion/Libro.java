package comunicacion;

public class Libro extends Escrito {
	private String co_autor;
	private String editor;
	private String edicion;
	private String interpretacion;
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editor,
			String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editor = editor;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	public String getCo_autor() {
		return co_autor;
	}
	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int param) {
		return super.getPaginas()*param*2;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return super.getOrigen() + super.getTitulo() + super.getAutor() + super.getPaginas() + co_autor + editor + edicion;
	}	 

	
}
