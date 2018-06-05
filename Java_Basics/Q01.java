/*1) Escreva um aplicativo que o usuário informe seu nome e sua idade, separadamente, e o
computador escreva: “Fulano de Tal, sua idade é: XX” (onde Fulano de Tal é o nome da
pessoa e XX sua idade).*/

import javax.swing.JOptionPane;

public class Q01 {

	public static void main(String[] args) {
		String nome= JOptionPane.showInputDialog("Digite seu nome");
		String idade= JOptionPane.showInputDialog("Digite sua idade");
		JOptionPane.showMessageDialog(null,nome + " sua idade é " + idade + " anos ");
	}
}
