package datos;

import java.util.GregorianCalendar;
import java.util.List;

public class Prestamo {


	private long idPrestamo;
	private GregorianCalendar fecha;
	private double monto;
	private double interes;
	private int cantCuotas;
	private Cliente cliente;
	private List<Cuota> cuotas;
	
		
	public long getIdPrestamo() {
		return idPrestamo;
	}


	public void setIdPrestamo(long idPrestamo) {
		this.idPrestamo = idPrestamo;
	}


	public GregorianCalendar getFecha() {
		return fecha;
	}


	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}


	public double getMonto() {
		return monto;
	}


	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getInteres() {
		return interes;
	}


	public void setInteres(double interes) {
		this.interes = interes;
	}


	public int getCantCuotas() {
		return cantCuotas;
	}


	public void setCantCuotas(int cantCuotas) {
		this.cantCuotas = cantCuotas;
	}


	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<Cuota> getCuotas() {
		return cuotas;
	}


	public void setCuotas(List<Cuota> cuotas) {
		this.cuotas = cuotas;
	}


	public void setCuotas(){
		
	}
	
}
