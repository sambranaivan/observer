import java.lang.reflect.Array;
import java.util.ArrayList;

public class Variable {
	/*
	 * Variables
	 */
	int col;
	int index;
	///almacenara los valores con la variacion ene le tiempo
	ArrayList<Double> valores = new ArrayList<Double>(); 
	
	/*
	 * Accesors
	 */
public int getCol() {
		return col;
	}

	public ArrayList<Double> getValores() {
	return valores;
}
public void setValores(ArrayList<Double> valores) {
	this.valores = valores;
}
	public void setCol(int col) {
		this.col = col;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	/*
	 * Constructor
	 */
public Variable(int col, int index)
{
	this.setCol(col);
	this.setIndex(index);
	System.out.println(col+":"+index);
}


public void add(double valor)
{
	this.getValores().add(valor);
}
public double getValor()
{
	return this.getValores().get(this.getValores().size()-1);
	}

public void show()
{
	System.out.println("["+this.getCol()+","+this.getIndex()+"]"+this.getValor());
	
}



}
