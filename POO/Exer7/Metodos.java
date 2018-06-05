package Exer7;

import javax.swing.JOptionPane;

public class Metodos {
	String maiores ="";
	static String vetormaiores[] = new String[20];
	static double renda = 0;
	static int i=0;
	
	public static boolean cadastrarFunc() {
		String ent = JOptionPane.showInputDialog("Nome:");
		String ent2 = JOptionPane.showInputDialog("Salário:");
		String ent3 = JOptionPane.showInputDialog("Valores de encargos:");
		
		double sala = Double.parseDouble(ent2);
		double encar = Double.parseDouble(ent3);
		
		Funcionario func = new Funcionario(sala, ent, encar);
		func.setEncargos(encar);
		func.setNome(ent);
		func.setSalario(sala);
		
		renda = func.salarioLiquido();
		vetormaiores[i]= "Nome: "+ent + "\n Renda: "+ renda;
		i++;
		return true;
	}
	
	public static boolean cadastrarProf() {
		String ent = JOptionPane.showInputDialog("Nome");
		String ent2 = JOptionPane.showInputDialog(" Numero de horas trabalhadas:");
		String ent3 = JOptionPane.showInputDialog("Valor dos encargos:");
		String ent4 = JOptionPane.showInputDialog("Valor da hora:");
		
		int numh = Integer.parseInt(ent2);
		double encar = Double.parseDouble(ent3);
		double valho = Double.parseDouble(ent4);
		
		
		Professor prof = new Professor(valho, numh, ent, encar);
		prof.setEncargos(encar);
		prof.setNome(ent);
		prof.setNumHora(numh);
		prof.setValorHora(valho);
		renda = prof.salarioLiquido();
		vetormaiores[i]= "\nNome:\n "+ent + "\n Renda:\n "+ renda;
		i++;
		return true;
		
	}
	
	public static void exibeTela(double info) {
	
		String saidatudo="";
		for (int i = 0; i < vetormaiores.length; i++) {
		
		if (vetormaiores[i]==null) {
			break;
		}
		else 
			saidatudo += vetormaiores[i]+ "\n\n";
		}
		JOptionPane.showMessageDialog(null,saidatudo);
	}

}
