package tests;

import org.junit.Assert;
import org.junit.Test;

import main.Vikingo;

public class TestVikingo {
	
	@Test
	public void normalAtacaANormal()
	{
		Vikingo v1 = new Vikingo();
		Vikingo v2 = new Vikingo();
		v1.atacar(v2);
		Assert.assertEquals(95, (int)v2.getSalud());
	}
	
	@Test
	public void borrachoAtacaANormal()
	{
		Vikingo v1 = new Vikingo();
		v1.tomarHidromiel();
		Vikingo v2 = new Vikingo();
		v1.atacar(v2);
		Assert.assertEquals(98, (int)v2.getSalud());
	}
	
	@Test
	public void enfurecidoAtacaANormal()
	{
		Vikingo v1 = new Vikingo();
		v1.sacudir();
		Vikingo v2 = new Vikingo();
		v1.atacar(v2);
		Assert.assertEquals(75, (int)v2.getSalud());
		
		Assert.assertEquals(30, (int)v1.getAtaque()); // Este assert y los dos de abajo son sólo para confirmar que el que ataca (que esta enfurecido) sigue con sus estados de enfurecido.
		Assert.assertEquals(0, (int)v1.getDefensa());
		Assert.assertEquals(100, (int)v1.getSalud());		
	}
	
	@Test
	public void normalAtacaABorracho()
	{
		Vikingo v1 = new Vikingo();
		Vikingo v2 = new Vikingo();
		v2.tomarHidromiel();
		v1.atacar(v2);
		Assert.assertEquals(92, (int)v2.getSalud());
	}
	
	@Test
	public void borrachoAtacaABorracho()
	{
		Vikingo v1 = new Vikingo();
		v1.tomarHidromiel();
		Vikingo v2 = new Vikingo();
		v2.tomarHidromiel();
		v1.atacar(v2);
		Assert.assertEquals(95, (int)v2.getSalud());	
	}
	
	@Test
	public void EnfurecidoAtacaABorracho()
	{
		Vikingo v1 = new Vikingo();
		v1.sacudir();
		Vikingo v2 = new Vikingo();
		v2.tomarHidromiel();
		v1.atacar(v2);
		Assert.assertEquals(72, (int)v2.getSalud());
	}
	
	@Test
	public void normalAtacaAEnfurecido()
	{
		Vikingo v1 = new Vikingo();
		Vikingo v2 = new Vikingo();
		v2.sacudir();
		v1.atacar(v2);
		Assert.assertEquals(90, (int)v2.getSalud());
	}
	
	@Test
	public void borrachoAtacaAEnfurecido()
	{
		Vikingo v1 = new Vikingo();
		v1.tomarHidromiel();
		Vikingo v2 = new Vikingo();
		v2.sacudir();
		v1.atacar(v2);
		Assert.assertEquals(93, (int)v2.getSalud());
	}
	
	@Test
	public void EnfurecidoAtacaAEnfurecido()
	{
		Vikingo v1 = new Vikingo();
		v1.sacudir();
		Vikingo v2 = new Vikingo();
		v2.sacudir();
		v1.atacar(v2);
		Assert.assertEquals(70, (int)v2.getSalud());
	}

}
