import javax.swing.JFrame;
import javax.swing.JPanel;


public class PantallaPrincipal{

	public static void main(String args[]) {
		
		OracleAccess o = new OracleAccess();
		
		JFrame ventana=new JFrame();
		ventana.getContentPane().setLayout(null);
		ventana.setBounds(0, 0, 800, 800);
		
		
		PantallaCentral panel = new PantallaCentral("DiscoDuro", o);
		panel.setBounds(10, 11, 8000, 8000);
		ventana.getContentPane().add(panel);
		
		panel.test();
		
		ventana.setVisible(true);
		
		
		

		
	
	
	}
}
