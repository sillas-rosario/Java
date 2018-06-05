package Exer5;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Area extends JApplet
{
	static ArrayList<Figura> listafigura = new ArrayList <Figura>();
	JButton button_quad, button_tri, button_circ, button_list;
	JLabel campoA, campoB;
	
	public void init() {
		
		Container tela = getContentPane();
		tela.setLayout(new FlowLayout());
		Manipulador objetolistener = new Manipulador();
		setSize(150, 150);
		tela.setVisible(true);
		campoA = new JLabel("Forma para calcular a área: ");
		tela.add(campoA);
		button_quad = new JButton();
		button_quad.setText("Quadrado");
		button_quad.addActionListener(objetolistener);
		tela.add(button_quad);
		button_tri = new JButton();
		button_tri.setText("Triângulo");
		button_tri.addActionListener(objetolistener);
		tela.add(button_tri);
		button_circ = new JButton();
		button_circ.setText("Círculo");
		button_circ.addActionListener(objetolistener);
		tela.add(button_circ);
		button_list = new JButton();
		button_list.setText("Maior Area");
		button_list.addActionListener(objetolistener);
		tela.add(button_list);
			
	}
	
	public class Manipulador implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == button_quad){
				String saida="";
				Quadrado quadrado = new Quadrado();
				String entrada;
				entrada = JOptionPane.showInputDialog("Cor do quadrado:"); 
				quadrado.cor = entrada;
				entrada = JOptionPane.showInputDialog("Valor do quadrado:");
				quadrado.lado = Integer.parseInt(entrada);
				listafigura.add(quadrado);
				saida = "Area do quadrado: " + quadrado.setArea() + " m².";
				JOptionPane.showMessageDialog(null, saida);
			}
			else if (event.getSource() == button_tri){
				String saida="";
				Triangulo triangulo = new Triangulo();
				String entrada;
				entrada = JOptionPane.showInputDialog("Cor do Triangulo:"); 
				triangulo.cor = entrada;
				entrada = JOptionPane.showInputDialog("Valor da base do triangulo:");
				triangulo.base = Integer.parseInt(entrada);
				entrada = JOptionPane.showInputDialog("Valor da altura: ");
				triangulo.altura = Integer.parseInt(entrada);
				listafigura.add(triangulo);			
				saida = "Area do triangulo:" + triangulo.setArea() + " m².";
				JOptionPane.showMessageDialog(null, saida);
			}
			else if (event.getSource() == button_circ){
				String saida="";
				Circulo circulo = new Circulo();
				String entrada;
				entrada = JOptionPane.showInputDialog("Cor do circulo: "); 
				circulo.cor = entrada;
				entrada = JOptionPane.showInputDialog("Raio do círculo:");
				circulo.raio = Integer.parseInt(entrada);
				listafigura.add(circulo);
				saida = "Area do circulo: " + circulo.setArea() + " m².";
				JOptionPane.showMessageDialog(null, saida);
			}
			else if (event.getSource() == button_list){
				String saida="";
				double area = listafigura.get(0).setArea();
				for(Figura i:listafigura){
					if(area<i.setArea()){
						area = i.setArea();
					}
				saida = "Figura de maior área:" + area + " m².";
				}
				JOptionPane.showMessageDialog(null, saida);
				
			}
		}
}
}

