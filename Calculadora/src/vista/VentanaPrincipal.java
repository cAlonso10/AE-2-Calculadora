package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.Eventos;

public class VentanaPrincipal extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel numero1, numero2, resultado, logo, titulo, contraseña, solucion;
	private JTextField num1, num2;
	private JButton suma, resta, multiplicar, dividir, raiz2, raiz3;
	private JPasswordField password;
	Color colores=new Color(100, 200, 255);
	Color fondo=new Color(190, 190, 190);
	Font font = new Font("Times New Roman", Font.BOLD, 13);
	
	
	public VentanaPrincipal() {
		setSize(400, 600);
		setLocationRelativeTo(null); //Si pasamos un null centra la ventana 
		//setBounds(x, y, w, h) Es el equivalente a setSize y setLocation
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Aplicación");
		setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));
		getContentPane().setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	private void inicializarComponentes() {
		
		getContentPane().setBackground(fondo);
		
		//Image img = new ImageIcon("logo").getImage();
		//logo=new JLabel(new ImageIcon(img.getScaledInstance(80,  80, Image.SCALE_SMOOTH)));
		//logo.setBounds(95,20,80,80);S
		//add(logo);
		
		
		try {
			Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Figerona-VF.ttf"));
			titulo = new JLabel("Calculadora");
			titulo.setHorizontalAlignment(SwingConstants.CENTER);
			titulo.setFont(font.deriveFont(Font.BOLD, 40f));
			titulo.setBounds(87,20,289,80);
			titulo.setForeground(Color.blue);
			getContentPane().add(titulo);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		numero1 = new JLabel("Numero 1:");
		numero1.setBounds(100,120,60,30);
		numero1.setFont(font);
		numero1.setFont(font);
		getContentPane().add(numero1);
		
		num1 = new JTextField();
		num1.setBounds(165, 120, 110, 30);
		num1.setBorder(BorderFactory.createLineBorder(colores));
		num1.setFont(font);
		getContentPane().add(num1);
		
		numero2 = new JLabel("Numero 2:");
		numero2.setBounds(100,180,60,30);
		numero2.setFont(font);
		getContentPane().add(numero2);
		
		num2 = new JTextField();
		num2.setBounds(165, 180, 110, 30);
		num2.setBorder(BorderFactory.createLineBorder(colores));
		num2.setFont(font);
		getContentPane().add(num2);
		
		suma = new JButton("Sumar");
		suma.setBounds(40, 260, 120, 40);
		suma.setBackground(colores);
		suma.setFont(font);
		getContentPane().add(suma);
		
		resta = new JButton("Restar");
		resta.setBounds(220, 260, 120, 40);
		resta.setBackground(colores);
		resta.setFont(font);
		getContentPane().add(resta);
		
		multiplicar = new JButton("Multiplicar");
		multiplicar.setBounds(40, 340, 120, 40);
		multiplicar.setBackground(colores);
		multiplicar.setFont(font);
		getContentPane().add(multiplicar);
		
		dividir = new JButton("Dividir");
		dividir.setBounds(220, 340, 120, 40);
		dividir.setBackground(colores);
		dividir.setFont(font);
		getContentPane().add(dividir);
		
		raiz2 = new JButton("Raiz 2");
		raiz2.setBounds(40, 420, 120, 40);
		raiz2.setBackground(colores);
		raiz2.setFont(font);
		getContentPane().add(raiz2);
		
		raiz3 = new JButton("Raiz 3");
		raiz3.setBounds(220, 420, 120, 40);
		raiz3.setBackground(colores);
		raiz3.setFont(font);
		getContentPane().add(raiz3);
		
		resultado = new JLabel("Resultado: ");
		resultado.setBounds(40,500,80,30);
		resultado.setFont(font);
		getContentPane().add(resultado);
		
		solucion = new JLabel("");
		solucion.setBounds(110,500,250,30);
		solucion.setFont(font);
		getContentPane().add(solucion);
		
		JLabel labelIcon = new JLabel("*");
		labelIcon.setBounds(10, 20, 80, 96);
		getContentPane().add(labelIcon);
		ImageIcon img = new ImageIcon("calculator.png");
		labelIcon.setIcon(img);
		
		
	}
	
	public void establecerManejador(Eventos eventos) {
		suma.addActionListener(eventos);
		resta.addActionListener(eventos);
		multiplicar.addActionListener(eventos);
		dividir.addActionListener(eventos);
		raiz2.addActionListener(eventos);
		raiz3.addActionListener(eventos);
	}
	
	public JLabel getSolucion() {
		return solucion;
	}

	public void setSolucion(JLabel solucion) {
		this.solucion = solucion;
	}

	public JLabel getLogo() {
		return logo;
	}

	public void setLogo(JLabel logo) {
		this.logo = logo;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getContraseña() {
		return contraseña;
	}

	public void setContraseña(JLabel contraseña) {
		this.contraseña = contraseña;
	}

	public JPasswordField getPassword() {
		return password;
	}

	public void setPassword(JPasswordField password) {
		this.password = password;
	}


	public Color getColores() {
		return colores;
	}

	public void setColores(Color colores) {
		this.colores = colores;
	}

	public Color getFondo() {
		return fondo;
	}

	public void setFondo(Color fondo) {
		this.fondo = fondo;
	}

	public JLabel getNumero1() {
		return numero1;
	}

	public void setNumero1(JLabel numero1) {
		this.numero1 = numero1;
	}

	public JLabel getNumero2() {
		return numero2;
	}

	public void setNumero2(JLabel numero2) {
		this.numero2 = numero2;
	}

	public JLabel getResultado() {
		return resultado;
	}

	public void setResultado(JLabel resultado) {
		this.resultado = resultado;
	}

	public JTextField getNum1() {
		return num1;
	}

	public void setNum1(JTextField num1) {
		this.num1 = num1;
	}

	public JTextField getNum2() {
		return num2;
	}

	public void setNum2(JTextField num2) {
		this.num2 = num2;
	}

	public JButton getSuma() {
		return suma;
	}

	public void setSuma(JButton suma) {
		this.suma = suma;
	}

	public JButton getResta() {
		return resta;
	}

	public void setResta(JButton resta) {
		this.resta = resta;
	}

	public JButton getMultiplicar() {
		return multiplicar;
	}

	public void setMultiplicar(JButton multiplicar) {
		this.multiplicar = multiplicar;
	}

	public JButton getDividir() {
		return dividir;
	}

	public void setDividir(JButton dividir) {
		this.dividir = dividir;
	}

	public JButton getRaiz2() {
		return raiz2;
	}

	public void setRaiz2(JButton raiz2) {
		this.raiz2 = raiz2;
	}

	public JButton getRaiz3() {
		return raiz3;
	}

	public void setRaiz3(JButton raiz3) {
		this.raiz3 = raiz3;
	}
}
