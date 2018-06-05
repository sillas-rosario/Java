/*Crie um applet que possua um m�todo que desenhe um c�rculo na tela em uma posi��o
aleat�ria que varie entre x = 1 at� x = 300 e y = 1 at� y = 200.*/

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
