/*Crie um aplicativo para gerar uma sequ�ncia de n�meros aleat�rios como sugest�o para
um jogo da mega sena, fa�a a gera��o de n�meros (1 a 60) em um m�todo que trate repeti��o.*/

import javax.swing.JOptionPane;

public class Q22 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Sugest�o de jogo para Mega sena:\n\n" + gerarJogoMegaSena());
		
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
