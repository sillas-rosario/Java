package questao01;
import javax.swing.*;

import questao01.TelaPrincipal.click;


import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TelaCarro extends JDialog{
	
	JButton Bconfirma, Bsair;
    JTextField Tcor, Tplaca,Tchassi;
    String cor="",placa="",confirma="";
    Long chassi= 0L;
    TelaPrincipal p;
    


	public  TelaCarro(TelaPrincipal p){
		
		this.p=p;
	
		getContentPane().setLayout(null);
		click x = new click();
		
		Tcor=new JTextField();
		Tcor.setText(" Informe a cor  : ");
		Tcor.setBounds(10,10,250,50);
		Tcor.addActionListener(x);
		add(Tcor);
		
		Tplaca=new JTextField();
		Tplaca.setText(" Informe a placa  :");
		Tplaca.setBounds(10,80,250,50);
		Tplaca.addActionListener(x);
		add(Tplaca);
		
		Tchassi=new JTextField();
		Tchassi.setText(" Informe o chassi: ");
		Tchassi.setBounds(10,150,250,50);
		Tchassi.addActionListener(x);
		add(Tchassi);
		
		Bconfirma =new JButton();
		Bconfirma.setText("Confirma");
		Bconfirma.setBounds(10,220,110,30);
		Bconfirma.addActionListener(x);
		add(Bconfirma);
		
		
		Bsair =new JButton();
		Bsair.setText("sair");
		Bsair.setBounds(130,220,80,30);
		Bsair.addActionListener(x);
		add(Bsair);
		
		
		
		
		
		setSize(400,300);
		setVisible(true);
			
		
	}
	
	public class click implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource()==Bconfirma){
				
				cor= Tcor.getText();
				placa=Tplaca.getText();
				chassi=Long.parseLong(Tchassi.getText());
				Carro cadastrar=new Carro(cor,placa,chassi);
				p.BancoDados(cadastrar,1);
			    JOptionPane.showMessageDialog(null," Carro Cadastrado com sucesso");
			
	            p.showtelaprincipal();
			
				
			}
			if(event.getSource()==Bsair){
				
				p.showtelaprincipal();
			}
		}
	}

}
