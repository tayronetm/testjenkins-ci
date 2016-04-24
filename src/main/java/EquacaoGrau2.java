public class EquacaoGrau2
{
	private static final int SEM_RAIZES = 0;
	private static final int RAIZ_UNICA = 1;
	private static final int RAIZ_DUPLA = 2;
	
	private int a;
	private int b;
	private int c;
	
	public void setA(int a) 
	{	this.a = a;
	}

	public void setB(int b) 
	{	this.b = b;
	}
	
	public void setC(int c) 
	{	this.c = c;
	}

	public double getDelta() 
	{	return Math.pow(b, 2) - 4 * a * c;
	}

	public int getQtdRaizes()
	{	double delta = getDelta();
		return delta < 0? SEM_RAIZES: delta == 0? RAIZ_UNICA: RAIZ_DUPLA;
	}
	
	public double getX1() throws RaizesInexistentesException
	{	checaRaizes();
		return getX(+1);
	}

	public double getX2() throws RaizesInexistentesException
	{	checaRaizes();
		return getX(-1);
	}
	
	public boolean hasRaizes()
	{	return getDelta() >= 0;
	}
	
	private void checaRaizes() throws RaizesInexistentesException
	{	if (!hasRaizes())
		{	throw new RaizesInexistentesException();
		}
	}
	
	private double getX(double sinal)
	{	return (-b + (sinal * Math.sqrt(getDelta())))/(2 * a);
	}
}
