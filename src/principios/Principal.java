package principios;

public class Principal {

	public static void main(String[] args) {

		
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
