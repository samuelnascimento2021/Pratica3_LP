package Lista3;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCPF extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCPF frame = new TelaCPF();
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
	public TelaCPF() {
		setTitle("Valida CPF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(62, 54, 55, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(62, 106, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNome.setBounds(154, 54, 130, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCPF.setBounds(154, 104, 130, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JButton btnValida = new JButton("Conferir CPF");
		btnValida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ValidaCPF.isCPF(txtCPF.getText())==true)
					JOptionPane.showMessageDialog(null, "CPF Válido: " + txtCPF.getText() );
				else
					JOptionPane.showMessageDialog(null, "CPF Inválido!");
			}
		});
		btnValida.setBackground(SystemColor.activeCaption);
		btnValida.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnValida.setBounds(154, 174, 130, 23);
		contentPane.add(btnValida);
	}
}
