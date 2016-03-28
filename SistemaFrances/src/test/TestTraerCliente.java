package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestTraerCliente {

	public static void main(String[] args) {
		
		ClienteABM clienteABM = new ClienteABM();
		
		Cliente cliente = clienteABM.traerCliente(11111111);
		
		System.out.println("----> TraerCliente idCliente=" + cliente.getIdCliente());

		System.out.println(cliente.toString());
		
		System.out.println("");
		
		Cliente cliente2 = clienteABM.traerCliente(33333333);
		
		System.out.println("----> TraerCliente idCliente=" + cliente2.getIdCliente());

		System.out.println(cliente2.toString());
	}

}
