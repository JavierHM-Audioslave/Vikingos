package main;

public class Enfurecido extends EstadoVikingo{
	
	public Enfurecido(Vikingo vikingo)
	{
		super(vikingo);
		vikingo.setAtaque(30);
		vikingo.setDefensa(0);
	}

	@Override
	public EstadoVikingo tomarHidromiel() {
		return new Normal(vikingo);
	}

	@Override
	public EstadoVikingo sacudir() {
		return this;
	}
	
	

}
