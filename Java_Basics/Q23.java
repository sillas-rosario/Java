/*Um n�mero perfeito � aquele que � igual � soma de seus divisores. Exemplo, o n�mero 6
� um n�mero perfeito, pois 1 + 2 + 3 = 6 (os divisores de 6 s�o: 1, 2 e 3). Outro n�mero
perfeito � 28, pois 1 + 2 + 4 + 7 + 14 = 28. Crie um m�todo que receba um n�mero inteiro e
retorne true ou false se esse n�mero for perfeito ou n�o, respectivamente. Crie um applet que,
utilizando esse m�todo, exiba todos os n�meros perfeitos menores que 1000.*/

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Q23 extends JApplet{

	@Override
	public void init() {
		
		super.init();
		
		String texto = "";
		boolean numero;
		
		for (int i = 1; i < 1000; i++) {
			numero = verificaNumPerfeito(i);
			if (numero == true) {
				texto += (i + "   "); 
			}
		}
		JOptionPane.showMessageDialog(null, "Os numeros perfeitos de 0 a 1000 s�o:\n" + texto);
		System.exit(0);
		
	}
	private boolean verificaNumPerfeito(int numero) {
		
		int somadivisores = 0;
		
		for (int i = 1; i < numero; i++) {
			
			if (numero%i == 0) {
				somadivisores += i;
			}
		}
		if (numero == somadivisores) {
			return true;
		}else {
			return false;
		}
	}
}
