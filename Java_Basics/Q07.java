/*7) Escreva um aplicativo que utilize repeti��o para imprimir na tela a seguinte sequ�ncia de *:
*
**
***
****
*****
****** */

import javax.swing.JOptionPane;

public class Q07 {

	public static void main(String[] args) {
		String texto="";
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < i+1; j++) {
				texto+="*";
			}
			texto+="\n";
		}
		JOptionPane.showMessageDialog(null, texto);
	}

}
