package Exer8;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Venda extends Produto{
	
	static ArrayList<Produto> listaproduto = new ArrayList <Produto>();
	
public void Cadastrar() {
		String entrada;
		Produto produto = new Produto();
		double valor;
		entrada = JOptionPane.showInputDialog(null, "Nome do produto:");
		produto.nome = entrada;
		entrada = JOptionPane.showInputDialog(null, "Valor do Produto:");
		valor = Double.parseDouble(entrada);
		produto.preco = valor;
		listaproduto.add(produto);
	}

public void Remover() {
	String entrada;
	entrada = JOptionPane.showInputDialog(null, "Nome do Produto:");
	for(Produto i:listaproduto){
		if(i.nome.equals(entrada)){
			listaproduto.remove(i);
			JOptionPane.showMessageDialog(null,"Removido!");
		}
	}
}

public void exibir(){
	String saida="";
	double total=0;
	for(Produto i:listaproduto){
		total += i.preco;
		saida+= "\nNome:\n " + i.nome + " \nValor:\n " + i.preco + ".\n";
	}
	saida += "Valor total dos produtos: R$ " + total + ".";
	JOptionPane.showMessageDialog(null,saida);
	}

public void maiorpreco() {
	String saida="", nome="Vazio";
	double valor = 0;
		
	for (Produto i:listaproduto){
		if (i.preco>valor){
			valor = i.preco;
			nome = i.nome;
		}
	}
	saida = "\nProduto de maior preço: (R$)\n " + nome;
	JOptionPane.showMessageDialog(null,saida);
}

}
