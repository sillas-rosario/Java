package questao01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import questao01.TelaCarro.click;

public class TelaCaminhao extends JDialog {

	JButton Bconfirma, Bsair;
    JTextField Tcor, Tplaca,Tchassi,Tcarga;
    String cor="",placa="",confirma="";
    int eixo= 0; double carga;
    TelaPrincipal p;
    


	public  TelaCaminhao(TelaPrincipal p){
		
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
		Tchassi.setText(" Informe o n de eixo: ");
		Tchassi.setBounds(10,150,250,50);
		Tchassi.addActionListener(x);
		add(Tchassi);
		
		Tcarga=new JTextField();
		Tcarga.setText("informe a carga");
		Tcarga.setBounds(10,220,250,50);
		Tcarga.addActionListener(x);
		add(Tcarga);
		
		Bconfirma =new JButton();
		Bconfirma.setText("Confirma");
		Bconfirma.setBounds(10,290,110,30);
		Bconfirma.addActionListener(x);
		add(Bconfirma);
		
		
		Bsair =new JButton();
		Bsair.setText("sair");
		Bsair.setBounds(130,290,80,30);
		Bsair.addActionListener(x);
		add(Bsair);

		
		setSize(500,400);
		setVisible(true);
			
		
	}
	
	public class click implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource()==Bconfirma){
				
				cor= Tcor.getText();
				placa=Tplaca.getText();
				eixo=Integer.parseInt(Tchassi.getText());
				carga=Double.parseDouble(Tcarga.getText());
				
				Caminhao cadastrar=new Caminhao(cor,placa,eixo,carga);
				p.BancoDados(cadastrar,2);
			    JOptionPane.showMessageDialog(null," Caminhao Cadastrado com sucesso");
			
	            p.showtelaprincipal();
			
				
			}
			if(event.getSource()==Bsair){
				
				p.showtelaprincipal();
			}
		}
	}
	
	
}
