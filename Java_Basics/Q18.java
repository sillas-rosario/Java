/*Crie um aplicativo que preencha um vetor de inteiros (10 posições) com números
aleatórios entre 1 e 100. Tal aplicativo deve pedir para que o usuário tente adivinhar um dos
números contidos no vetor. Se ele adivinhar ou não deve ser exibido.*/

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Q18 extends JApplet{

	@Override
	public void init() {
		
		super.init();
		
		int[] vetor = new int[10];
		
		for (int i = 0; i < 10; i++) {
			
			vetor[i] =(int)(Math.random()*99)+1;
		}
		
		String numero = JOptionPane.showInputDialog(null, "O computador acabou de gerar 10 numeros de 1 a 100.\nTente adivinha um deles.");
		int compara = Integer.parseInt(numero);
		
		int contador=0;
		numero="";
		
		for (int i = 0; i < 10; i++) {
			
			numero += vetor[i]+"  ";
			
			if (compara==vetor[i]) {
				JOptionPane.showMessageDialog(null, "Você acertou!");
			}
			else {
				contador++;
			}	
		}
		if (contador==10) {
			JOptionPane.showMessageDialog(null,"Os numeros sorteados foram:\n"+numero+"\nVocê não acertou nenhum!");
		}
		System.exit(0);
	}
}

