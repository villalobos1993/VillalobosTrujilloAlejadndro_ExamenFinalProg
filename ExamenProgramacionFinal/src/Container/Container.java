package Container;

import Models.ListaOrdenada;
import Models.*;
public class Container {

		
		static ListaOrdenada<Cliente>Clientes=new ListaOrdenada<Cliente>( 
				(Cliente a,Cliente b)->a.getTiempoEntrada().compareTo(b.getTiempoEntrada()));
		public static ListaOrdenada<Cliente> getClientes() {
			return Clientes;
		}

		
}
