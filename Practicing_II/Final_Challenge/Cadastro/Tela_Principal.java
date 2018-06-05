package Cadastro;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

import Cadastro.Cadastrar_Deputado_Estadual.Manipulador;
//import Votação.ExibirResultado;
//import Votação.VotarPresidente;
import Candidato.*;

public class Tela_Principal extends JFrame {
	

	public static ArrayList <Candidato> lista = new ArrayList<Candidato>();
	public JButton cadastrapre,cadastragov,cadastrasen,cadastradepfed,cadastradepest,inivotacao,exiberesult;
	Cadastrar_Deputado_Estadual cde = new Cadastrar_Deputado_Estadual();
	CadastrarPresidente cp = new CadastrarPresidente(); 
	CadastrarGovernador cg = new CadastrarGovernador();
	CadastrarSenador cs = new CadastrarSenador();
	CadastrarDeputadoFederal cdf = new CadastrarDeputadoFederal();
	
	VotarPresidente votopre = new VotarPresidente();
	ExibirResultado fim = new ExibirResultado();
	
	
	public TelaInicial(){
		 
		
		Manipulador objetolistener = new Manipulador();
		
		cadastrapre= new JButton();
	    cadastrapre.setText(" Cadastrar Presidente");
		cadastrapre.addActionListener(objetolistener);
		cadastrapre.setBounds(20,10,230,50);
		add(cadastrapre);
		
		cadastragov= new JButton();
	    cadastragov.setText(" Cadastrar Governador");
		cadastragov.addActionListener(objetolistener);
		cadastragov.setBounds(20,60,230,50);
		add(cadastragov);
		
		cadastrasen= new JButton();
	    cadastrasen.setText(" Cadastrar Senador");
		cadastrasen.addActionListener(objetolistener);
		cadastrasen.setBounds(20,110,230,50);
		add(cadastrasen);
		
		cadastradepfed= new JButton();
	    cadastradepfed.setText(" Cadastrar Deputado Federal");
		cadastradepfed.addActionListener(objetolistener);
		cadastradepfed.setBounds(20,160,230,50);
		add(cadastradepfed);
		
		cadastradepest= new JButton();
	    cadastradepest.setText(" Cadastrar Deputado Estadual");
		cadastradepest.addActionListener(objetolistener);
		cadastradepest.setBounds(20,210,230,50);
		add(cadastradepest);
		
		inivotacao= new JButton();
	    inivotacao.setText(" Iniciar a votação:");
		inivotacao.addActionListener(objetolistener);
		inivotacao.setBounds(20,260,230,50);
		add(inivotacao);
		
		exiberesult= new JButton();
	    exiberesult.setText(" Exibir o resultado.");
		exiberesult.addActionListener(objetolistener);
		exiberesult.setBounds(20,310,230,50);
		add(exiberesult);

		setLayout(null);
		setTitle("Tela Inicial");
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}	
		
		
		public class Manipulador implements ActionListener
		{
				public void actionPerformed(ActionEvent event)
				{
					
				}
	
	}


	
}
