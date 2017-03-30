
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EquacaoGrau2Test 
{
	private static final double TOLERANCIA = 0.002;
	private EquacaoGrau2 equacao;
	
	@Before
	public void criarEquacao() 
	{
		this.equacao = new EquacaoGrau2();
	}
	
	@Test
	public void testDeltaSemRaiz() 
	{
		equacao.setA(-4);
		equacao.setB(6);
		equacao.setC(-5);
		assertEquals(0, equacao.getQtdRaizes());
	}
	@Test
	public void testDeltaZero() 
	{
		equacao.setA(4);
		equacao.setB(-4);
		equacao.setC(1);
		assertEquals(0, equacao.getDelta(), TOLERANCIA);
		
	}
	@Test 
	public void testDeltaUmaRaiz()
	{
		equacao.setA(4);
		equacao.setB(-4);
		equacao.setA(1);
		assertTrue(equacao.hasRaizes());
	}
	@Test
	public void testDeltaDuasRaizes()
	{
		equacao.setA(2);
		equacao.setB(6);
		equacao.setC(-5);
		assertEquals(2, equacao.getQtdRaizes());
	}
	@Test(expected=RaizesInexistentesException.class)
	public void testXisLinhaSemRaiz() throws RaizesInexistentesException
	{
		equacao.setA(2);
		equacao.setB(2);
		equacao.setC(2);
		assertEquals(0, equacao.getX1(), TOLERANCIA);
	}
	@Test(expected=RaizesInexistentesException.class)
	public void testXisDuasLinhaSemRaiz() throws RaizesInexistentesException
	{
		equacao.setA(2);
		equacao.setB(2);
		equacao.setC(2);
		assertEquals(0, equacao.getX2(), TOLERANCIA);
	}
	@Test //porque nao tem (expected=RaizesInexistentesException.class) ???????????
	public void testXisLinhaUmaRaiz1() throws RaizesInexistentesException
	{
		equacao.setA(4);
		equacao.setB(-4);
		equacao.setC(1);
		assertEquals(0.5, equacao.getX1(), TOLERANCIA);
	}
	@Test
	public void testXisDuasLinhaUmaRaiz() throws RaizesInexistentesException
	{
		equacao.setA(4);
		equacao.setB(-4);
		equacao.setC(1);
		assertEquals(0.5, equacao.getX2(), TOLERANCIA);
	}
	@Test
	public void testXisLinhaDuasRaizes() throws RaizesInexistentesException
	{
		equacao.setA(4);
		equacao.setB(-4);
		equacao.setC(1);
		assertEquals(0.5, equacao.getX1(), TOLERANCIA);
	}
	@Test
	public void testXisDuasLinhaDuasRaizes() throws RaizesInexistentesException
	{
		equacao.setA(4);
		equacao.setB(-4);
		equacao.setC(1);
		assertEquals(0.5, equacao.getX2(), TOLERANCIA);
	}

	
	
	

}
