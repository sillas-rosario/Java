package Exer8;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class Exercicio8 extends JApplet
{
	Venda venda = new Venda();
	JButton button1, button2, button3, button4;
	
	public void init()  {
		Container tela = getContentPane();
		tela.setLayout(new FlowLayout());
		Manipulador objetolistener = new Manipulador();
		tela.setSize(600, 80);
		tela.setVisible(true);
		button1 = new JButton();
		button1.setText("Cadastrar");
		button1.addActionListener(objetolistener);
		tela.add(button1);
		button2 = new JButton();
		button2.setText("Exibir");
		button2.addActionListener(objetolistener);
		tela.add(button2);
		button3 = new JButton();
		button3.setText("Remover");
		button3.addActionListener(objetolistener);
		tela.add(button3);
		button4 = new JButton();
		button4.setText("Maior Valor");
		button4.addActionListener(objetolistener);
		tela.add(button4);
	}
	
	public class Manipulador implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == button1){
				venda.Cadastrar();
			}				
			else if (event.getSource() == button2){
				venda.exibir();
			}
			else if (event.getSource() == button3){
				venda.Remover();
			}
			else if (event.getSource() == button4){
				venda.maiorpreco();
			}
			
		}

		
	} 

}
