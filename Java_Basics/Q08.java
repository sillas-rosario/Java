/* Escreva um aplicativo que receba cada um dos sal�rios recebidos pelos empregados de uma
empresa e calcule a m�dia. O n�mero de empregados pode variar, por isso esse aplicativo
deve pedir para o usu�rio que digite -1 quando todos os sal�rios forem informados.*/

import javax.swing.JOptionPane;

public class Q08 {

	public static void main(String[] args) {
		
		float condicao=0, total=0;
		int i=0;
		
		while (condicao!=-1) {
			i++;
			String numero = JOptionPane.showInputDialog("Digite o sal�rio do empregado "+i
					+"\nOu (-1) para sair.");
			condicao=Integer.parseInt(numero);
			if (condicao!=-1) {
				total+=condicao;
			}
		}
		float media=total/(i-1);
		JOptionPane.showMessageDialog(null, "M�dia dos sal�rios �: "+media);
	
	}
}
