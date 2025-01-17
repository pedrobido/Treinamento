package exec12;

public class Filme {

	private int codigo;
	private String nome;
	private String genero;
	private double valor;

	public Filme() {

	}

	public Filme(int codigo, String nome, String genero, double valor) {
		this.codigo = codigo;
		this.nome = nome;
		this.genero = genero;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String toString() {
		String texto = "Dados do Filme\n";
		texto += "C�digo....:" + this.getCodigo() + "\n";
		texto += "Nome......:" + this.getNome() + "\n";
//		texto += "G�nero....:" + this.getGenero() + "\n";
//		texto += "Valor.....:" + this.getValor() + "\n";
		return texto;
	}

	public boolean equals(Object objeto) {
		if (nome.equals(((Filme) objeto).getNome())) {
			return true;
		}
		return false;
	}

}
