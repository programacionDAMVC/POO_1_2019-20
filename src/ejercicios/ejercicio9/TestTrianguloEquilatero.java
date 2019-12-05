package ejercicios.ejercicio9;
import javax.swing.JOptionPane;

public class TestTrianguloEquilatero {

	public static void main(String[] args) {
		//solicitar el valor del cateto 1 y 2
		String sCateto1 = JOptionPane.showInputDialog("Introduce el valor del cateto1"); 
		String sCateto2 = JOptionPane.showInputDialog("Introduce el valor del cateto2");
		//parsear los String a float
		float fCateto1 = Float.parseFloat(sCateto1);
		float fCateto2 = Float.parseFloat(sCateto2);
		//construir el objeto TrianguloRectangulo
		TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(fCateto1, fCateto2);
		//mostramos la información
		JOptionPane.showMessageDialog(null,  trianguloRectangulo.toString(),"Triángulo rectángulo",
				JOptionPane.INFORMATION_MESSAGE); 
	}

}
