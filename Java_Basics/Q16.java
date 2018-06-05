/*Modifique o programa anterior de forma que o n�mero aleat�rio seja gerado em um
m�todo e utilize repeti��o. Ap�s exibir a resposta, o applet dever� perguntar se o usu�rio
deseja tentar novamente ou sair. Utilize o m�todo JOptionPane.showConfirmDialog(), que
retorna 0 quando usu�rio confirma.*/

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Q16 extends JApplet{

	@Override
	public void init() {
		
		super.init();
		
		int opcao;
		
		do {
			String numdigitado = JOptionPane.showInputDialog(null, "Neste momento o computador acabou de sortear um numero de 1 a 10.\nTente adivinha-lo.");
			
			int numero = Integer.parseInt(numdigitado);
			
			int compara = criaNumeroAleatorio();
			
			if (numero==compara) {
				JOptionPane.showMessageDialog(null, "Voc� acertou!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Voc� errou! O numero era: "+compara);
			}
			opcao = JOptionPane.showConfirmDialog(null, "Deseja tentar novamente?");
			
		} while (opcao==0);
		
		System.exit(0);
	}
	private int criaNumeroAleatorio() {
		
		int aleatorio = (int) (Math.random()*9) + 1;
		return aleatorio;
	}
}
