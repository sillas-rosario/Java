/*4) Fa�a um aplicativo que mostra na tela o quadrado de todos o n�meros de 1 at� um n�mero
informado pelo usu�rio.*/

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
