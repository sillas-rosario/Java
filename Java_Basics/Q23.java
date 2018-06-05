/*Um número perfeito é aquele que é igual à soma de seus divisores. Exemplo, o número 6
é um número perfeito, pois 1 + 2 + 3 = 6 (os divisores de 6 são: 1, 2 e 3). Outro número
perfeito é 28, pois 1 + 2 + 4 + 7 + 14 = 28. Crie um método que receba um número inteiro e
retorne true ou false se esse número for perfeito ou não, respectivamente. Crie um applet que,
utilizando esse método, exiba todos os números perfeitos menores que 1000.*/

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
		JOptionPane.showMessageDialog(null, "Os numeros perfeitos de 0 a 1000 são:\n" + texto);
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
