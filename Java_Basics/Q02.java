/*2) Escreva um aplicativo que l� do usu�rio dois n�meros e mostre na tela o resultado da soma,
da subtra��o, da divis�o e da multiplica��o entre eles.*/

import javax.swing.JOptionPane;

public class Q02 {
	
	public static void main(String[] args) {
		String numero01 = JOptionPane.showInputDialog("Digite um numero:");
		String numero02 = JOptionPane.showInputDialog("Digite o segundo numero:");
		int novonumero01 = Integer.parseInt(numero01);
		int novonumero02 = Integer.parseInt(numero02);
		JOptionPane.showMessageDialog(null,"Primeiro numero: "+ numero01+ "   Segundo numero: "+ numero02 + 
		"\n\nSoma: " + (novonumero01+novonumero02)+
		"\nSubtra��o: "+ (novonumero01 - novonumero02) + 
		"\nMultiplica��o: " + (novonumero01 * novonumero02)+
		"\nDivis�o: "+(novonumero01 / novonumero02));
	}
}