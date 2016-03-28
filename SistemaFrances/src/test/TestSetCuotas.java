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

		Prestamo p = new Prestamo(new GregorianCalendar(2016,01,25), 5000, 10, 6, cliente);
		
		p.setCuotas();
		
		System.out.println("*** Imprimir Prestamo y cuotas a pagar ****");
		
		System.out.println("Prestamo: $" + p.getMonto());
		
		for (Cuota cuota : p.getCuotas()) {
			
			System.out.println(cuota.toString());
		}
		
	
	}

}
