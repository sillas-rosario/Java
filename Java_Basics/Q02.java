/*2) Escreva um aplicativo que lê do usuário dois números e mostre na tela o resultado da soma,
da subtração, da divisão e da multiplicação entre eles.*/

import javax.swing.JOptionPane;

public class Q02 {
	
	public static void main(String[] args) {
		String numero01 = JOptionPane.showInputDialog("Digite um numero:");
		String numero02 = JOptionPane.showInputDialog("Digite o segundo numero:");
		int novonumero01 = Integer.parseInt(numero01);
		int novonumero02 = Integer.parseInt(numero02);
		JOptionPane.showMessageDialog(null,"Primeiro numero: "+ numero01+ "   Segundo numero: "+ numero02 + 
		"\n\nSoma: " + (novonumero01+novonumero02)+
		"\nSubtração: "+ (novonumero01 - novonumero02) + 
		"\nMultiplicação: " + (novonumero01 * novonumero02)+
		"\nDivisão: "+(novonumero01 / novonumero02));
	}
}