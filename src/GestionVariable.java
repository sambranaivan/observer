import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class GestionVariable {
	/**
	 * Gestion Variable sera el que maneje todos los valores
	 * referidos a las anomalias
	 * con una estrucuta de Arraylist a ser(Puerto[CIAA1,CIAA2],Variable[nombre de variable]])
	 */
	ArrayList<ArrayList<Variable>> variables = new ArrayList<ArrayList<Variable>>();
	
	/**
	 * CONSTRUCTOR
	 * parametros: cantidad de puertos
	 */
	public GestionVariable(int puertos,int variables)
	{
		for (int i = 0; i < puertos; i++) 
		{
			ArrayList<Variable> temp_array = new ArrayList<Variable>();
			for (int j = 0; j < variables; j++) {
				Variable temp_var = new Variable(i, j);
				temp_array.add(temp_var);
			}
			
			this.getVariables().add(temp_array);
		}
	}
	/**
	 * *Private createPorts
	 * Inicializo en la contruccion y seteo la cantidad de colecciones
	 * de variables a almacenar
	 * @param puertos
	 */
	private void createPorts(int puertos) {
		// TODO Auto-generated method stub
		
		
	}

	public ArrayList<ArrayList<Variable>> getVariables() {
		return variables;
	}

	public void setVariables(ArrayList<ArrayList<Variable>> variables) {
		this.variables = variables;
	}
	
	/**
	 * METODOS PUBLICOS PARA GESTION DE VARIABLES
	 */
	/**
	 * 
	 * @param index
	 * @return Arraylist que contiene las Variables de una CIAA
	 */
	public ArrayList<Variable> getColection(int index)
	{
		return this.getVariables().get(index);		
	}
	/**
	 * 
	 * @param valor "Valor de la Variable"
	 * @param col_index "Indice de la Coleccio [ciaa1,ciaa2,ciaa3]"
	 * @param var_index "Indice de la Variable - posicion"
	 */
	public void add(String data_stream, int index_collection)
	{
		ArrayList<String> data = new ArrayList<String>(Arrays.asList(data_stream.split(",")));
		
		for (int i = 0; i < data.size(); i++) {
			this.getColection(index_collection)//Obtengo la coleccion
					.get(i)//obtengo la Variable
					.add(Float.parseFloat(data.get(i)));//agrego a la lista de valores de esa variable	
		}
		
		
		
	}
	
	
	public void Show()
	{
		for (int i = 0; i < this.getVariables().size(); i++) 
		{
			for (int j = 0; j < this.getVariables().get(i).size(); j++) 
			{
				this.getVariables().get(i).get(j).show();
			}
		}
	}
	

	
}
