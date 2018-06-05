/*Faça um applet para controlar o consumo de combustível de veículos, pedindo ao usuário
quantos quilômetros foram percorridos (int) e quantos litros foram gastos (int). O programa
deve imprimir quantos quilômetros (float) foram percorridos por litro. Ao final, deve oferecer
ao usuário a opção de fazer outro cálculo ou finalizar o programa*/

import java.applet.Applet;

import javax.swing.JOptionPane;

public class Q09 extends Applet{
	@Override
	public void init() {

		super.init();
		int entrada;
		do {
			String opcao=JOptionPane.showInputDialog(null, 
					"*Calculo de consumo de combustivel*"
					+ "\n\n1-Calcular consumo."
					+ "\n2-Sair.");
			entrada= Integer.parseInt(opcao);
			if (entrada==1) {
				String op1=JOptionPane.showInputDialog(null, "Digite quantos quilometros foram percorridos:");
				int quilometros= Integer.parseInt(op1);
				String op2=JOptionPane.showInputDialog(null, "Digite quantos litros foram gastos:");
				int litros= Integer.parseInt(op2);
				float consumo= (float)quilometros/litros;
				JOptionPane.showMessageDialog(null, "O consumo em Km/L é: "+consumo);
			}
		} while (entrada==2);
	}

}
