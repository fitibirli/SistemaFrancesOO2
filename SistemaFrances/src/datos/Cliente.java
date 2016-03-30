package datos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private long idCliente;
	private String apellido;
	private String nombre;
	private long dni;
	private List<Prestamo> prestamos = new ArrayList<Prestamo>();
	
	
	
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public List<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	
	public void addPrestamo(Prestamo p){
		
		if(p != null){
			prestamos.add(p);
		}
		
	}

	@Override
	public String toString() {
		return "idCliente:" + this.idCliente + " " + this.apellido + " " + this.nombre + " dni:" + this.dni ;
	}
	
	@Override
	public boolean equals(Object obj) {
		Cliente cliente = (Cliente) obj;
		
		if(this.dni == cliente.dni){
			return true;
		}
		else{
			return false;
		}
	}
	
}
