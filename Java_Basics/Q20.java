/*Crie um applet que possua um método que receba como parâmetro uma matriz de
inteiros, que deve ser 3x3 e seu preenchimento deve feito pelo usuário. Tal applet deve
possuir um método que retorne um vetor formado pela primeira linha da matriz (linha 0) e
outro método que retorne a soma dos elementos que estão acima da diagonal principal, com
um menu para a escolha de qual método deve ser utilizado.*/

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Q20 extends JApplet{

	@Override
	public void init() {
		
		super.init();
		
		int[][] matriz = new int[3][3];
		int opcao2=0, contador=0;
		
		do {
			
			String entrada = JOptionPane.showInputDialog(null, "Programa para preencher uma matriz 3x3.\n\n1-Preencher matriz 3x3.\n2-Selecionar 1° linha.\n3-Cacular a soma dos elementos acima da diagonal principal.\n4-Sair.");
			
			int opcao1 = Integer.parseInt(entrada);
			opcao2 = opcao1;
			
			switch (opcao1) {
			case 1:
				matriz = prencherMatriz();
				contador++;
				break;
			case 2:
				if (contador != 0) {
					selecPrimeiraLinha(matriz);
				}else{
					JOptionPane.showMessageDialog(null, "Você deve peencher a matriz primeiro.");
				}
				break;
			case 3:
				if (contador != 0) {
					int soma = somarAcimaDiagonalPrinc(matriz);
					JOptionPane.showMessageDialog(null, "A soma dos elementos acima da diagonal principal é: "+ soma);
				
				}else{
					JOptionPane.showMessageDialog(null, "Você deve peencher a matriz primeiro.");
				}
				
				break;
			case 4:
				System.exit(0);
				break;

			default: JOptionPane.showMessageDialog(null, "Opção invalida. Tente novamente.");
				break;
			}
		} while (opcao2 !=4 );
	}
	
	private int[][] prencherMatriz() {
		int[][] matrix = new int[3][3];
		String buff;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				buff = JOptionPane.showInputDialog(null, "Digite o elemento "+(i+1)+"x"+(j+1)+" da matriz 3x3.");
				matrix[i][j] = Integer.parseInt(buff);
			}
		}
		return matrix;
	}
	
	private void selecPrimeiraLinha(int[][] matrix) {
		int[] vetor = new int[3];
		String texto="";
		for (int i = 0; i < 3; i++) {
			vetor[i] = matrix[1][i];
			texto+=vetor[i]+" - ";
		}
		JOptionPane.showMessageDialog(null,"A primeira linha de sua matriz é:\n" + texto);
	}
	
	private int somarAcimaDiagonalPrinc(int[][] matrix) {
		int somatotal=0,somaparcial=0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				somatotal += matrix[i][j];
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < i+1; j++) {
				somaparcial += matrix[i][j];
			}
		}
		return somatotal - somaparcial;
	}
}