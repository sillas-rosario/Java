/*Crie um applet que desenhe 10 c�rculos na tela. O primeiro dever� aparecer na posi��o x
= 50 e Y = 50, o segundo na posi��o x = 60 e y = 50, e assim sucessivamente. Utilize o
comando for.*/

import java.awt.Graphics;

import javax.swing.JApplet;

public class Q13 extends JApplet{
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		int x=50;
		
		for (int i = 0; i < 10; i++) {
		
			g.drawOval(x, 50, 100, 100);
			
			x+=10;
		}
	}
}
