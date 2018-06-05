package questao01;

import javax.swing.*;


import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaPrincipal extends JFrame{
	
	JButton Bcarro,Bmoto,Bcaminhao,Bsair ,Bexibir;
	JTextField Bcaixatexto,placa;
	
	ArrayList<Veiculo> VarrayCarro=new ArrayList<Veiculo>();
	 
	//oBJETOS
	;
	TelaCaminhao telacaminhao=new TelaCaminhao(this);
	TelaMoto telamoto=new TelaMoto();
	TelaCarro telacarro=new TelaCarro(this);

	
	public TelaPrincipal(){
		
		getContentPane().setLayout(null);
		click x = new click();
		
		Bcarro = new JButton();
		Bcarro.setText(" Carro ");
		Bcarro.setBounds(10, 70,100, 50);
		Bcarro.addActionListener(x);
		add(Bcarro);
		
		Bmoto=new JButton();
		Bmoto.setText(" Moto ");
		Bmoto.setBounds(10, 130, 100, 50);
		Bmoto.addActionListener(x);
		add(Bmoto);
		
		
		Bcaminhao=new JButton();
		Bcaminhao.setText("Caminhao");
		Bcaminhao.setBounds(10, 190, 100, 50);
		Bcaminhao.addActionListener(x);
		add(Bcaminhao);
		
		Bcaixatexto=new JTextField();
		Bcaixatexto.setText("     Escolha  uma  das  Opçao   ");
		Bcaixatexto.setBounds(10, 10, 300, 50);
		Bcaixatexto.addActionListener(x);
		add(Bcaixatexto);
		
		Bsair=new JButton();
		Bsair.setText(" sair");
		Bsair.setBounds(200, 150, 100, 50);
		Bsair.addActionListener(x);
		add(Bsair);
		
		
		Bexibir=new JButton();
		Bexibir.setText("Exibir");
		Bexibir.setBounds(150, 70, 100, 50);
		Bexibir.addActionListener(x);
		add(Bexibir);
		

		setSize(400,300);
		setVisible(true);
		
	}
	
	public void main(String []  args){
		new TelaPrincipal();
	}
	
	public void BancoDados( Veiculo veiculo, int a){
		
		if(a==1){
		VarrayCarro.add(veiculo);
		}
	}

	
	// codigo para ordenar sobreposiçao de tela
	
	public void Showcarro(){
		telacarro.setVisible(true);
		telacaminhao.setVisible(false);
	}
	
	public void showtelaprincipal(){
		telacarro.setVisible(false);
		telacaminhao.setVisible(false);

	}
	
	public void showtelacaminhao(){
		telacarro.setVisible(false);
		telacaminhao.setVisible(true);
	}
	
	public class click implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource()==Bcarro){
                 Showcarro();
			
			}
			if(event.getSource()==Bcaminhao){
				showtelacaminhao();
			}
		}
		}


}
