/*Crie um applet que calcule a área das figuras geométricas (quadrado, retângulo, triângulo
e círculo). Como cada figura possui uma fórmula diferente para calcular sua área, crie um
método diferente para cada uma das figuras. Em cada método o usuário deverá passar ao
applet somente a informação necessária, ou seja, no método para calcular a área do quadrado
o usuário deve informar somente o lado, no método para calcular a área do triângulo ele deve
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
			String opçao = JOptionPane.showInputDialog(null, "Programa para calcular área de figuras geométricas\n\n1-Quadrado\n2-Retângulo\n3-Triângulo\n4-Cículo\n5-Sair");
			int key = Integer.parseInt(opçao);
			
			switch (key) {
			case 1:
				String a = JOptionPane.showInputDialog(null, "Qual o lado do quadrado?");
				double lado = Integer.parseInt(a);
				
				area = calcularAreaQuadrado(lado);
				JOptionPane.showMessageDialog(null, "A area do quadrado de lado " +lado+ "é:\n" +area);
				break;
				
			case 2:
				String b = JOptionPane.showInputDialog(null, "Qual o comprimento do retângulo?");
				double comprimento = Integer.parseInt(b);
				
				String c = JOptionPane.showInputDialog(null, "Qual altura do retângulo?");
				double alturaretangulo = Integer.parseInt(c);
				
				area = calcularAreaRetandulo(comprimento, alturaretangulo);
				
				JOptionPane.showMessageDialog(null, "A area do retângulo de comprimento " +comprimento+ " e altura " + alturaretangulo + " é:\n" +area);
				break;
			
			case 3:
				String d = JOptionPane.showInputDialog(null, "Qual o comprimento da base do triângulo?");
				double base = Integer.parseInt(d);
				
				String e = JOptionPane.showInputDialog(null, "Qual altura do triângulo?");
				double alturatriangulo = Integer.parseInt(e);
				
				area = calcularAreaTriangulo(base, alturatriangulo);
				
				JOptionPane.showMessageDialog(null, "A area do triângulo de base " +base+ "e altura :" + alturatriangulo + " é:\n" +area);
				break;
				
			case 4:
				String f = JOptionPane.showInputDialog(null, "Qual o raio do circulo?");
				double raio = Integer.parseInt(f);
				
				area = calcularAreaCirculo(raio);
				JOptionPane.showMessageDialog(null, "A area do circulo de raio " + raio + "é:\n" +area);
				break;
				
			case 5:
				System.exit(0);
				resposta = 0;

			default:JOptionPane.showMessageDialog(null,"Opção incorreta! Tente novamente.");
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
