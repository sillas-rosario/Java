/*4) Faça um aplicativo que mostra na tela o quadrado de todos o números de 1 até um número
informado pelo usuário.*/

import javax.swing.JOptionPane;

public class Q04 {
	

	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Digite um numero:");
		int n=Integer.parseInt(numero);
		for (int i = n; i > 0; i--) {
			System.out.print(i*i);
			System.out.print("\n");
			}
	}
}
