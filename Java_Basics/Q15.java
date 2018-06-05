/*Crie um applet que gera um n�mero aleat�rio entre 1 e 10. Ap�s gerar este n�mero, deve
pedir para que o usu�rio tente adivinh�-lo. Se o usu�rio conseguir, o applet exibe a frase
�Voc� acertou!�. Caso contr�rio, exibe a frase �Voc� errou, o n�mero era X�.*/

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
			JOptionPane.showMessageDialog(null, "Voc� acertou!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Voc� errou! O numero era: "+aleatorio);
		}
		System.exit(0);
	}
}
