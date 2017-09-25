package main;

public abstract class EstadoVikingo {
	
	protected Vikingo vikingo;
	
	public EstadoVikingo(Vikingo vikingo)
	{
		this.vikingo = vikingo;
	}
	
	public abstract EstadoVikingo tomarHidromiel();
	public abstract EstadoVikingo sacudir();

}
