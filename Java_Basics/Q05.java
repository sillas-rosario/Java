/*5) Fa�a um aplicativo que calcule o somat�rio de um n�mero informado pelo usu�rio.
Ex: o somat�rio de 6 � 21, pois 1+2+3+4+5+6 = 21.*/

import javax.swing.JOptionPane;

public class Q05 {
	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Digite um numero");
		int newnumero = Integer.parseInt(numero);
		int total=0;
		for (int i = 1; i <= newnumero; i++) {
			total = total+i;
			
		}
		JOptionPane.showMessageDialog(null, 
				"Somatorio de todos os numero at� "+newnumero+" �:\n"+total);
		System.out.println(total);
	}

}
