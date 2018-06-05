/*Modifique o programa anterior de forma que o número aleatório seja gerado em um
método e utilize repetição. Após exibir a resposta, o applet deverá perguntar se o usuário
deseja tentar novamente ou sair. Utilize o método JOptionPane.showConfirmDialog(), que
retorna 0 quando usuário confirma.*/

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
				JOptionPane.showMessageDialog(null, "Você acertou!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Você errou! O numero era: "+compara);
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
