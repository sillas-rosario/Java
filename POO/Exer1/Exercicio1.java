package Exer1;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class Exercicio1 extends JApplet {
	
	static ArrayList<Class> listameses = new ArrayList<Class>();

	
	public void init() 
	{
		int num;
		for(int i=0;i<2;i++)
		{
			cadastrodomes();
		}
		do
		{
			num = menu();
			
		}while((num!=2&&num!=1&&num!=3&&num!=4)||(num==1||num==2||num==3));
		
		System.exit(0);
	}
	
	private int menu()
	{
		int numero;
		String entrada= JOptionPane.showInputDialog(" Menu\n 1)Exibir todos os dados do mes com maior saldo.\n 2)Exibir a media dos salarios.\n 3)Exibir o nome e o saldo de todos os meses.\n 4)Sair.");
		numero=Integer.parseInt(entrada);
		
		if (numero==1)
		{
			mesmaiorsaldo();
		}
		else if(numero==2)
		{
			mediadossalarios();
		}
		else if(numero==3)
		{
			mostrarnomesaldogeral();
		}
		return numero;
	}

	private void mostrarnomesaldogeral()
	{
		String saida="";
		String nome;
		double saldo;
		
		for (Class i:listameses)
		{
				nome = i.getNome();
				saldo = i.getSaldo();
				saida += "M�s: " + nome + ". Saldo: " + saldo + ".\n";
		}
		JOptionPane.showMessageDialog(null,saida);
		
	}
	private void mediadossalarios()
	{
		String saida="";
		double media=0;
		int cont=0;
		
		for (Class i:listameses)
		{
			media += i.getSalario();
			cont++;
		}
		media = media/cont;
		saida = "M�dia dos sal�rios: " + media;
		JOptionPane.showMessageDialog(null,saida);
	}
	
	private void mesmaiorsaldo()
	{
		String saida="";
		String nome = listameses.get(0).getNome();
		double saldo = listameses.get(0).getSaldo();
		double gastos = listameses.get(0).getGastos();
		double impostos = listameses.get(0).getImpostos();
		double salario = listameses.get(0).getSalario();
		
		for (Class i:listameses)
		{
			if (i.getSaldo()>saldo)
			{
				nome = i.getNome();
				saldo = i.getSaldo();
				gastos = i.getGastos();
				impostos = i.getImpostos();
				salario = i.getSalario();
			}
		}
		saida = "Maior saldo/ M�S: \n" + nome + "\nSal�rio:\n " + salario + "\nImpostos a serem pagos:\n " + impostos + "\nGastos Totais:\n " + gastos + "\nSaldo Dispon�vel:\n " + saldo;
		JOptionPane.showMessageDialog(null,saida);
	}
		
	
	private void cadastrodomes() 
	{
		Class mes = new Class();
		double numero;
		String entrada;
		entrada = JOptionPane.showInputDialog("M�s:");
		mes.setNome(entrada);
		entrada = JOptionPane.showInputDialog("Sal�rio do m�s");
		numero = Integer.parseInt(entrada);
		mes.setSalario(numero);
		entrada = JOptionPane.showInputDialog("Gastos do m�s");
		numero = Integer.parseInt(entrada);
		mes.setGastos(numero);
		entrada = JOptionPane.showInputDialog("Impostos do m�s");
		numero = Integer.parseInt(entrada);
		mes.setImpostos(numero);
		listameses.add(mes);
		
	}
}


