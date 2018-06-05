/*Crie um applet que possua um m�todo para calcular o fatorial de n�meros inteiros. O
usu�rio dever� informar um n�mero, o computador dever� responder qual � o fatorial deste
n�mero e depois perguntar se o usu�rio quer calcular o fatorial de outro n�mero ou sair do
programa. Exemplo: fatorial de 5 = 5! = 5 * 4 * 3 * 2 * 1*/

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Q24  extends JApplet{

	@Override
	public void init() {
		
		super.init();
		
		int resposta=1, numero;
		
		do {
			String num = JOptionPane.showInputDialog(null, "Digite um numero para ser calculado seu fatorial.");
			numero = Integer.parseInt(num);
			resposta = JOptionPane.showConfirmDialog(null, "O fatorial de " + numero + " �: " + calcularFatorial(numero) + "\n\nDeseja escolher outro numero?");
			
		} while (resposta == 0);
		System.exit(0);
	}
	private int calcularFatorial(int number) {
		
		int fatorial=1;
		for (int i = 2; i <= number; i++) {
			
			fatorial *= i; 
		}
		return fatorial;
	}
}
