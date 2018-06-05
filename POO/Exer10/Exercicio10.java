package Exer10;



import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




public class Exercicio10 extends JFrame
{
	
	public JButton botao1,botao2,botao3,botao4,botao5,botao6,botao7,botao8,botao9,botaolimpar;
	int jogador=1;
	int cont=0;

	public Exercicio10()
	{
		
		Container tela = getContentPane(); 
		tela.setLayout(null);
		Manipulador objetolistener = new Manipulador();
		
		botao1= new JButton();
	    //botao1.setText("OK");
		botao1.addActionListener(objetolistener);
		botao1.setBounds(10,10,50,50);
		tela.add(botao1);
		
		botao2= new JButton();
	    //botao2.setText("OK");
		botao2.addActionListener(objetolistener);
		botao2.setBounds(65,10,50,50);
		tela.add(botao2);
	
		botao3= new JButton();
	    //botao3.setText("OK");
		botao3.addActionListener(objetolistener);
		botao3.setBounds(120,10,50,50);
		tela.add(botao3);
		
		botao4= new JButton();
	    //botao4.setText("OK");
		botao4.addActionListener(objetolistener);
		botao4.setBounds(10,65,50,50);
		tela.add(botao4);
		
		botao5= new JButton();
	    //botao5.setText("OK");
		botao5.addActionListener(objetolistener);
		botao5.setBounds(65,65,50,50);
		tela.add(botao5);
		
		botao6= new JButton();
	    //botao6.setText("OK");
		botao6.addActionListener(objetolistener);
		botao6.setBounds(120,65,50,50);
		tela.add(botao6);
		
		botao7= new JButton();
	    //botao7.setText("OK");
		botao7.addActionListener(objetolistener);
		botao7.setBounds(10,120,50,50);
		tela.add(botao7);
		
		botao8= new JButton();
	    //botao8.setText("OK");
		botao8.addActionListener(objetolistener);
		botao8.setBounds(65,120,50,50);
		tela.add(botao8);
		
		botao9= new JButton();
	    //botao9.setText("OK");
		botao9.addActionListener(objetolistener);
		botao9.setBounds(120,120,50,50);
		tela.add(botao9);
		
		botaolimpar= new JButton();
	    botaolimpar.setText("LIMPAR");
		botaolimpar.addActionListener(objetolistener);
		botaolimpar.setBounds(40,175,100,50);
		tela.add(botaolimpar);
	
	}
	
