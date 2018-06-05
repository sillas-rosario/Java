package Exer3;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Exercicio3 extends JFrame{
	JButton button;
	JTextField nomeveiculo =  new JTextField(),anoveiculo = new JTextField();
	JTextField nomeveiculo1 =  new JTextField(),anoveiculo1 = new JTextField();
	
	static ArrayList<Veiculo> lista = new ArrayList <Veiculo>();
	
	public Exercicio3()
	{
		Container tela = getContentPane();
		tela.setLayout(new FlowLayout());
		Manipulador objetolistener = new Manipulador();
		
		nomeveiculo = new JTextField(30);
		nomeveiculo.setText("Nome do Ve�culo:");
		tela.add(nomeveiculo);
		anoveiculo = new JTextField(15);
		anoveiculo.setText("Ano de fabrica��o: ");
		tela.add(anoveiculo);
	
		nomeveiculo1 = new JTextField(30);
		nomeveiculo1.setText("Nome do veiculo");
		tela.add(nomeveiculo1);
		anoveiculo1 = new JTextField(15);
		anoveiculo1.setText("Ano de fabrica��o");
		tela.add(anoveiculo1);
		button= new JButton();
	    button.setText("OK");
		button.addActionListener(objetolistener);
		tela.add(button);
	}
	public static void main(String args[]) 
	{
		Exercicio3 janela = new Exercicio3();
		janela.setSize(250, 250);
		janela.setVisible(true);
	}
	
	public class Manipulador implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == button){
				Veiculo veiculo = new Veiculo();
				veiculo.setNome(nomeveiculo.getText());
				veiculo.setAnofabrica��o(anoveiculo.getText());
				lista.add(veiculo);
				Veiculo veiculo2 = new Veiculo();
				veiculo2.setNome(nomeveiculo1.getText());
				veiculo2.setAnofabrica��o(anoveiculo1.getText());
				lista.add(veiculo2);
				}
				mostrardados();
			}
			}
	
	private void mostrardados() {
		String saida="";
		for(Veiculo i:lista){
			saida += "NOME: " + i.getNome() + ". ANO FABRICA��O: " + i.getAnofabrica��o() + ".\n"; 
		}
		
		JOptionPane.showMessageDialog(null, saida);			
	}
}
