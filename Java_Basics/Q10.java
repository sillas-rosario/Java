/*Crie um applet que receba do usu�rio os par�metros a, b e c de uma equa��o do segundo
grau e exiba para o usu�rio os valores x1 e x2, respostas da equa��o.*/

import java.applet.Applet;

import javax.swing.JOptionPane;

public class Q10 extends Applet{

	@Override
	public void init() {

		super.init();
		String da=JOptionPane.showInputDialog(null, "*EQUA��O DO 2� GRAU*"
				+ "\n\nDigite o valor da constante \"A \" para a equa��o    Ax� + Bx + C :");
		float a=Integer.parseInt(da);
		String db=JOptionPane.showInputDialog(null, "*EQUA��O DO 2� GRAU*"
				+ "\n\nDigite o valor da constante \"B \" para a equa��o   "+a+"x� + Bx + C :");
		float b=Integer.parseInt(db);
		String dc=JOptionPane.showInputDialog(null, "*EQUA��O DO 2� GRAU*"
				+ "\n\nDigite o valor da constante \"C \" para a equa��o   "+a+"x� + "+b+"x + C :");
		float c=Integer.parseInt(dc);
		float delta=b*b-4*a*c;
		double raizdelta = Math.pow(delta, 0.5);
		System.out.println(raizdelta);
		double x1=(-b+raizdelta)/(2*a);
		double x2=(-b-raizdelta)/(2*a);
		JOptionPane.showMessageDialog(null, "As raizes da equa��o  "+a+"x� + "+b+"x + "+c
				+" �:"
				+ "\nX1= "+x1+"    X2= "+x2);
	}
}
