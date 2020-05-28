package Activity_02;

import javax.swing.JOptionPane; // Biblioteca grafica que cria telas para haver uma interacao entre o usuario e o programa.

public class Store { // Classe que executa o programa.

	public static void main(String[] args) throws Exception	{
		
		String cDNome = JOptionPane.showInputDialog("Qual eh o nome do CD?");
		String cDPreco = JOptionPane.showInputDialog("Qual eh o preco do CD?");
		String cDArtista = JOptionPane.showInputDialog("Quem eh o artista?");
		
		CD c1 = new CD(cDNome, Integer.parseInt(cDPreco), cDArtista);  
		
		String vQtd1 = JOptionPane.showInputDialog("Qual eh a quantidade que voce deseja comprar?");
	
		double valCompra = c1.compraCD(Integer.parseInt(vQtd1));
		
		System.out.println(" --> Comprado * " + vQtd1 + " un * do CD: * " + cDNome + " * do artista: * " + cDArtista + " * pelo valor unitario de: * R$" + cDPreco + " * ");
		System.out.println(" --> Valor final da compra: * R$" + valCompra + " * ");
		System.out.println();
		
		String novaCompra = JOptionPane.showInputDialog("Deseja comprar um outro CD? [Sim / Nao]");
		
		if (novaCompra.equals("Sim")) {  
			
			String quantidadeCD = JOptionPane.showInputDialog("Quantos CD's voce deseja comprar?");
			CD arrayCD[] = new CD [Integer.parseInt(quantidadeCD)];
			
			for (int i = 0; i < arrayCD.length ; i++) {
					
				String cDNome2 = JOptionPane.showInputDialog("Qual eh o nome do CD?");
				String cDPreco2 = JOptionPane.showInputDialog("Qual eh o preco do CD?");
				String cDArtista2 = JOptionPane.showInputDialog("Quem eh o artista?");
			
				CD c2 = new CD(cDNome2, Integer.parseInt(cDPreco2), cDArtista2);
			
				String vQtd2 = JOptionPane.showInputDialog("Qual eh a quantidade que voce deseja comprar?");
			
				double valCompra2 = c2.compraCD(Integer.parseInt(vQtd2));
			
				System.out.println(" --> Comprado * " + vQtd2 + " un * do CD: * " + cDNome2 + " * do artista: * " + cDArtista2 + " * pelo valor unitario de: * R$" + cDPreco2 + " * ");
				System.out.println(" --> Valor final da compra: * R$" + valCompra2 + " * ");
				System.out.println();
			
			}		
		
		} else if (novaCompra.equals("Nao")) {
			System.out.println(" :) ");	
		} else {
			System.out.println(" :( Opçao invalida :( ");
		}
		
	}
	
}