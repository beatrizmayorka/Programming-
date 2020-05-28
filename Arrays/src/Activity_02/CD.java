package Activity_02;

public class CD {
	String artista;
	String nome;
	double preco;
	
	public CD(String n, int p, String a) {
		nome = n; 
		preco = p; 
		artista = a; 
	}
	
	public double compraCD(double quantidade) {
		double valCompra = (this.preco * quantidade); 
		return valCompra;
	}

}