/*Crie um applet que possua um método que desenhe um círculo na tela em uma posição
aleatória que varie entre x = 1 até x = 300 e y = 1 até y = 200.*/

import java.awt.Graphics;

import javax.swing.JApplet;

public class Q14 extends JApplet{

	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		desenhacirculo(g);
		
	}
	private void desenhacirculo(Graphics h) {
		
		int x = (int)(Math.random()*299)+1;
		int y = (int)(Math.random()*199)+1;
		h.drawOval(x, y, 100, 100);

	}
}
