package empresa;

public class Ventas {

	private String cliente;
	
	private int producto;
	
	private int cantidad;
	
	private double precioU;  //Precio Unitario

	// Constructor
	public Ventas(String cliente, int producto, int cantidad, double precioU) {
		this.cliente = cliente;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioU = precioU;
	}

	//Cliente
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	//Producto
	public int getProducto() {
		return producto;
	}
	public void setProducto(int producto) {
		this.producto = producto;
	}

	//Cantidad
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	//Precio
	public double getPrecioU() {
		return precioU;
	}
	public void setPrecioU(double precioU) {
		this.precioU = precioU;
	}

	// ToString
	@Override
	public String toString() {
		return "+ " + cliente + ": " + producto + ";  x" + cantidad + "               Precio por unidad"
				+ precioU;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
