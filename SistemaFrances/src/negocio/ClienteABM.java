package negocio;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import datos.Cliente;


public class ClienteABM {

	
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	
	

	public ClienteABM() {
		this.setClientes();
	}


	public List<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes() {
		try {
	        File dirBase = new File("src/datos/cliente.xml");
	     
	        String ruta = dirBase.getAbsolutePath();
	        
	        BufferedReader br = new BufferedReader(new FileReader(ruta));
	        
	        String entrada;
	        String cadena = "";
	        
	        while ((entrada = br.readLine()) != null)
	            cadena += entrada;
	        
	        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	        DocumentBuilder db = dbf.newDocumentBuilder();
	        
	        InputSource archivo = new InputSource();
	        archivo.setCharacterStream(new StringReader(cadena));
	        
	        Document documento = db.parse(archivo);
	        documento.getDocumentElement().normalize();
	 
	        NodeList nodeLista = documento.getElementsByTagName("cliente");
	        
	        String[] tags = {"idCliente","apellido","nombre","dni"};
	        
	        for (int s = 0; s < nodeLista.getLength(); s++) {
	        
	        	Node nodo = nodeLista.item(s);
	            String[] valores = new String[tags.length];            
	            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
	                Element elemento = (Element) nodo;
	                for (int i = 0; i < tags.length; i++) {
	                    NodeList nombreElementoLista = elemento.getElementsByTagName(tags[i]);
	                    Element nombreElemento = (Element) nombreElementoLista.item(0);
	                    NodeList nombre = nombreElemento.getChildNodes();
	                    valores[i] = ((Node) nombre.item(0)).getNodeValue().toString();
	            }
	                
	                int idCliente= Integer.parseInt(valores[0]);
	                String apellido=valores[1];                     
	                String nombre =valores[2];
	                long dni=Long.parseLong(valores[3]);
	               
	                
	                Cliente client = new Cliente();
	                client.setIdCliente(idCliente);
	                client.setApellido(apellido);
	                client.setNombre(nombre);
	                client.setDni(dni);
	                
	                clientes.add(client);
	          
	            }
	        }
	        br.close();
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }


	}
	
	
	public Cliente traerCliente(long dni){
		
		Cliente obj = new Cliente();
		obj.setDni(dni);
		
		for (Cliente cliente : this.clientes) {
			
			if(cliente.equals(obj)){
				return cliente;
			}
		}
		
		return null;
		
	}


	
}
