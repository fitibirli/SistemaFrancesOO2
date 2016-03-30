package datos;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Prestamo {


	private long idPrestamo;
	private GregorianCalendar fecha;
	private double monto;
	private double interes;
	private int cantCuotas;
	private Cliente cliente;
	private List<Cuota> cuotas = new ArrayList<Cuota>();
	
	private static int id = 0;
	
	public Prestamo(GregorianCalendar fecha, double monto, double interes,
			int cantCuotas, Cliente cliente) {
		id++;
		this.idPrestamo = id;
		this.fecha = fecha;
		this.monto = monto;
		this.interes = interes;
		this.cantCuotas = cantCuotas;
		this.cliente = cliente;
		this.setCuotas();
	}


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


	public void setCuotas(){
		
		// No tengo muy claro los calculos del PDF
		  

		double saldoPendiente = this.monto;
		double amortizacion = 0;
		double interesCuota = 0;
		double cuotaDouble = 0;
		double deuda = 0;
		
		for (int i = 0; i < this.cantCuotas; i++) {
			
			Cuota cuota = new Cuota();
				
			cuota.setSaldoPendiente(saldoPendiente);
			
			double a = Math.pow((1 + (this.interes/100)), this.cantCuotas-i);
			
			amortizacion = Funciones.aproximar2Decimal((saldoPendiente*this.interes/100)/(a-1)); 
				
			interesCuota = Funciones.aproximar2Decimal(saldoPendiente*this.interes/100); 
				
			cuotaDouble = Funciones.aproximar2Decimal(amortizacion + interesCuota);
				
			deuda = Funciones.aproximar2Decimal(saldoPendiente - amortizacion);
			
			saldoPendiente = Funciones.aproximar2Decimal(saldoPendiente - amortizacion);
					
			
			cuota.setAmortizacion(amortizacion);
			
			cuota.setInteresCuota(interesCuota);
			
			cuota.setCuota(cuotaDouble);
			
			cuota.setDeuda(deuda);
			
			this.cuotas.add(cuota);

		}
			 
	}		
	
	
	@Override
	public String toString() {
		
		return "Prestamo: $" + this.monto + "\nFecha: " + /**this.fecha + */ "\nInteres: " + this.interes + "\nCant.de Cuotas: " + this.cantCuotas + "\n" + this.cliente.toString();
	}
}
