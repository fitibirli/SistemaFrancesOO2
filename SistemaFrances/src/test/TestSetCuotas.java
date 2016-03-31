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

		System.out.println(cliente.toString() + "\n");
		
		Prestamo p = new Prestamo(new GregorianCalendar(2016, 0, 8), 5000, 10, 6, cliente);
		
		System.out.println("---->Crear prestamo para el cliente: " + cliente.toString() + "\n");
		
		cliente.addPrestamo(p);
		
		System.out.println("----->setCuotas() \n");
		System.out.println("*** Imprimir Prestamo y cuotas a pagar ****");
		
		
		System.out.println(p.toString());
		
		
		for (Prestamo prestamo : cliente.getPrestamos()) {
			for (Cuota cuota : prestamo.getCuotas()) {
				System.out.println(cuota.toString());
			}
		}
		
		

		Cliente cliente2 = clienteABM.traerCliente(22222222);
		
		System.out.println("----> TraerCliente idCliente=" + cliente2.getIdCliente());

		System.out.println(cliente2.toString() + "\n");
		
		Prestamo p2 = new Prestamo(new GregorianCalendar(2016, 10, 29), 10000, 15, 12, cliente2);
		
		System.out.println("---->Crear prestamo para el cliente: " + cliente2.toString() + "\n");
		
		cliente2.addPrestamo(p2);
		
		System.out.println("----->setCuotas() \n");
		System.out.println("*** Imprimir Prestamo y cuotas a pagar ****");
		
		
		System.out.println(p2.toString());
		
		
		for (Prestamo prestamo : cliente2.getPrestamos()) {
			for (Cuota cuota : prestamo.getCuotas()) {
				System.out.println(cuota.toString());
			}
		}
		
		
		Cliente cliente3 = clienteABM.traerCliente(33333333);
		
		System.out.println("----> TraerCliente idCliente=" + cliente3.getIdCliente());

		System.out.println(cliente3.toString() + "\n");
		
		Prestamo p3 = new Prestamo(new GregorianCalendar(2016, 04, 10), 14000, 16.5, 18, cliente3);
		
		System.out.println("---->Crear prestamo para el cliente: " + cliente3.toString() + "\n");
		
		cliente3.addPrestamo(p3);
		
		System.out.println("----->setCuotas() \n");
		System.out.println("*** Imprimir Prestamo y cuotas a pagar ****");
		
		
		System.out.println(p3.toString());
		
		
		for (Prestamo prestamo : cliente3.getPrestamos()) {
			for (Cuota cuota : prestamo.getCuotas()) {
				System.out.println(cuota.toString());
			}
		}
		
		
		
		Cliente cliente4 = clienteABM.traerCliente(44444444);
		
		System.out.println("----> TraerCliente idCliente=" + cliente4.getIdCliente());

		System.out.println(cliente4.toString() + "\n");
		
		Prestamo p4 = new Prestamo(new GregorianCalendar(2016, 0, 10), 6000, 12, 8, cliente4);
		Prestamo p5 = new Prestamo(new GregorianCalendar(2016, 0, 8), 10000, 12.5, 6, cliente4);
		
		System.out.println("---->Crear prestamo para el cliente: " + cliente4.toString() + "\n");
		
		cliente4.addPrestamo(p4);
		
		System.out.println("----->setCuotas() \n");
		System.out.println("*** Imprimir Prestamo y cuotas a pagar ****");
		
		
		System.out.println(p4.toString());
		

		Prestamo prestamo = cliente4.getPrestamos().get(0);
			for (Cuota cuota : prestamo.getCuotas()) {
				System.out.println(cuota.toString());
			}
		
		System.out.println("---->Crear prestamo para el cliente: " + cliente4.toString() + "\n");
		
		cliente4.addPrestamo(p5);
		
		System.out.println("----->setCuotas() \n");
		System.out.println("*** Imprimir Prestamo y cuotas a pagar ****");
		
		
		System.out.println(p5.toString());
		

		Prestamo prestamo1 = cliente4.getPrestamos().get(1);
			for (Cuota cuota : prestamo1.getCuotas()) {
				System.out.println(cuota.toString());
			}
		
		
		
		
	
	
	
	}

}
