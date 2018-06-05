package Exer7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Real extends JFrame {
	
	JButton botao1; 
	JButton botao2; 
	JButton botao3; 
	
	public Real() {

		Container Tela = getContentPane();
		Tela.setLayout(new FlowLayout());
		Manipulador objetolistener = new Manipulador();
		botao1 = new JButton();
		botao1.setText("Funcionario");
		botao1.addActionListener(objetolistener);
		Tela.add(botao1);
		
		botao2 = new JButton();
		botao2.setText("Professor");
		botao2.addActionListener(objetolistener);
		Tela.add(botao2);
		
		botao3 = new JButton();
		botao3.setText("Nome e renda do empregado (a) desejado:");
		botao3.addActionListener(objetolistener);
		Tela.add(botao3);
		
	}
		
	public static void main(String[] args) {
	Real janela = new Real();
		janela.setSize(500,200);
		janela.setVisible(true);
}
	public class Manipulador implements ActionListener {
		public void actionPerformed (ActionEvent event){
		
			
				
			if (event.getSource() == botao1)
			{
				boolean saida1 = Metodos.cadastrarFunc();
				if(saida1==true)
				{
					JOptionPane.showMessageDialog(null, "Objeto cadastrado com sucesso! ");
				}
				
			}
			
			if (event.getSource() == botao2)
			{
				
				boolean saida2 = Metodos.cadastrarProf();
				if(saida2==true)
				{
					JOptionPane.showMessageDialog(null, "Objeto cadastrado com sucesso!");
				}
			
			}
			
			if (event.getSource() == botao3)
			{
			String opp = JOptionPane.showInputDialog(" Informe o valor minimo da renda dos funcionarios a serem mostrados: ");
			double informado = Double.parseDouble(opp);
			Metodos.exibeTela(informado);
			}
		
		
		}}


}
