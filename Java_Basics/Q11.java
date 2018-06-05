/*  Faça um aplicativo que receba do usuário 10 valores float e imprima tais valores na ordem
inversa que foram inseridos. Após isso, se o usuário desejar, acione um método para imprimir
qual é o maior valor, o menor valor e a média dos valores informados.*/

import javax.swing.JOptionPane;

public class Q11 {

	public static void main(String[] args) {
		
		float vetor[]= new float [10];
		String numeros;
		
		JOptionPane.showMessageDialog(null, "Questão 1. Você irá preencher um vetor de 10 posições \ne se desejar irá calcular o maior, o menor e a media deles.");
		
		for (int i = 0; i < 10; i++) {
			
			numeros = JOptionPane.showInputDialog(null, "\nInsira o "+(i+1)+"° numero.");
			vetor[i]=(float)Integer.parseInt(numeros);
		}
		numeros="";
		for (int i = 9; i >= 0; i--) {
			
			numeros+=vetor[i]+"\n";
		}
		
		JOptionPane.showMessageDialog(null, "Os numeros que vc informou de traz para frente são:\n"+ numeros);
		int resposta=JOptionPane.showConfirmDialog(null, "Você deseja calcular o maior, o menor e a média desses numeros?");
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
		JOptionPane.showMessageDialog(null, "O maior numero é: "+maior+"\nO menor é: "+menor+"\nA média é: "+media);
		
	}
	
}
