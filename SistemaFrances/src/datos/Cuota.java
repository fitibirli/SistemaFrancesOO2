package datos;

import java.util.GregorianCalendar;

public class Cuota {
	
	private int nroCuota;
	private GregorianCalendar fechaVencimiento;
	private double saldoPendiente;
	private double amortizacion;
	private double interesCuota;
	private double cuota;
	private double deuda;
	
	
	public int getNroCuota() {
		return nroCuota;
	}
	public void setNroCuota(int nroCuota) {
		this.nroCuota = nroCuota;
	}
	public GregorianCalendar getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(GregorianCalendar fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public double getSaldoPendiente() {
		return saldoPendiente;
	}
	public void setSaldoPendiente(double saldoPendiente) {
		this.saldoPendiente = saldoPendiente;
	}
	public double getAmortizacion() {
		return amortizacion;
	}
	public void setAmortizacion(double amortizacion) {
		this.amortizacion = amortizacion;
	}
	public double getInteresCuota() {
		return interesCuota;
	}
	public void setInteresCuota(double interesCuota) {
		this.interesCuota = interesCuota;
	}
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public double getDeuda() {
		return deuda;
	}
	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}
	
	
	
	@Override
	public String toString() {
		
		return "F.Vto: " + Funciones.traerFechaCorta(this.getFechaVencimiento()) + " Saldo Pendiente: $" + this.getSaldoPendiente() + " Amortizacion: $" + this.getAmortizacion() + " Interes: $" + this.getInteresCuota() + " Cuota: $" + this.getCuota() + " Deuda $" + this.deuda;
	}
}
