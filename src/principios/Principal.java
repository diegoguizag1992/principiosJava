package principios;

import dao.ConexionMysql;
import dao.ConexionPostgre;
import dao.IConexion;
import dao.PersonaDAO;
import dao.PersonaDAOImpl;

public class Principal {

	public static void main(String[] args) {
		
		IConexion cx1 = new ConexionMysql("dguizag", "123456", "localhost"); 
		IConexion cx2 = new ConexionPostgre("dguizag", "123456", "192.168.1.1"); 

		PersonaDAO dao =  new PersonaDAOImpl(); 
		dao.setConexion(cx1);
		
		dao.listarTodos();
		
		Component laptopSinAccesorios = new Laptop();
		mostrarInfo(laptopSinAccesorios);
		
		System.out.println("Principio abierto cerrado");
		Component laptopConAccesorios = new Enfriador(new  Laptop());
		mostrarInfo(laptopConAccesorios);
		
		laptopConAccesorios = new MesaBambu(new  Laptop());
		mostrarInfo(laptopConAccesorios);
		
		laptopConAccesorios = new Enfriador(new MesaBambu(new Laptop()));
		mostrarInfo(laptopConAccesorios);
		
	}
	
	static void mostrarInfo(Component component) {
		System.out.println(component.getNombrePrecio());
		System.out.println("Costo Total: " + component.getCostoTotal());
		System.out.println("--------------------");
	}

}
