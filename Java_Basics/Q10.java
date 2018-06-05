/*Crie um applet que receba do usuário os parâmetros a, b e c de uma equação do segundo
grau e exiba para o usuário os valores x1 e x2, respostas da equação.*/

import java.applet.Applet;

import javax.swing.JOptionPane;

public class Q10 extends Applet{

	@Override
	public void init() {

		super.init();
		String da=JOptionPane.showInputDialog(null, "*EQUAÇÃO DO 2° GRAU*"
				+ "\n\nDigite o valor da constante \"A \" para a equação    Ax² + Bx + C :");
		float a=Integer.parseInt(da);
		String db=JOptionPane.showInputDialog(null, "*EQUAÇÃO DO 2° GRAU*"
				+ "\n\nDigite o valor da constante \"B \" para a equação   "+a+"x² + Bx + C :");
		float b=Integer.parseInt(db);
		String dc=JOptionPane.showInputDialog(null, "*EQUAÇÃO DO 2° GRAU*"
				+ "\n\nDigite o valor da constante \"C \" para a equação   "+a+"x² + "+b+"x + C :");
		float c=Integer.parseInt(dc);
		float delta=b*b-4*a*c;
		double raizdelta = Math.pow(delta, 0.5);
		System.out.println(raizdelta);
		double x1=(-b+raizdelta)/(2*a);
		double x2=(-b-raizdelta)/(2*a);
		JOptionPane.showMessageDialog(null, "As raizes da equação  "+a+"x² + "+b+"x + "+c
				+" é:"
				+ "\nX1= "+x1+"    X2= "+x2);
	}
}
