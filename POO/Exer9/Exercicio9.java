package Exer9;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exercicio9 extends JFrame{
	
	JButton botao1; 
	JButton botao2; 
	JButton botao3; 
	JButton botao4; 
	JButton botao5; 
	JButton botao6; 
	JButton botao7; 
	JButton botao8; 
	JButton botao9; 
	JButton botao10; 
	JButton botao11; 
	
	
	JTextField caixatextoconta;
	 JTextField caixatextoagencia;
	 JTextField caixatextosenha;
	 
	 String a="";;
	 public Exercicio9() {
	
			Container Tela = getContentPane();
			Tela.setLayout(new FlowLayout());
			Manipulador objetolistener = new Manipulador();

			botao1 = new JButton();
			botao1.setText(" 1 ");
			botao1.addActionListener(objetolistener);
			botao1.setBounds(10,10 , 70, 70);
			Tela.add(botao1);
		
			botao2 = new JButton();
			botao2.setText(" 2 ");
			botao2.addActionListener(objetolistener);
			botao2.setBounds(90,10, 70, 70);
			Tela.add(botao2);
			
			botao3 = new JButton();
			botao3.setText(" 3 ");
			botao3.addActionListener(objetolistener);
			botao3.setBounds(170,10, 70, 70);
			Tela.add(botao3);
			
			botao4 = new JButton();
			botao4.setText(" 4 ");
			botao4.addActionListener(objetolistener);
			botao4.setBounds(10,90, 70, 70);
			Tela.add(botao4);
			
			botao5 = new JButton();
			botao5.setText(" 5 ");
			botao5.addActionListener(objetolistener);
			botao5.setBounds(90,90, 70, 70);
			Tela.add(botao5);
			
			botao6 = new JButton();
			botao6.setText(" 6 ");
			botao6.addActionListener(objetolistener);
			botao6.setBounds(170,90, 70, 70);
			Tela.add(botao6);
			
			botao7 = new JButton();
			botao7.setText(" 7 ");
			botao7.addActionListener(objetolistener);
			botao7.setBounds(10,170, 70, 70);
			Tela.add(botao7);
			
			botao8 = new JButton();
			botao8.setText(" 8 ");
			botao8.addActionListener(objetolistener);
			botao8.setBounds(90,170, 70, 70);
			Tela.add(botao8);
			
			botao9 = new JButton();
			botao9.setText(" 9 ");
			botao9.addActionListener(objetolistener);
			botao9.setBounds(170,170, 70, 70);
			Tela.add(botao9);
			
			botao10 = new JButton();
			botao10.setText(" 0 ");
			botao10.addActionListener(objetolistener);
			botao10.setBounds(10,260, 230, 30);
			Tela.add(botao10);
			
			
			botao11 = new JButton();
			botao11.setText(" Validar senha ");
			botao11.addActionListener(objetolistener);
			botao11.setBounds(10,260, 230, 30);
			Tela.add(botao11);
			
			
			 caixatextoconta = new JTextField(8);
			 caixatextoconta.setText("Conta");
			 Tela.add(caixatextoconta);
			
			 caixatextoagencia = new JTextField(5);
			 caixatextoagencia.setText(" Agencia");
			 Tela.add(caixatextoagencia);
			
			 caixatextosenha = new JTextField(8);
			 caixatextosenha.setText("Senha");
			 Tela.add(caixatextosenha);
			 }
	 
			 public static void main(String args[]){
			 Exercicio9 janela = new Exercicio9();
			 janela.setSize(200,250);
			 janela.setVisible(true);
			 }
			 
			 public class Manipulador implements ActionListener{
			 public void actionPerformed (ActionEvent event){
			 if (event.getSource() == botao11){
				 JOptionPane.showMessageDialog(null, " Senha cadastrada ");
				 
			 }
			 if (event.getSource() == botao1){
				 caixatextosenha.setText(a+"1");
				 a +="1";
			 }
			 if (event.getSource() == botao2){
				 caixatextosenha.setText(a+"2");
				 a +="2";
			 }
			 if (event.getSource() == botao3){
				 caixatextosenha.setText(a+"3");
				 a +="3";
			 }
			 if (event.getSource() == botao4){
				 caixatextosenha.setText(a+"4");
				 a +="4";
			 }
			 if (event.getSource() == botao5){
				 caixatextosenha.setText(a+"5");
				 a +="5";
			 }
			 if (event.getSource() == botao6){
				 caixatextosenha.setText(a+"6");
				 a +="6";
			 }
			 if (event.getSource() == botao7){
				 caixatextosenha.setText(a+"7");
				 a +="7";
			 }
			 if (event.getSource() == botao8){
				 caixatextosenha.setText(a+"8");
			 }
			 if (event.getSource() == botao9){
				 caixatextosenha.setText(a+"9");
				 a +="9";
			 }
			 if (event.getSource() == botao10){
				 caixatextosenha.setText(a+"0");
				 a +="0";
			 }
			 
}
			 } 

}
