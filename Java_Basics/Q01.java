/*1) Escreva um aplicativo que o usu�rio informe seu nome e sua idade, separadamente, e o
computador escreva: �Fulano de Tal, sua idade �: XX� (onde Fulano de Tal � o nome da
pessoa e XX sua idade).*/

import javax.swing.JOptionPane;

public class Q01 {

	public static void main(String[] args) {
		String nome= JOptionPane.showInputDialog("Digite seu nome");
		String idade= JOptionPane.showInputDialog("Digite sua idade");
		JOptionPane.showMessageDialog(null,nome + " sua idade � " + idade + " anos ");
	}
}
