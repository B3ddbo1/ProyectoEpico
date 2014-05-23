import java.sql.SQLException;
import java.util.LinkedList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PantallaCentral extends JPanel{

	String nombreTabla = "";
	OracleAccess codigo;
	protected JTextField[] jtCaracateristicas;
	protected JLabel[] jlCaracteristicas;
	
	
	//constructor
	PantallaCentral(String tabla, OracleAccess test){
		setLayout(null);
		codigo=test;

		
		nombreTabla=tabla;

		
		try {
			LinkedList<String> columnas=codigo.consultaNombreColumnas(nombreTabla);

			int numAT=columnas.size();
	
			jtCaracateristicas=new JTextField[numAT];
			jlCaracteristicas=new JLabel[numAT];
			
			
		for(int i=0,corY=20;i<numAT;corY+=30){
			
			jlCaracteristicas[i] = new JLabel(columnas.get(i));
			jlCaracteristicas[i].setBounds(10, corY, 200, 20);
			add(jlCaracteristicas[i]);
			
			jtCaracateristicas[i] = new JTextField();
			jtCaracateristicas[i].setBounds(200, corY, 100, 20);
			
			add(jtCaracateristicas[i]);

			i++;

			if(i<numAT){
				
				jlCaracteristicas[i] = new JLabel(columnas.get(i));
				jlCaracteristicas[i].setBounds(310, corY, 200, 20);
				add(jlCaracteristicas[i]);

				
				jtCaracateristicas[i] = new JTextField();
				jtCaracateristicas[i].setBounds(500, corY, 100,20);
				add(jtCaracateristicas[i]);

				
				i++;
			}//end if

			
			
		}//end for
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}//end construc
	

	
	public void test(){
		
		try {
			LinkedList<String> columnas=codigo.consultaNombreColumnas(nombreTabla);
			for(String s:columnas){
				System.out.println(s);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	
	
	
	
}//end clas
