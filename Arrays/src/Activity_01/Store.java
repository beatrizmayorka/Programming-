package Activity_01;

import javax.swing.JOptionPane; // Biblioteca grafica que cria telas para haver uma interacao entre o usuario e o programa.

public class Store { // Essa eh a classe que executa o programa.
	
	public static void main(String[] args) throws Exception  {
		
		String quantidadeCD = JOptionPane.showInputDialog("Digite quantos CD's deseja comprar:");
		CD arrayCD[] = new CD [Integer.parseInt(quantidadeCD)];
	
		for (int i = 0; i < arrayCD.length ; i++) { // Esse - for - eh para rodar os campos interativos o tanto de vezes que o usuario digitou no campo de CD's que ele quer comprar.  
	
		String cDNome = JOptionPane.showInputDialog("Digite o nome do CD:");
		String cDPreco = JOptionPane.showInputDialog("Digite o Preço:");
		String cDArtista = JOptionPane.showInputDialog("Digite o Artista:");
		
		// O metodo acima recolhe as informacoes fornecidas pelo usuario.
		
	
		CD c1 = new CD(cDNome, Integer.parseInt(cDPreco), cDArtista); 
	
		String vQtd = JOptionPane.showInputDialog("Digite a quantidade que deseja comprar:");
	
		double valCompra = c1.compraCD(Integer.parseInt(vQtd)); 
	
		// Por ultimo o programa mostrara o que foi comprado e o valor final da compra.
		
		System.out.println(" --> Comprado * " + vQtd + " un * do CD: * " + cDNome + " * do artista: * " + cDArtista + " * pelo valor unitario de: * R$" + cDPreco + " * ");
		System.out.println(" --> Valor final da compra: * R$" + valCompra + " * ");
		System.out.println();
	
		}
	
	}
	
}