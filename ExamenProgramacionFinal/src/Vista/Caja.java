package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Container.Container;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Caja {

	private JFrame frame;
  private int id = 0;
  private JLabel lblCajaTotal;
  private JLabel lblCtotal;
  private JButton btnVolver;
  private JButton btnR;
  private JButton btnL;
  private JLabel lblI;
  private JLabel lblF;
  private JLabel lblDinero;
  


	/**
	 * Create the application.
	 */
	public Caja() {
		frame = new JFrame();
		lblCajaTotal = new JLabel("Caja Total");
		lblCtotal = new JLabel("");
		btnVolver = new JButton("Volver");
		
		btnR = new JButton("Rigth");
		
		btnL = new JButton("left");
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		
		propiedades();
		eventos();
		Mostrar();
	}

	public void propiedades(){
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		lblCajaTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCajaTotal.setBounds(148, 221, 82, 30);
		frame.getContentPane().add(lblCajaTotal);
		
		
		lblCtotal.setBounds(259, 221, 75, 30);
		frame.getContentPane().add(lblCtotal);
		
		
		btnVolver.setBounds(10, 221, 89, 35);
		frame.getContentPane().add(btnVolver);
		
		
		
		btnL.setBounds(148, 11, 89, 23);
		frame.getContentPane().add(btnL);
		
		
		btnR.setBounds(335, 11, 89, 23);
		frame.getContentPane().add(btnR);
		
		lblI = new JLabel("");
		lblI.setBounds(10, 89, 89, 14);
		frame.getContentPane().add(lblI);
		
		lblF = new JLabel("");
		lblF.setBounds(10, 125, 82, 14);
		frame.getContentPane().add(lblF);
		
		lblDinero = new JLabel("");
		lblDinero.setBounds(10, 158, 64, 14);
		frame.getContentPane().add(lblDinero);
		
		
	}
	
	public void eventos(){
	btnL.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			
			if(id>0){
				
				id-=1;
			}
		}
	});
	
	btnR.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			
        if(id<Container.getClientes().size()-1){
				
				id+=1;
			}
		}
	});
	
	
	btnVolver.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			
			Inicio ventana = new Inicio();
			ventana.getFrame().setVisible(true);
			frame.dispose();
		}
	});
	}
	
	public void Mostrar(){
		double dineroTotal=0;
		
		for(int i=0; i<Container.getClientes().size();i++){
		
		dineroTotal+=Container.getClientes().get(i).getPrecio();
		
		}
		lblCtotal.setText(String.valueOf(dineroTotal));
		
		lblI.setText(String.valueOf(Container.getClientes().get(id).getTiempoEntrada().toString()));
		lblF.setText(String.valueOf(Container.getClientes().get(id).getTiempoSalida().toString()));
		lblDinero.setText(String.valueOf(Container.getClientes().get(id).getPrecio()));
	}
	
	
	public JFrame getFrame() {
		return frame;
	}


}
