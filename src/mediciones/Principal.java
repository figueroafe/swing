package mediciones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JScrollBar;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuAgregar agregar = new MenuAgregar();
				agregar.setVisible(true);
			}
		});
		btnNewButton.setBounds(308, 28, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnInforme = new JButton("Informe");
		btnInforme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInforme informe = new MenuInforme();
				informe.setVisible(true);
			}
		});
		btnInforme.setBounds(308, 82, 89, 23);
		contentPane.add(btnInforme);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 209, 240);
		contentPane.add(scrollPane);
		
		JList list_1 = new JList();
		scrollPane.setViewportView(list_1);
	}
}
