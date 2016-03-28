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


	public void setCuotas(List<Cuota> cuotas) {
		this.cuotas = cuotas;
	}


	public void setCuotas(){
		
		/** No tengo muy claro los calculos del PDF
		 * 
		for (int i = 1; i <= this.cantCuotas; i++) {
			
			Cuota cuota = new Cuota();
			
			double saldoPendiente = 0;
			double amortizacion = 0;
			double interes = 0;
			double cuotaDouble = 0;
			double deuda = 0;
			
			if(i == 1){
				
				saldoPendiente = this.monto;
				
				amortizacion = (saldoPendiente*this.interes)/(Math.pow((1 + this.interes), i)-1); 
				
				interes = saldoPendiente*(this.interes/100); 
				
				cuotaDouble = amortizacion + interes;
				
				deuda = saldoPendiente - amortizacion;
				
			}else{
	 					
				cuotaDouble = amortizacion + interes;
				
				deuda = saldoPendiente - amortizacion;

			}
			
			
			cuota.setSaldoPendiente(saldoPendiente);
			
			cuota.setAmortizacion(amortizacion);
			
			cuota.setInteresCuota(interes);
			
			cuota.setCuota(cuotaDouble);
			
			cuota.setDeuda(deuda);
			
			this.cuotas.add(cuota);
			
		
		  if(i == 1){
				cuota.setSaldoPendiente(this.monto); 
				
				cuota.setAmortizacion((cuota.getSaldoPendiente()*this.interes)/(Math.pow((1 + this.interes), i)-1)); 
				
				cuota.setInteresCuota(cuota.getSaldoPendiente()*this.interes); 
				
				cuota.setCuota(cuota.getAmortizacion() + cuota.getInteresCuota());
				
				cuota.setDeuda(cuota.getSaldoPendiente() - cuota.getAmortizacion());
				
			}else{
				cuota.setAmortizacion((cuota.getSaldoPendiente()*this.interes)/(Math.pow((1 + this.interes), (i-1))-1));
				
				cuota.setInteresCuota(cuota.getSaldoPendiente()*this.interes);
				
				cuota.setCuota(cuota.getAmortizacion() + cuota.getInteresCuota());
				
				cuota.setDeuda(cuota.getSaldoPendiente() - cuota.getAmortizacion());
				
				cuota.setSaldoPendiente(cuota.getSaldoPendiente() - cuota.getAmortizacion());
			}
	
		}
			 
	**/
	}		
	
}
