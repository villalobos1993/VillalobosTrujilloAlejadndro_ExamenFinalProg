package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.joda.time.LocalTime;

import Container.Container;
import Models.Cliente;
import Models.ListaOrdenada;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Inicio {

	private JFrame frame;
	private JTextField textMatricula;
	private JLabel lblIntroduzcaMatricula;
	private  JButton btnSeccionEntrada;
	private JLabel lblUstedEntro;
	private JLabel lblSalida;
	private JButton btnSeccionPago;
	private JButton btnSeccionCaja;
	private JButton btnRegistrar;
	private JLabel lblMatricula;
	private JTextField textHora;
	private JTextField textSalida;
	private JButton btnPagar;
	private JTextField textMatricula2;
	private JLabel lblTotalAPagar;
	private JTextField textImporte;
	private JLabel lblCambio;
	private JLabel labelMcambio;
	private JLabel lblMtotal;
	private double dineroTotal;
	private int id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		frame = new JFrame();
		lblIntroduzcaMatricula = new JLabel("Introduzca Matricula");
		textMatricula = new JTextField();
		btnSeccionEntrada = new JButton("<html>Entrada <br>Vehiculo</html>");
		btnSeccionCaja = new JButton("Caja Dia");
		
		btnSeccionPago = new JButton("<html> Pagos y <br>Salida y<br> Vehiculo</html>");
		lblSalida = new JLabel("Hora salida:");
		lblUstedEntro = new JLabel("Hora entrada:");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		propiedades();
		eventos();
	
	}
	
	
	public void propiedades(){
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		lblIntroduzcaMatricula.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIntroduzcaMatricula.setBounds(126, 86, 148, 14);
		frame.getContentPane().add(lblIntroduzcaMatricula);
		
	
		textMatricula.setBounds(146, 111, 100, 20);
		frame.getContentPane().add(textMatricula);
		textMatricula.setColumns(10);
		
		
		btnSeccionEntrada.setBounds(10, 11, 105, 64);
		frame.getContentPane().add(btnSeccionEntrada);
		
		
		lblUstedEntro.setBounds(34, 136, 87, 14);
		frame.getContentPane().add(lblUstedEntro);
		
		
		lblSalida.setBounds(34, 161, 74, 14);
		frame.getContentPane().add(lblSalida);
		
		
		btnSeccionPago.setBounds(141, 11, 105, 64);
		frame.getContentPane().add(btnSeccionPago);
		
		
		btnSeccionCaja.setBounds(278, 11, 100, 64);
		frame.getContentPane().add(btnSeccionCaja);
		
		btnRegistrar = new JButton("Registrar");
		
		btnRegistrar.setBounds(146, 194, 105, 57);
		frame.getContentPane().add(btnRegistrar);
		
		lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(34, 114, 74, 14);
		frame.getContentPane().add(lblMatricula);
		
		textHora = new JTextField();
		textHora.setBounds(146, 133, 100, 20);
		frame.getContentPane().add(textHora);
		textHora.setColumns(10);
		
		textSalida = new JTextField();
		textSalida.setBounds(146, 158, 100, 20);
		frame.getContentPane().add(textSalida);
		textSalida.setColumns(10);
		
		btnPagar = new JButton("Pagar y salir del parking");
		
		btnPagar.setBounds(114, 194, 175, 57);
		frame.getContentPane().add(btnPagar);
		
		textMatricula2 = new JTextField();
		
		textMatricula2.setBounds(146, 111, 100, 20);
		frame.getContentPane().add(textMatricula2);
		textMatricula2.setColumns(10);
		
		lblTotalAPagar = new JLabel("Total a Pagar");
		lblTotalAPagar.setBounds(301, 99, 100, 32);
		frame.getContentPane().add(lblTotalAPagar);
		
		textImporte = new JTextField();
		textImporte.setBounds(292, 158, 109, 20);
		frame.getContentPane().add(textImporte);
		textImporte.setColumns(10);
		
		lblCambio = new JLabel("Cambio");
		lblCambio.setBounds(319, 194, 46, 14);
		frame.getContentPane().add(lblCambio);
		
		labelMcambio = new JLabel("");
		labelMcambio.setBounds(319, 215, 87, 36);
		frame.getContentPane().add(labelMcambio);
		
		lblMtotal = new JLabel("");
		lblMtotal.setBounds(311, 136, 46, 14);
		frame.getContentPane().add(lblMtotal);
		
		lblIntroduzcaMatricula.setVisible(false);
		lblSalida.setVisible(false);
		lblUstedEntro.setVisible(false);
		
		btnRegistrar.setVisible(false);
		
		textMatricula.setVisible(false);
		textHora.setVisible(false);
		textSalida.setVisible(false);
		
		lblMatricula.setVisible(false);
		btnPagar.setVisible(false);
		textMatricula2.setVisible(false);
		textImporte.setVisible(false);
		lblCambio.setVisible(false);
		labelMcambio.setVisible(false);
		lblTotalAPagar.setVisible(false);
		
	}
	
	public void eventos(){
		
		/**
		 * Boton de seccion entrada vehiculo
		 * 
		 */
		btnSeccionEntrada.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				lblIntroduzcaMatricula.setVisible(true);
				textMatricula.setVisible(true);
				btnRegistrar.setVisible(true);
				
				
				lblMatricula.setVisible(false);
				lblSalida.setVisible(false);
				lblUstedEntro.setVisible(false);
				
			
				textHora.setVisible(false);
				textSalida.setVisible(false);
				btnPagar.setVisible(false);
				textMatricula2.setVisible(false);
			}
		});
		
		/**
		 * Boton Registrar
		 */
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e ) {
				boolean correcto = true;
				Validaciones.Validaciones.validarmatricula(textMatricula.getText());
				
				if(textMatricula.equals("0")){
					correcto=false;
				}
				if(Container.getClientes().size()>0){
				for(int i = 0;i<Container.getClientes().size();i++ ){
					
					if(Container.getClientes().get(i).getMatricula().equals(textMatricula.getText())){
						
						JOptionPane.showMessageDialog(frame, "Este coche ya esta en el parking");
						correcto = false;
					}
				}
				}
				if(correcto){
					
					Cliente c = new Cliente(new LocalTime());
					JOptionPane.showMessageDialog(frame, "El vehiculo ha entrado");
					c.setTiempoEntrada(new LocalTime());
					c.setMatricula(textMatricula.getText());
					
					Container.getClientes().add(c);
				}
				
			}
		});
		
		
		/**
		 * Boton Pagos y salidas
		 * 
		 */
		
		btnSeccionPago.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblIntroduzcaMatricula.setVisible(false);
				textMatricula.setVisible(false);
				btnRegistrar.setVisible(false);
				
				lblMatricula.setVisible(true);
				lblSalida.setVisible(true);
				lblUstedEntro.setVisible(true);
				
				textMatricula2.setVisible(true);
				textHora.setVisible(true);
				textSalida.setVisible(true);
				btnPagar.setVisible(true);
			}
		});
		
		/**
		 * Eventos Focus TextMatricula
		 * 
		 */
		
		textMatricula2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				for(int i = 0 ; i<Container.getClientes().size();i++){
					
					if(textMatricula2.getText().equals(Container.getClientes().get(i).getMatricula())){
					    id=i;
						int minutos1=0;
						int minutos2=0;
						int minutos3=0;
						int minutos4=0;
						
						textHora.setText(Container.getClientes().get(i).getTiempoEntrada().toString());
						Container.getClientes().get(i).setTiempoSalida(new LocalTime());
						textSalida.setText(Container.getClientes().get(i).getTiempoSalida().toString());
						
						
						
						int minutos=((Container.getClientes().get(i).getTiempoSalida().getMinuteOfHour()-Container.getClientes().get(i).getTiempoEntrada().getMinuteOfHour()));
						
						if(minutos<=30){
						lblMtotal.setText(String.valueOf(minutos*0.492));
						}
						if(minutos>30 && minutos<=60){
						minutos2=minutos;
						minutos1=30;
						minutos2= minutos - minutos2;
						dineroTotal=(30*0.492)+(minutos2*0.00056);
						lblMtotal.setText(String.valueOf(minutos*0.492));
						Container.getClientes().get(i).setPrecio(dineroTotal);
						}
						
						if(minutos>60 && minutos<=720){
							minutos2=minutos;
							minutos3=minutos;
							minutos1=30;
							minutos2=30;
							minutos3= minutos - (minutos+minutos2);
							dineroTotal=(30*0.492)+(minutos2*0.00056)+(minutos3*0.0270);
							Container.getClientes().get(i).setPrecio(dineroTotal);
						}
						if(minutos>720){
							minutos2=minutos;
							minutos3=minutos;
							minutos1=30;
							minutos2=30;
							minutos3= 660;
							minutos4 = minutos - (minutos1+minutos2+minutos3);
							dineroTotal=(30*0.492)+(minutos2*0.00056)+(minutos3*0.0270)+(minutos4*0.15);
							Container.getClientes().get(i).setPrecio(dineroTotal);
						}
						
						labelMcambio.setText(String.valueOf(dineroTotal) + "E");
						textImporte.setVisible(true);
						lblCambio.setVisible(false);
						
						
					}
				}
			}
		});
		
		/**
		 * Boton Pagar
		 */
		
		btnPagar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				double dinero = 0;
				double cambio=0;
				if(textImporte.getText().isEmpty()){
					JOptionPane.showMessageDialog(frame, "No ha introducido importe");
				}
				
				try {
					dinero=Double.parseDouble(textImporte.getText());
				}
				catch (Exception i)
				{
					JOptionPane.showMessageDialog(frame, "No ha introducido un valor correcto");
				}
				
				
				if(dinero<dineroTotal){
					JOptionPane.showMessageDialog(frame, "Has introducido menos cantidad que lo que ha pedido.");
				}
				else{
					
					cambio=(dinero-dineroTotal);
					lblCambio.setVisible(true);
					lblMtotal.setVisible(true);
					lblTotalAPagar.setVisible(true);
					labelMcambio.setVisible(true);
					labelMcambio.setText(String.valueOf(cambio));
					
				}
				
			}
		});
		
		/**
		 * Boton seccion Caja
		 */
		btnSeccionCaja.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				Caja c = new Caja();
				c.getFrame().setVisible(true);
				frame.setVisible(false);
			}
		});
	}

	public JFrame getFrame() {
		return frame;
	}


	
}
