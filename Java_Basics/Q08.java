/* Escreva um aplicativo que receba cada um dos salários recebidos pelos empregados de uma
empresa e calcule a média. O número de empregados pode variar, por isso esse aplicativo
deve pedir para o usuário que digite -1 quando todos os salários forem informados.*/

import javax.swing.JOptionPane;

public class Q08 {

	public static void main(String[] args) {
		
		float condicao=0, total=0;
		int i=0;
		
		while (condicao!=-1) {
			i++;
			String numero = JOptionPane.showInputDialog("Digite o salário do empregado "+i
					+"\nOu (-1) para sair.");
			condicao=Integer.parseInt(numero);
			if (condicao!=-1) {
				total+=condicao;
			}
		}
		float media=total/(i-1);
		JOptionPane.showMessageDialog(null, "Média dos salários é: "+media);
	
	}
}
