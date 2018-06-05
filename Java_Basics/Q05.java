/*5) Faça um aplicativo que calcule o somatório de um número informado pelo usuário.
Ex: o somatório de 6 é 21, pois 1+2+3+4+5+6 = 21.*/

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
				"Somatorio de todos os numero até "+newnumero+" é:\n"+total);
		System.out.println(total);
	}

}
