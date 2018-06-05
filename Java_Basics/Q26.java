/*O IMC (Índice de Massa Corporal) é um índice utilizado para calcular se uma pessoa esta
abaixo de seu peso, acima do peso ou com peso normal. Seu cálculo segue a fórmula:
IMC = peso / altura2
onde peso é o peso da pessoa em quilogramas e altura é a altura da pessoa metros. Pessoas
com IMC’s menores que 18.5 são consideradas abaixo do peso, com IMC’s entre 18.5 e 23.5
são consideradas com peso normal e com IMC’s acima de 23.5 são obesas.
Crie um applet que receba do usuário seu peso e sua altura. O programa deve mostrar o IMC
do usuário e se ele está com peso abaixo, normal ou acima dos padrões. Logo após o usuário
consultar um IMC o applet deve oferece a opção de calcular outro IMC ou sair do programa.
Obs.: o cálculo do IMC deve obrigatoriamente ser feito dentro de um método denominado
calculaIMC, que deve receber o peso e a altura do usuário e não possuir valor de retorno.*/

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
			
			resposta = JOptionPane.showConfirmDialog(null, "Você deseja calcular outro IMC?");
			
		} while (resposta == 0);
		System.exit(0);
	}
	private void calculaIMC(float peso, float altura) {
		
		float imc = peso/(altura*altura);
		
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Seu IMC é: " +imc+ "\n\nVocê está abaixo do peso!");
		
		} else if(imc <= 23.5){
			JOptionPane.showMessageDialog(null, "Seu IMC é: " +imc+ "\n\nVocê está com o peso normal!");	
		}
		else{
			JOptionPane.showMessageDialog(null, "Seu IMC é: " +imc+ "\n\nVocê está acima do peso!");
		}
	}
}
