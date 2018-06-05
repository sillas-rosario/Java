/*Crie um applet que receba do usu�rio os valores (double) dos dois catetos de um tri�ngulo
ret�ngulo e mostre para o usu�rio o valor da hipotenusa (a2 = b2 + c2). Tal c�lculo deve ser
feito dentro de um m�todo denominado �hipotenusa�. Lembre-se, o m�todo Math.sqrt(x)
retorna a raiz quadrada do double �x� que � passado como par�metro.*/

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Q12 extends JApplet{
	
	@Override
	public void init() {
		
		super.init();
		
		String b = JOptionPane.showInputDialog(null, "Iremos calcular a hipotenusa de um triangulo retangulo.\nDigite o valor de um dos catetos:");
		float cateto1 = Integer.parseInt(b);
		
		String c = JOptionPane.showInputDialog(null, "Digite o valor do segundo cateto:");
		float cateto2 = Integer.parseInt(c);
		
		JOptionPane.showMessageDialog(null, "O valor da hipotenusa �: " + hipotenusa(cateto1,cateto2));
		
		System.exit(0);
	}

	private static float hipotenusa(float x, float y){

		float buff = x*x+y*y;
		double hipot = Math.sqrt(buff); 
		return((float)hipot);
	}
	
}	

