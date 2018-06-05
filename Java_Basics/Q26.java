/*O IMC (�ndice de Massa Corporal) � um �ndice utilizado para calcular se uma pessoa esta
abaixo de seu peso, acima do peso ou com peso normal. Seu c�lculo segue a f�rmula:
IMC = peso / altura2
onde peso � o peso da pessoa em quilogramas e altura � a altura da pessoa metros. Pessoas
com IMC�s menores que 18.5 s�o consideradas abaixo do peso, com IMC�s entre 18.5 e 23.5
s�o consideradas com peso normal e com IMC�s acima de 23.5 s�o obesas.
Crie um applet que receba do usu�rio seu peso e sua altura. O programa deve mostrar o IMC
do usu�rio e se ele est� com peso abaixo, normal ou acima dos padr�es. Logo ap�s o usu�rio
consultar um IMC o applet deve oferece a op��o de calcular outro IMC ou sair do programa.
Obs.: o c�lculo do IMC deve obrigatoriamente ser feito dentro de um m�todo denominado
calculaIMC, que deve receber o peso e a altura do usu�rio e n�o possuir valor de retorno.*/

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Q26 extends JApplet{

	@Override
	public void init() {
		
		super.init();
		
		int resposta = 1;
		
		do {
			String PESO = JOptionPane.showInputDialog(null, "Digite seu peso em Kg.");
			float peso = Float.parseFloat(PESO);
			
			String ALTURA = JOptionPane.showInputDialog(null, "Digite sua altura em metros.");
			float altura = Float.parseFloat(ALTURA);
			
			calculaIMC(peso, altura);
			
			resposta = JOptionPane.showConfirmDialog(null, "Voc� deseja calcular outro IMC?");
			
		} while (resposta == 0);
		System.exit(0);
	}
	private void calculaIMC(float peso, float altura) {
		
		float imc = peso/(altura*altura);
		
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Seu IMC �: " +imc+ "\n\nVoc� est� abaixo do peso!");
		
		} else if(imc <= 23.5){
			JOptionPane.showMessageDialog(null, "Seu IMC �: " +imc+ "\n\nVoc� est� com o peso normal!");	
		}
		else{
			JOptionPane.showMessageDialog(null, "Seu IMC �: " +imc+ "\n\nVoc� est� acima do peso!");
		}
	}
}
