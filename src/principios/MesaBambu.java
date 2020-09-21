package principios;

public class MesaBambu extends Decorator {

	public MesaBambu(Component componente) {
		super(componente);

		nombreAccesorio = "Mesa";
		precioAccesorio = 80.00;
	}

}
