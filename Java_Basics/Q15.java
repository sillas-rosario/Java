/*Crie um applet que gera um número aleatório entre 1 e 10. Após gerar este número, deve
pedir para que o usuário tente adivinhá-lo. Se o usuário conseguir, o applet exibe a frase
“Você acertou!”. Caso contrário, exibe a frase “Você errou, o número era X”.*/

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Q15 extends JApplet{

	@Override
	public void init() {
		
		super.init();
		
		int aleatorio = (int) (Math.random()*9) + 1;
		
		String numdigitado = JOptionPane.showInputDialog(null, "Neste momento o computador acabou de sortear um numero de 1 a 10.\nTente adivinha-lo.");
		
		int numero = Integer.parseInt(numdigitado);
		
		if (numero==aleatorio) {
			JOptionPane.showMessageDialog(null, "Você acertou!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Você errou! O numero era: "+aleatorio);
		}
		System.exit(0);
	}
}
