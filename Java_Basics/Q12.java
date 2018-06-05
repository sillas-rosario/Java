/*Crie um applet que receba do usuário os valores (double) dos dois catetos de um triângulo
retângulo e mostre para o usuário o valor da hipotenusa (a2 = b2 + c2). Tal cálculo deve ser
feito dentro de um método denominado “hipotenusa”. Lembre-se, o método Math.sqrt(x)
retorna a raiz quadrada do double “x” que é passado como parâmetro.*/

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
		
		JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + hipotenusa(cateto1,cateto2));
		
		System.exit(0);
	}

	private static float hipotenusa(float x, float y){

		float buff = x*x+y*y;
		double hipot = Math.sqrt(buff); 
		return((float)hipot);
	}
	
}	

