package main;

public class Borracho extends EstadoVikingo{
	
	public Borracho(Vikingo vikingo)
	{
		super(vikingo);
		vikingo.setAtaque(7);
		vikingo.setDefensa(2);
	}

	@Override
	public EstadoVikingo tomarHidromiel() {
		return this;		
	}

	@Override
	public EstadoVikingo sacudir() {
		return new Normal(vikingo);
	}
	
	

}
