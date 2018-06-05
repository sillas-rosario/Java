/*Crie um applet que possua um método onde duas matrizes inteiras são recebidas como
parâmetro e o retorno é uma matriz formada pela soma das outras duas. Duas matrizes 3x3
devem ser criadas já com valores e serem passadas como parâmetros.*/

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Q17 extends JApplet{
	
	@Override
	public void init() {
		
		super.init();
		
		int[][] matrizA = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrizB = {{9,8,7},{6,5,4},{3,2,1}};
		
		int[][] matrizD = new int[3][3];
		
		matrizD = somaMatriz(matrizA, matrizB);
		
		String desenhomatriz="";
		
		desenhomatriz+="Matriz A\n";
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				desenhomatriz+=matrizA[i][j]+" ";
			}
			desenhomatriz+="\n";
		}
		desenhomatriz+="Matriz B\n";
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				desenhomatriz+=matrizB[i][j]+" ";
			}
			desenhomatriz+="\n";
		}
		
		desenhomatriz+="Matriz (A+B)\n";
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				desenhomatriz+=matrizD[i][j]+" ";
			}
			desenhomatriz+="\n";
		}
		
		JOptionPane.showMessageDialog(null, desenhomatriz);
		System.exit(0);
	}
	
	private int[][] somaMatriz(int[][] matriz1, int[][] matriz2) {
		
		int[][] matrizC = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizC[i][j] = matriz1[i][j]+matriz2[i][j]; 
			}
		}
		return matrizC;
	}
}
