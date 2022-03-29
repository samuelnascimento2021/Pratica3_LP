package Lista3;
import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int voto;
		int soma20=0, soma30=0, soma1=0, soma2=0, Total;
		String vencedor="";
		
		do 
		{
			voto = Integer.parseInt(JOptionPane.showInputDialog(" 20- MARIA\n 30- PEDRO\n\n 1- NULO\n 2- BRANCO\n Seu Voto: "));
			
			switch(voto) {
				case 20: soma20++; break;
				case 30: soma30++; break;
				case 1: soma1++; break;
				case 2: soma2++; break;
				
				default: JOptionPane.showMessageDialog(null,"Inválido",null, JOptionPane.WARNING_MESSAGE); break;
				
				
			}
			
						
			
			
		}
		while(voto!= -1);
		
		Total = soma20+soma30+soma1+soma2;
		
		if(soma20>soma30) vencedor = "MARIA";
		if(soma30>20) vencedor = "PEDRO";
		
		JOptionPane.showMessageDialog(null, "Vencedor: " + vencedor,"Resultado",JOptionPane.WARNING_MESSAGE);
		
		
		
		
		
	}

}
