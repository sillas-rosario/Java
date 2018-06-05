package Exer2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Exercicio2 extends JApplet {
	
	JButton button;
	JTextField caixatexto_altura, caixatexto_largura;

	public void init ()
	{
		Container tela = getContentPane();
		tela.setLayout(new FlowLayout());
		Manipulador objetolistener = new Manipulador();
		tela.setSize(600, 80);
		tela.setVisible(true);
		
		caixatexto_altura = new JTextField(20);
		tela.add(caixatexto_altura);
		caixatexto_largura = new JTextField(20);
		caixatexto_largura.setText("Digite a Largura:");
		tela.add(caixatexto_largura);
		button = new JButton();
		button.setText("Calcular");
		button.addActionListener((ActionListener) objetolistener);
		tela.add(button);
	
	}
	
	public class Manipulador implements ActionListener
	{
		public void actionPerformed(ActionEvent event) 
		{
			if (event.getSource() == button)
			{
				double altura, largura, area;
				fig Retangulo = new fig();
				altura = Integer.parseInt(caixatexto_altura.getText());
				Retangulo.setAltura(altura);
				largura = Integer.parseInt(caixatexto_largura.getText());
				Retangulo.setLargura(largura);
				area = Retangulo.getArea();
				JOptionPane.showMessageDialog(null, "A área é: " + area);
			}
}
	}
	
}
