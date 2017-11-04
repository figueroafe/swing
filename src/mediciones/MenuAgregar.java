package mediciones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Choice;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuAgregar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAgregar frame = new MenuAgregar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuAgregar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Choice etiquetaAnio = new Choice();
		etiquetaAnio.setBounds(151, 25, 161, 26);
		etiquetaAnio.add("2015");
		etiquetaAnio.add("2016");
		etiquetaAnio.add("2017");
		contentPane.add(etiquetaAnio);
		
		Choice etiquetaMes = new Choice();
		etiquetaMes.setBounds(151, 74, 161, 20);
		etiquetaMes.add("1");
		etiquetaMes.add("2");
		etiquetaMes.add("3");
		etiquetaMes.add("4");
		etiquetaMes.add("5");
		etiquetaMes.add("6");
		etiquetaMes.add("7");
		etiquetaMes.add("8");
		etiquetaMes.add("9");
		etiquetaMes.add("10");
		etiquetaMes.add("11");
		etiquetaMes.add("12");
		contentPane.add(etiquetaMes);
		
		TextField temperatura = new TextField();
		temperatura.setBounds(151, 117, 161, 20);
		contentPane.add(temperatura);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal principal = new Principal();
				principal.setVisible(true);
			}
		});
		btnAceptar.setBounds(76, 185, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal principal = new Principal();
				principal.setVisible(true);
			}
		});
		btnCancelar.setBounds(263, 185, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setBounds(28, 25, 105, 20);
		contentPane.add(lblAo);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(28, 80, 46, 14);
		contentPane.add(lblMes);
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setBounds(28, 123, 105, 14);
		contentPane.add(lblTemperatura);
	}
}
