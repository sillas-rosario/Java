/*3) Escreva um aplicativo onde o usu�rio fa�a a entrada de dois valores inteiros e o
computador imprima na tela �O maior � XX� (onde XX � um dos valores informados).*/

import javax.swing.JOptionPane;

public class Q03 {

	public static void main(String[] args) {
		String resposta1 = JOptionPane.showInputDialog("Informe o 1� numero:");
		String resposta2 = JOptionPane.showInputDialog("Informe o 2� numero:");
		int numero1=Integer.parseInt(resposta1);
		int numero2=Integer.parseInt(resposta2);
		int maior= Math.max(numero1, numero2);
		int menor= Math.min(numero1, numero2);
		JOptionPane.showMessageDialog(null, "O maior �: "+maior+
				"\nO menor �: "+menor);
		
	}
}
