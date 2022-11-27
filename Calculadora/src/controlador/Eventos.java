package controlador;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import vista.VentanaPrincipal;


public class Eventos implements ActionListener{
	
	private VentanaPrincipal ventanaPrincipal;

	
	public Eventos(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ventanaPrincipal.getSuma()) {
			try{
				if (ventanaPrincipal.getNum1().getText().isEmpty()) {
					ventanaPrincipal.getSolucion().setText("No puedes dejar ningún campo vacio");	
				} else if(ventanaPrincipal.getNum2().getText().isEmpty()){
					ventanaPrincipal.getSolucion().setText("No puedes dejar ningún campo vacio");	
				} else {
					float suma = Float.parseFloat(ventanaPrincipal.getNum1().getText()) + Float.parseFloat(ventanaPrincipal.getNum2().getText());
					String sumaStr = String.valueOf(suma);  
					ventanaPrincipal.getSolucion().setText(sumaStr);
					ventanaPrincipal.getNum1().setText("");
					ventanaPrincipal.getNum2().setText("");
					ventanaPrincipal.getNum1().requestFocus();
					}
	        }
	        catch (Exception o) {
	        	System.out.println("Suma: Solo se pueden escribir enteros y/o punto decimal");  
	        	ventanaPrincipal.getSolucion().setText("*ERROR* Escribe enteros y/o punto decimal");	
	        	}
	    }
			
			
		if(e.getSource() == ventanaPrincipal.getResta()) {
			try{
				if (ventanaPrincipal.getNum1().getText().isEmpty()) {
					ventanaPrincipal.getSolucion().setText("No puedes dejar ningún campo vacio");	
				} else if(ventanaPrincipal.getNum2().getText().isEmpty()){
					ventanaPrincipal.getSolucion().setText("No puedes dejar ningún campo vacio");	
				} else {
					float resta = Float.parseFloat(ventanaPrincipal.getNum1().getText()) - Float.parseFloat(ventanaPrincipal.getNum2().getText());
					String restaStr = String.valueOf(resta);  
					ventanaPrincipal.getSolucion().setText(restaStr);
					ventanaPrincipal.getNum1().setText("");
					ventanaPrincipal.getNum2().setText("");
					ventanaPrincipal.getNum1().requestFocus();
					}
	        }
	        catch (Exception a) {
	        	System.out.println("Resta: Solo se pueden escribir enteros y/o punto decimal");  
	        	ventanaPrincipal.getSolucion().setText("*ERROR* Escribe enteros y/o punto decimal");	
	        	}
			}
		if(e.getSource() == ventanaPrincipal.getMultiplicar()) {
			try{
				if (ventanaPrincipal.getNum1().getText().isEmpty()) {
					ventanaPrincipal.getSolucion().setText("No puedes dejar ningún campo vacio");	
				} else if(ventanaPrincipal.getNum2().getText().isEmpty()){
					ventanaPrincipal.getSolucion().setText("No puedes dejar ningún campo vacio");	
				} else {
					float multi = Float.parseFloat((ventanaPrincipal.getNum1().getText())) * (Float.parseFloat(ventanaPrincipal.getNum2().getText()));
					String multiStr = String.valueOf(multi);  
					ventanaPrincipal.getSolucion().setText(multiStr);
					ventanaPrincipal.getNum1().setText("");
					ventanaPrincipal.getNum2().setText("");
					ventanaPrincipal.getNum1().requestFocus();
					}
	        }
	        catch (Exception a) {
	        	System.out.println("Multiplicar: Solo se pueden escribir enteros y/o punto decimal");  
	        	ventanaPrincipal.getSolucion().setText("*ERROR* Escribe enteros y/o punto decimal");	
	        	}
			}
		if(e.getSource() == ventanaPrincipal.getDividir()) {
			try{
				if (ventanaPrincipal.getNum1().getText().isEmpty()) {
					ventanaPrincipal.getSolucion().setText("No puedes dejar ningún campo vacio");	
				} else if(ventanaPrincipal.getNum2().getText().isEmpty()){
					ventanaPrincipal.getSolucion().setText("No puedes dejar ningún campo vacio");	
				} else {
					float dividir = Float.parseFloat((ventanaPrincipal.getNum1().getText()))/(Float.parseFloat(ventanaPrincipal.getNum2().getText()));
					String dividirStr = String.valueOf(dividir);  
					ventanaPrincipal.getSolucion().setText(dividirStr);
					ventanaPrincipal.getNum1().setText("");
					ventanaPrincipal.getNum2().setText("");
					ventanaPrincipal.getNum1().requestFocus();
					}
	        }
	        catch (Exception a) {
	        	System.out.println("Dividir: Solo se pueden escribir enteros y/o punto decimal");  
	        	ventanaPrincipal.getSolucion().setText("*ERROR* Escribe enteros y/o punto decimal");	
	        	}
			
			}
		if(e.getSource() == ventanaPrincipal.getRaiz2()) {
			JOptionPane.showMessageDialog(null, "Funcionalidad no disponible");
			ventanaPrincipal.getNum1().requestFocus();
			}
		
		if(e.getSource() == ventanaPrincipal.getRaiz3()) {
			JPasswordField pf = new JPasswordField();
			char[] passCorrecta = new char[] {'a','d','m','i','n'};
			int okOpcion = JOptionPane.showConfirmDialog(null, pf, "Introduzca la contraseña", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

			try{
				if (okOpcion == JOptionPane.OK_OPTION && Arrays.equals(pf.getPassword(), passCorrecta)) {
					String numero = JOptionPane.showInputDialog("Escriba el número con el que operar");
					double numeroFloat = Double.parseDouble(numero);
					double cubico = Math.cbrt(numeroFloat);
					String cubicoStr = String.valueOf(cubico);
					ventanaPrincipal.getSolucion().setText(cubicoStr);
				}else {
					JOptionPane.showMessageDialog(null, "Contraseña incorrecta!");
				}
	        }
	        catch (Exception a) {
	        	System.out.println("Raiz3: Solo se pueden escribir enteros y/o punto decimal");  
	        	ventanaPrincipal.getSolucion().setText("*ERROR* Escribe enteros y/o punto decimal");
	        	}
			}
}
	


	public VentanaPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}



}
