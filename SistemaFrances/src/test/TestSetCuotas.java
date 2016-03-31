package test;

import java.util.GregorianCalendar;

import negocio.ClienteABM;
import datos.Cliente;
import datos.Cuota;
import datos.Prestamo;

public class TestSetCuotas {

	public static void main(String[] args) {

		ClienteABM clienteABM = new ClienteABM();
		
		Cliente cliente = clienteABM.traerCliente(11111111);
		
		System.out.println("----> TraerCliente idCliente=" + cliente.getIdCliente());

		System.out.println(cliente.toString());
		
		System.out.println("");
		
		Cliente cliente2 = clienteABM.traerCliente(33333333);
		
		System.out.println("----> TraerCliente idCliente=" + cliente2.getIdCliente());

		System.out.println(cliente2.toString());
		
		System.out.println("");

		Prestamo p = new Prestamo(new GregorianCalendar(2016, 0, 8), 5000, 10, 6, cliente);
		
		cliente.addPrestamo(p);
		
		System.out.println("*** Imprimir Prestamo y cuotas a pagar ****");
		
		
		System.out.println(p.toString());
		
		
		for (Prestamo prestamo : cliente.getPrestamos()) {
			for (Cuota cuota : prestamo.getCuotas()) {
				System.out.println(cuota.toString());
			}
		}
		
	
	
	
	}

}
