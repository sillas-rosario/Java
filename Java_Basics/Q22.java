/*Crie um aplicativo para gerar uma sequência de números aleatórios como sugestão para
um jogo da mega sena, faça a geração de números (1 a 60) em um método que trate repetição.*/

import javax.swing.JOptionPane;

public class Q22 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Sugestão de jogo para Mega sena:\n\n" + gerarJogoMegaSena());
		
	}
	private static String gerarJogoMegaSena() {
		
		int numero;
		String jogo="";
		for (int i = 0; i < 6; i++) {
			
			numero = (int)(Math.random()*60) + 1;
			if (!jogo.contains(numero+" - ")) {
				
				jogo += numero + " - ";
			}
			else {
				i--;
			}
				
		}
		return jogo;
	}
}
