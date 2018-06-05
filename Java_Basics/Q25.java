/*Crie um applet que calcule a �rea das figuras geom�tricas (quadrado, ret�ngulo, tri�ngulo
e c�rculo). Como cada figura possui uma f�rmula diferente para calcular sua �rea, crie um
m�todo diferente para cada uma das figuras. Em cada m�todo o usu�rio dever� passar ao
applet somente a informa��o necess�ria, ou seja, no m�todo para calcular a �rea do quadrado
o usu�rio deve informar somente o lado, no m�todo para calcular a �rea do tri�ngulo ele deve
informar a base e a altura, e assim sucessivamente. Trabalhe com valores do tipo double.*/

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Q25 extends JApplet{

	@Override
	public void init() {
		
		super.init();
		
		int resposta=1;
		double area;
		
		do {
			String op�ao = JOptionPane.showInputDialog(null, "Programa para calcular �rea de figuras geom�tricas\n\n1-Quadrado\n2-Ret�ngulo\n3-Tri�ngulo\n4-C�culo\n5-Sair");
			int key = Integer.parseInt(op�ao);
			
			switch (key) {
			case 1:
				String a = JOptionPane.showInputDialog(null, "Qual o lado do quadrado?");
				double lado = Integer.parseInt(a);
				
				area = calcularAreaQuadrado(lado);
				JOptionPane.showMessageDialog(null, "A area do quadrado de lado " +lado+ "�:\n" +area);
				break;
				
			case 2:
				String b = JOptionPane.showInputDialog(null, "Qual o comprimento do ret�ngulo?");
				double comprimento = Integer.parseInt(b);
				
				String c = JOptionPane.showInputDialog(null, "Qual altura do ret�ngulo?");
				double alturaretangulo = Integer.parseInt(c);
				
				area = calcularAreaRetandulo(comprimento, alturaretangulo);
				
				JOptionPane.showMessageDialog(null, "A area do ret�ngulo de comprimento " +comprimento+ " e altura " + alturaretangulo + " �:\n" +area);
				break;
			
			case 3:
				String d = JOptionPane.showInputDialog(null, "Qual o comprimento da base do tri�ngulo?");
				double base = Integer.parseInt(d);
				
				String e = JOptionPane.showInputDialog(null, "Qual altura do tri�ngulo?");
				double alturatriangulo = Integer.parseInt(e);
				
				area = calcularAreaTriangulo(base, alturatriangulo);
				
				JOptionPane.showMessageDialog(null, "A area do tri�ngulo de base " +base+ "e altura :" + alturatriangulo + " �:\n" +area);
				break;
				
			case 4:
				String f = JOptionPane.showInputDialog(null, "Qual o raio do circulo?");
				double raio = Integer.parseInt(f);
				
				area = calcularAreaCirculo(raio);
				JOptionPane.showMessageDialog(null, "A area do circulo de raio " + raio + "�:\n" +area);
				break;
				
			case 5:
				System.exit(0);
				resposta = 0;

			default:JOptionPane.showMessageDialog(null,"Op��o incorreta! Tente novamente.");
				break;
			}
			
		} while (resposta == 1);
	}
	private double calcularAreaQuadrado(double x) {
		
		return Math.pow(x, 2);
	}
	
	private double calcularAreaRetandulo(double comprimento, double altura) {
		
		return (comprimento*altura);
	}
	
	private double calcularAreaTriangulo(double base, double altura) {
		
		return (base*altura)/2;
	}
	
	private double calcularAreaCirculo(double raio) {
		
		return (Math.PI)*(Math.pow(raio, 2));
	}
}
