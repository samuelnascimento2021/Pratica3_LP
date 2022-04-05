package Lista3;
import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int voto;
		double soma20=0, soma30=0, soma1=0, soma2=0, Total=0;
		String vencedor="";
		
		do 
		{
			voto = Integer.parseInt(JOptionPane.showInputDialog(" 20- MARIA\n 30- PEDRO\n\n 1- NULO\n 2- BRANCO\n Seu Voto: "));
			
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

}
