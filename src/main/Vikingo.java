package main;

public class Vikingo {
	
	private Integer ataque;
	private Integer defensa;
	private Integer salud;
	private EstadoVikingo estado;
	
	public Vikingo()
	{
		salud = 100;
		estado = new Normal(this);
	}
	
	public void tomarHidromiel()
	{
		estado = estado.tomarHidromiel();
	}
	
	public void sacudir()
	{
		estado = estado.sacudir();
	}
	
	public void atacar(Vikingo v)
	{
		v.serAtacado(ataque);
	}
	
	public void serAtacado(Integer daño)
	{
		int vidaAQuitar = daño-defensa;
		if(vidaAQuitar > 0 && salud-vidaAQuitar >= 0)
		{
			salud -= vidaAQuitar;
		}
		else
		{
			salud = 0;
		}
	}

	public Integer getAtaque() {
		return ataque;
	}

	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public Integer getDefensa() {
		return defensa;
	}

	public void setDefensa(Integer defensa) {
		this.defensa = defensa;
	}

	public Integer getSalud() {
		return salud;
	}

	public void setSalud(Integer salud) {
		this.salud = salud;
	}

	public EstadoVikingo getEstado() {
		return estado;
	}

	public void setEstado(EstadoVikingo estado) {
		this.estado = estado;
	}
	
	

}
