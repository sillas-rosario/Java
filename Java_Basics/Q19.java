/*Crie um applet que possua um m�todo que receba como par�metro uma matriz de inteiros
e retorne qual � seu maior elemento. Tal applet deve declarar uma matriz 4x3 e preenche-la
com dados vindo do usu�rio.*/

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Q19 extends JApplet{

	@Override
	public void init() {
		
		super.init();
		
		int[][] matriz = new int[4][3];
		String elementos;
		String texto="";
		
		JOptionPane.showMessageDialog(null, "\n\nPrograma que recebe dados do usuario de uma matiz 4x3\ne seleciona o maior dos dados.");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				elementos = JOptionPane.showInputDialog(null, "Insira o elemento "+(i+1)+"x"+(j+1)+" da matriz 4x3.");
				matriz[i][j] = Integer.parseInt(elementos);
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				texto += matriz[i][j]+"   ";
			}
			texto += "\n";
		}
		
		JOptionPane.showMessageDialog(null, "A sua Matriz �:\n\n"+texto+"\n\nO maior elemento da sua matriz �: "+selecionaMaior(matriz));
		
		System.exit(0);
	}
	private int selecionaMaior(int[][] anymatrix) {
		
		int maior=0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (anymatrix[i][j]>maior) {
					maior = anymatrix[i][j];
				}
			}
		}
		return maior;
	}
}
