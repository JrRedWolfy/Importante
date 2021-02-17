package ficheros;

public class Persona {

	
	String nombre;
	String apellidos;
	int nip;
	public Persona(String nombre, String apellidos, int nip) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nip = nip;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getNip() {
		return nip;
	}
	public void setNip(int nip) {
		this.nip = nip;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", nip=" + nip + "]";
	}
	public String mostrarDatos(int longitudLinea) {
		
		String medida = apellidos + ", " + nombre;
		String linea="";
		for (int i = medida.length(); i <= longitudLinea; i++) {
			
			linea += ".";
		}
		linea = medida + linea + nip;
		
		
		return linea;
	}
	
}