	public static void main(String args[]) 
	{
		Exercicio10 janela = new Exercicio10();
		janela.setSize(200, 275);
		janela.setVisible(true);

	}
	
class Manipulador implements ActionListener
{
		public void actionPerformed(ActionEvent event)
		{
		
			if (event.getSource() == botao1)
			{
				if(jogador%2!=0){
					botao1.setText("X");
			}
			else
			{
					botao1.setText("0");
			}
			jogador++;
			}

			if (event.getSource() == botao2)
			{
				if(jogador%2!=0)
				{
					botao2.setText("X");
				}
			
			else 
			{
					botao2.setText("0");
			}
			jogador++;
			}
			
			if (event.getSource() == botao3)
			{
				if(jogador%2!=0)
				{
					botao3.setText("X");
				}
			
			else 
			{
					botao3.setText("0");
			}
			jogador++;
			}
			
			if (event.getSource() == botao4)
			{
				if(jogador%2!=0)
				{
					botao4.setText("X");
				}
			
			else 
			{
					botao4.setText("0");
			}
			jogador++;
			}
			
			if (event.getSource() == botao5)
			{
				if(jogador%2!=0)
				{
					botao5.setText("X");
				}
			
			else 
			{
					botao5.setText("0");
			}
			jogador++;
			}
			
			if (event.getSource() == botao6)
			{
				if(jogador%2!=0)
				{
					botao6.setText("X");
				}
			
			else 
			{
					botao6.setText("0");
			}
			jogador++;
			}
			
			if (event.getSource() == botao7)
			{
				if(jogador%2!=0)
				{
					botao7.setText("X");
				}
			
			else
			{
					botao7.setText("0");
			}
			jogador++;
			}
			
			if (event.getSource() == botao8)
			{
				if(jogador%2!=0)
				{
					botao8.setText("X");
				}
			
			else 
			{
					botao8.setText("0");
			}
			jogador++;
			}
			
			if (event.getSource() == botao9)
			{
				if(jogador%2!=0)
				{
					botao9.setText("X");
				}
			
			else 
			{
					botao9.setText("0");
			}
			jogador++;
			}
			
			if(event.getSource() == botaolimpar)
			{
				botao1.setText("");
				botao2.setText("");
				botao3.setText("");
				botao4.setText("");
				botao5.setText("");
				botao6.setText("");
				botao7.setText("");
				botao8.setText("");
				botao9.setText("");
				jogador=1;
			}
			
		
				if(botao1.getText()==botao5.getText()&&botao1.getText()==botao9.getText()&&botao9.getText()=="X")
				{
					JOptionPane.showMessageDialog(null, "Jogador 1 ganhou!");
					cont++;
				}
				if(botao1.getText()==botao5.getText()&&botao1.getText()==botao9.getText()&&botao9.getText()=="0")
				{
					JOptionPane.showMessageDialog(null, "Jogador 2 ganhou!");
					cont++;
				}
				
				if(botao1.getText()==botao4.getText()&&botao1.getText()==botao7.getText()&&botao7.getText()=="X")
				{
					JOptionPane.showMessageDialog(null, "Jogador 1 ganhou!");
					cont++;
				}
				if(botao1.getText()==botao4.getText()&&botao1.getText()==botao7.getText()&&botao7.getText()=="0")
				{
					JOptionPane.showMessageDialog(null, "Jogador 2 ganhou!");
					cont++;
				}
				
				if(botao1.getText()==botao2.getText()&&botao1.getText()==botao3.getText()&&botao3.getText()=="X")
				{
					JOptionPane.showMessageDialog(null, "Jogador 1 ganhou!");
					cont++;
				}
				if(botao1.getText()==botao2.getText()&&botao1.getText()==botao3.getText()&&botao3.getText()=="0")
				{
					JOptionPane.showMessageDialog(null, "Jogador 2 ganhou!");
					cont++;
				}
				
				if(botao2.getText()==botao5.getText()&&botao2.getText()==botao8.getText()&&botao8.getText()=="X")
				{
					JOptionPane.showMessageDialog(null, "Jogador 1 ganhou!");
					cont++;
				}
				if(botao2.getText()==botao5.getText()&&botao2.getText()==botao8.getText()&&botao8.getText()=="0")
				{
					JOptionPane.showMessageDialog(null, "Jogador 2 ganhou!");
					cont++;
				}
				
				if(botao3.getText()==botao6.getText()&&botao3.getText()==botao9.getText()&&botao9.getText()=="X")
				{
					JOptionPane.showMessageDialog(null, "Jogador 1 ganhou!");
					cont++;
				}
				if(botao3.getText()==botao6.getText()&&botao3.getText()==botao9.getText()&&botao9.getText()=="0")
				{
					JOptionPane.showMessageDialog(null, "Jogador 2 ganhou!");
					cont++;
				}
				
				if(botao4.getText()==botao5.getText()&&botao4.getText()==botao6.getText()&&botao6.getText()=="X")
				{
					JOptionPane.showMessageDialog(null, "Jogador 1 ganhou!");
					cont++;
				}
				if(botao4.getText()==botao5.getText()&&botao4.getText()==botao6.getText()&&botao6.getText()=="0")
				{
					JOptionPane.showMessageDialog(null, "Jogador 2 ganhou!");
					cont++;
				}
				
				if(botao7.getText()==botao8.getText()&&botao7.getText()==botao9.getText()&&botao9.getText()=="X")
				{
					JOptionPane.showMessageDialog(null, "Jogador 1 ganhou!");
					cont++;
				}
				if(botao7.getText()==botao8.getText()&&botao7.getText()==botao9.getText()&&botao9.getText()=="0")
				{
					JOptionPane.showMessageDialog(null, "Jogador 2 ganhou!");
					cont++;
				}
				
				if(jogador==10&&cont==0)
				{
					JOptionPane.showMessageDialog(null, "Deu velha!");
			}
		}
}
}






