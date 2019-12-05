package teoria;
import javax.swing.JOptionPane;

public class EjemploJOptionPane {

	public static void main(String[] args) {
		int opcion = JOptionPane.showInternalConfirmDialog(null, "please choose one", 
				"information", JOptionPane.NO_OPTION,
						JOptionPane.ERROR_MESSAGE);
		System.out.println(opcion);
		

	}

}
