package principios;

public class Enfriador extends Decorator {

	public Enfriador(Component componente) {
		super(componente);

		nombreAccesorio = "Ventilador";
		precioAccesorio = 40.00;		
	}

}
