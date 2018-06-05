package Cadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Candidato.Deputado_Estadual;

public class Cadastrar_Deputado_Estadual extends JDialog {

	JTextField nome,partido,numero;
	JButton cadastrar,sair;
	JLabel name,part,number;
	
	
	public Cadastrar_Deputado_Estadual(){ 

		Manipulador objetolistener = new Manipulador();
		Container exibir= getContentPane();
		
		
// Configurar o texto
		nome= new JTextField(" ");
		partido=new JTextField(" ");
		numero=new JTextField(" ");
		
// configurar botao de cadastro:
		
		cadastrar= new JButton();
	    cadastrar.setText(" Cadastrar ");
		cadastrar.addActionListener(objetolistener);
		cadastrar.setBounds(10,210,150,30);
		exibir.add(cadastrar);

// Configurar o botao Sair:
		
		sair= new JButton();
	    sair.setText(" Sair");
		sair.addActionListener(objetolistener);
		sair.setBounds(170,210,150,50);
		sair.add(sair);
		
		name = new JLabel("Nome: ");
		part = new JLabel("Partido: ");
		number = new JLabel("Numero: ");
		
		name.setBounds(10,10,80,30); 
		part.setBounds(10, 50,80,30);
		number.setBounds(10,90,80,30);
		
	}
	
		class Manipulador implements ActionListener{
			
				public void actionPerformed(ActionEvent event){
					
					if (event.getSource() == cadastrar){
						
						String nome_1     =  nome.getText();
						String partido_1  =  partido.getText();
						String numero_1   =  numero.getText();
						
						
						int numero_int = Integer.parseInt(numero_1);
						Deputado_Estadual aux = new Deputado_Estadual(nome_1,partido_1,0,numero_int);
						Tela_Principal.lista.add(aux);
						JOptionPane.showMessageDialog(null, "Candidato Cadastrado com Sucesso!");
						nome.setText("");
						partido.setText("");
						numero.setText("");
						setVisible(false);
					}
					if (event.getSource() == sair)
					{
						setVisible(false);
					}
				}

		
		}

		
	}

