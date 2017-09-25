package main;

public class Normal extends EstadoVikingo{
	
	public Normal(Vikingo vikingo)
	{
		super(vikingo);
		vikingo.setAtaque(10);
		vikingo.setDefensa(5);
	}
	
	public EstadoVikingo tomarHidromiel()
	{
		return new Borracho(vikingo);
	}

	@Override
	public EstadoVikingo sacudir()
	{
		return new Enfurecido(vikingo);
	}

}
