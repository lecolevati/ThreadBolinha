package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.BolinhaThread;

public class Bolinha extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bolinha frame = new Bolinha();
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
	public Bolinha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblBolinha1 = new JLabel(".");
		lblBolinha1.setFont(new Font("Tahoma", Font.BOLD, 70));
		lblBolinha1.setBounds(87, 108, 55, 61);
		contentPane.add(lblBolinha1);
		
		final JLabel lblBolinha2 = new JLabel(".");
		lblBolinha2.setFont(new Font("Tahoma", Font.BOLD, 70));
		lblBolinha2.setBounds(235, 108, 55, 61);
		contentPane.add(lblBolinha2);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(10, 11, 89, 23);
		contentPane.add(btnIniciar);
		
		ActionListener inicia = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread tBolinha1 = new BolinhaThread(lblBolinha1);
				Thread tBolinha2 = new BolinhaThread(lblBolinha2);
				tBolinha1.start();
				tBolinha2.start();
			}
		};
		
		btnIniciar.addActionListener(inicia);
	}
}
