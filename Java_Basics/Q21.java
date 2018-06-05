/* Fa�a um aplicativo que preencha um vetor (15 posi��es) com inteiros aleat�rios entre 0 e
9. Pe�a para o usu�rio informar um n�mero N (tamb�m entre 0 e 9) e fa�a com que o
programa exiba, de uma �nica vez, o vetor multiplicado por N. Ap�s exibir o resultado, o
programa deve dar ao usu�rio a op��o de informar outro valor de N ou sair. Por�m, o vetor
deve ser gerado uma �nica vez, no in�cio do programa.
Exemplo: o aplicativo gerou o seguinte vetor: 4-8-6-4-8-5-3-8-4-0-5-3-9-5-3
Se N = 2, dever� ser impresso: 8-16-12-8-16-10-6-16-8-0-10-6-18-10-6*/

import javax.swing.JOptionPane;

public class Q21 {

	public static void main(String[] args) {
		
		int[] vetor = new int[15];
		int[] vetorN = new int[15];
		
		int condition=1, numero;
		String texto="";
		String texto1="";
		String numero2 = "";
		
		for (int i = 0; i < 15; i++) {
			
			vetor[i] =(int) (Math.random()*10);
			texto1 += + vetor[i] + " - ";
		}
		
		do {
			
			String num = JOptionPane.showInputDialog(null, "O vetor gerado pelo computador �:\n\n"+ texto1 +"\n\nDigite um numero de 0 a 9.");
			numero = Integer.parseInt(num);
			
			
			if (numero<0||numero>9) {
				
				JOptionPane.showMessageDialog(null, "Numero invalido.");
				condition = 0;
				
			} else {
				
				//salva os numeros
				numero2 += num + ", ";
				
				for (int i = 0; i < 15; i++) {
					
					vetorN[i] = vetor[i]*numero;
					texto+= + vetorN[i] + " - ";
				}
				for (int i = 0; i < 15; i++) {
					
					vetor[i] = vetorN[i];					
				}
				condition = JOptionPane.showConfirmDialog(null, "O vetor gerado pelo computador multiplicado por "+numero2+" �:\n\n"+texto+"\n\nDeseja inserir outro numero?");
				texto = "";
			}
			
		} while (condition == 0);
	}
}
