package Lista3;
import javax.swing.JOptionPane;
import Lista3.ValidaCPF;
public class Exercicio1 {
	
	public static void main(String[] args) {
       
        String Nome = JOptionPane.showInputDialog("Nome: ");
		String CPF = JOptionPane.showInputDialog("CPF: ");
        
		
        if (ValidaCPF.isCPF(CPF) == true)
           
        	JOptionPane.showMessageDialog(null, "Sucesso!");
        	//System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
        else JOptionPane.showMessageDialog(null, "Falha!");
        }

}
