/*  Fa�a um aplicativo que receba do usu�rio 10 valores float e imprima tais valores na ordem
inversa que foram inseridos. Ap�s isso, se o usu�rio desejar, acione um m�todo para imprimir
qual � o maior valor, o menor valor e a m�dia dos valores informados.*/

import javax.swing.JOptionPane;

public class Q11 {

	public static void main(String[] args) {
		
		float vetor[]= new float [10];
		String numeros;
		
		JOptionPane.showMessageDialog(null, "Quest�o 1. Voc� ir� preencher um vetor de 10 posi��es \ne se desejar ir� calcular o maior, o menor e a media deles.");
		
		for (int i = 0; i < 10; i++) {
			
			numeros = JOptionPane.showInputDialog(null, "\nInsira o "+(i+1)+"� numero.");
			vetor[i]=(float)Integer.parseInt(numeros);
		}
		numeros="";
		for (int i = 9; i >= 0; i--) {
			
			numeros+=vetor[i]+"\n";
		}
		
		JOptionPane.showMessageDialog(null, "Os numeros que vc informou de traz para frente s�o:\n"+ numeros);
		int resposta=JOptionPane.showConfirmDialog(null, "Voc� deseja calcular o maior, o menor e a m�dia desses numeros?");
		if (resposta==0) {
			calcula(vetor);
		}
	}

	private static void calcula(float[] vetor) {
		
		float maior=0, menor=0, media=0, buff=0;
		
		//Selecionando o maior numero
		for (int i = 0; i < 9; i++) {
		
			if (vetor[i]>maior) {
			maior=vetor[i];
			}
		}
	
		//Selecionando o menor numero
		menor=maior;
		for (int i = 0; i < 9; i++) {
		
			if (vetor[i]<menor) {
				menor=vetor[i];
			}
		}
	
		//Calculando a media
		for (int i = 0; i < 10; i++) {
		
			buff+=vetor[i];
		}
		media=buff/10;
		JOptionPane.showMessageDialog(null, "O maior numero �: "+maior+"\nO menor �: "+menor+"\nA m�dia �: "+media);
		
	}
	
}
