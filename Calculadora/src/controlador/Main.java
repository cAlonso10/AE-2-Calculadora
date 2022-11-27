package controlador;


import vista.VentanaPrincipal;

public class Main {

		
	
	public static void main(String[] args) {
		
		
		
		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
		
		Eventos eventos = new Eventos(ventanaPrincipal);
		
		ventanaPrincipal.establecerManejador(eventos);
		
		
		
	}


	
}
