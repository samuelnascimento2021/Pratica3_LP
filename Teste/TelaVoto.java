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
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaVoto extends JFrame {

	private JPanel contentPane;
	private JTextField txtVoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
						
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVoto frame = new TelaVoto();
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
	public TelaVoto() {
		setTitle("Elei\u00E7\u00F5es para Representante de Turma");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("20- MARIA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(96, 42, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("30- PEDRO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(96, 67, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1- NULO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(96, 105, 61, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2- BRANCO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(96, 130, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Seu Voto");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(24, 177, 61, 14);
		contentPane.add(lblNewLabel_4);
		
		txtVoto = new JTextField();
		txtVoto.setBounds(96, 169, 86, 33);
		contentPane.add(txtVoto);
		txtVoto.setColumns(10);
		
		JButton btnVotar = new JButton("VOTAR");
		btnVotar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int voto;
				double soma20=0, soma30=0, soma1=0, soma2=0, Total=0;
				String vencedor="";				
				
				do 
				{
					voto = Integer.parseInt(txtVoto.getText());
					
					switch(voto) {
						case 20: soma20++; break;
						case 30: soma30++; break;
						case 1: soma1++; break;
						case 2: soma2++; break;
						case -1: break;
						
						default: JOptionPane.showMessageDialog(null,"Inválido",null, JOptionPane.WARNING_MESSAGE); break;
					
					}
				
				}
				while(voto!= -1);
				
				Total = soma20+soma30+soma1+soma2;
				
				if(soma20>soma30) vencedor = "MARIA";
				if(soma30>soma20) vencedor = "PEDRO";
						
				if(soma20>soma30) {
					JOptionPane.showMessageDialog(null, "Vencedor(a): " + vencedor + 
					String.format("\n%% de votos do vencedor: %.2f" , (soma20/Total)*100) + 
					String.format("\n%% de votos brancos: %.2f" , (soma2/Total)*100) +
					String.format("\n%% de votos nulos: %.2f" , (soma1/Total)*100) +
					"\nNúmero Total de usuários que votaram: " + Total ,"Resultado",JOptionPane.WARNING_MESSAGE);
				}
				else if(soma30>soma20){
					JOptionPane.showMessageDialog(null, "Vencedor(a): " + vencedor + 
					String.format("\n%% de votos do vencedor: %.2f" , (soma30/Total)*100) + 
					String.format("\n%% de votos brancos: %.2f" , (soma2/Total)*100) +
					String.format("\n%% de votos nulos: %.2f" , (soma1/Total)*100) +
					"\nNúmero Total de usuários que votaram: " + Total ,"Resultado",JOptionPane.WARNING_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "EMPATE! " + 
					String.format("\n%% de votos do candidato(a) Maria: %.2f" , (soma20/Total)*100) +
					String.format("\n%% de votos do candidato(a) Pedro: %.2f" , (soma30/Total)*100) +
					String.format("\n%% de votos brancos: %.2f" , (soma2/Total)*100) +
					String.format("\n%% de votos nulos: %.2f" , (soma1/Total)*100) +
					"\nNúmero Total de usuários que votaram: " + Total ,"Resultado",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnVotar.setBackground(Color.ORANGE);
		btnVotar.setForeground(new Color(0, 0, 0));
		btnVotar.setBounds(47, 213, 110, 23);
		contentPane.add(btnVotar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBackground(SystemColor.activeCaption);
		btnCancelar.setBounds(205, 213, 110, 23);
		contentPane.add(btnCancelar);
	}

}
