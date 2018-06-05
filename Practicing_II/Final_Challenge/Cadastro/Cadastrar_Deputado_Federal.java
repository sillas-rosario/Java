package Cadastro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Candidato.Deputado_Federal;

public class Cadastrar_Deputado_Federal extends JDialog{

	JTextField nome,partido,numero;
	JButton botao1,botao2;
	JLabel nom,part,num;
	 
	
	public Cadastrar_Deputado_Federal(){
	
		Manipulador objetolistener = new Manipulador();
		
		nome= new JTextField("");
		partido=new JTextField("");
		numero=new JTextField("");
		
		nome.setBounds(120,10,200,30);
		add(nome);
		
		partido.setBounds(120,50,200,30);
		add(partido);
		
		numero.setBounds(120,90,200,30);
		add(numero);
		
		botao1= new JButton();
	    botao1.setText(" Cadastrar ");
		botao1.addActionListener(objetolistener);
		botao1.setBounds(10,210,150,30);
		add(botao1);
		
		botao2= new JButton();
	    botao2.setText(" Sair");
		botao2.addActionListener(objetolistener);
		botao2.setBounds(170,210,150,50);
		add(botao2);
		
		nom = new JLabel("Nome:");
		part = new JLabel("Partido:");
		num = new JLabel("Numero:");
		
		nom.setBounds(10,10,80,30); 
		part.setBounds(10, 50,80,30);
		num.setBounds(10,90,80,30);
		
		add(nom);
		add(part);
		add(num);
		
		setLayout(null);
		setModal(true);
		setSize(600, 300);
		setVisible(false);
	}
		

		class Manipulador implements ActionListener
		{
				public void actionPerformed(ActionEvent event)
				{
					if (event.getSource() == botao1)
					{
						String nome1 = nome.getText();
						String partido1 = partido.getText();
						String numero1 = numero.getText();
						int nu = Integer.parseInt(numero1);
						
						Deputado_Federal aux = new Deputad
								o_Federal(nome1,partido1,0,nu);
						Tela_Principal.lista.add(aux);
						JOptionPane.showMessageDialog(null, "Candidato Cadastrado com Sucesso!");
						nome.setText("");
						partido.setText("");
						numero.setText("");
						setVisible(false);
					}
					if (event.getSource() == botao2)
					{
						setVisible(false);
					}
				}

		
		}

}
