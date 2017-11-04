package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtMuchosTextos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMiNombre = new JLabel("Mi nombre");
		lblMiNombre.setBounds(38, 42, 68, 14);
		contentPane.add(lblMiNombre);
		
		txtMuchosTextos = new JTextField();
		txtMuchosTextos.setText("Muchos textos");
		txtMuchosTextos.setBounds(116, 39, 86, 20);
		contentPane.add(txtMuchosTextos);
		txtMuchosTextos.setColumns(10);
		
		JButton btnClickeame = new JButton("Clickeame");
		btnClickeame.addActionListener(new ActionListener() {  //instancia una clase anonima
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnClickeame.setBounds(116, 135, 89, 23);
		contentPane.add(btnClickeame);
	}
}
