package Exer4;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Exercicio4 extends JFrame

{
	List <PlacaeCor> lista = new ArrayList<PlacaeCor>();
	Carro c= new Carro();
	Caminhao cam= new Caminhao();
	Moto m= new Moto();
	
	public JButton botao1,botao2,botao3,botao4;
	
	public Exercicio4()
	{
		
		Container tela = getContentPane(); 
		tela.setLayout(null);
		Manipulador objetolistener = new Manipulador();
		
		botao1= new JButton();
	    botao1.setText(" Cadastrar Carro");
		botao1.addActionListener(objetolistener);
		botao1.setBounds(80,10,180,50);
		tela.add(botao1);
		
		botao2= new JButton();
	    botao2.setText(" Cadastrar Caminhao");
		botao2.addActionListener(objetolistener);
		botao2.setBounds(280,10,180,50);
		tela.add(botao2);
		
		botao3= new JButton();
	    botao3.setText(" Cadastrar Moto");
		botao3.addActionListener(objetolistener);
		botao3.setBounds(480,10,180,50);
		tela.add(botao3);
		
		botao4= new JButton();
	    botao4.setText(" Listar todos veiculos");
		botao4.addActionListener(objetolistener);
		botao4.setBounds(680,10,180,50);
		tela.add(botao4);
		
		setSize(1000, 250);
		setVisible(true);
	}
	
   public static void main(String[] args) {

		Exercicio4 tela = new Exercicio4();
		
}
	class Manipulador implements ActionListener
	{
			public void actionPerformed(ActionEvent event)
			{
				String saida="";
				
				if (event.getSource() == botao1)
				{
					cadastrarCarro();
				}
				if (event.getSource() == botao2)
				{
					cadastrarCaminhao();
				}
				if (event.getSource() == botao3)
				{
					cadastrarMoto();
				}
				if (event.getSource() == botao4)
				{
					for(PlacaeCor a:lista)
					{
						saida += a.todososDados()+ "\n";
					}
					JOptionPane.showMessageDialog(null, saida);
					System.exit(0);
				}
			}
	
	public void cadastrarCarro()
	{
		String placa= JOptionPane.showInputDialog(" Favor digitar a placa do carro:");
		c.setPlaca(placa);
		String cor= JOptionPane.showInputDialog(" Favor digitar a cor do carro:");
		c.setCor(cor);
		String chassi= JOptionPane.showInputDialog(" Favor digitar o numero do chassi do carro:");
		long chassicarro= Long.parseLong(chassi);
		c.setChassi(chassicarro);
		lista.add(c);
		
	}
	
	public void cadastrarCaminhao()
	{
		String placa= JOptionPane.showInputDialog(" Favor digitar a placa do caminhao:");
		cam.setPlaca(placa);
		String cor= JOptionPane.showInputDialog(" Favor digitar a cor do carro:");
		cam.setCor(cor);
		String num_eixos= JOptionPane.showInputDialog(" Favor digitar o numero de eixos:");
		int numero= Integer.parseInt(num_eixos);
		cam.setNum_eixos(numero);
		String carga= JOptionPane.showInputDialog(" Favor digitar quantos quilos de carga tem no caminhao:");
		double carg= Double.parseDouble(carga);
		cam.setCarga(carg);
		lista.add(cam);
	}
	
	public void cadastrarMoto()
	{
		String placa= JOptionPane.showInputDialog(" Favor digitar a placa da moto:");
		m.setPlaca(placa);
		String cor= JOptionPane.showInputDialog(" Favor digitar a cor da moto:");
		m.setCor(cor);
		String cilindradas= JOptionPane.showInputDialog(" Favor digitar de quantas cilindradas é a moto:");
		int cili= Integer.parseInt(cilindradas);
		m.setCilindradas(cili);
		lista.add(m);
	}
	
	
	}
		
}
