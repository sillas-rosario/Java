/*Crie um aplicativo que preencha um vetor de inteiros (10 posi��es) com n�meros
aleat�rios entre 1 e 100. Tal aplicativo deve pedir para que o usu�rio tente adivinhar um dos
n�meros contidos no vetor. Se ele adivinhar ou n�o deve ser exibido.*/

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
				JOptionPane.showMessageDialog(null, "Voc� acertou!");
			}
			else {
				contador++;
			}	
		}
		if (contador==10) {
			JOptionPane.showMessageDialog(null,"Os numeros sorteados foram:\n"+numero+"\nVoc� n�o acertou nenhum!");
		}
		System.exit(0);
	}
}

