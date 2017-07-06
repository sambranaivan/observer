import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionVariable gestionVariable = new GestionVariable(3,12);
		
		
		String line1 = "1,2,3,4,5,6,7,8,9,10,11,12";
		String line2 = "13,14,15,16,17,18,19,20,21,22,23,24";
		String line3 = "0,1,2,3,4,5,6,7,8,9,10,11";
		gestionVariable.add(line1, 0);
		gestionVariable.add(line2, 1);
		gestionVariable.add(line3, 2);
		
		
		gestionVariable.getColection(0).get(0).add(99);
		gestionVariable.Show();
	
		
	}

}
