package exercicioInterface;

public class Lutador {
	// atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;

	// métodos especiais

	public Lutador(String n, String naci, int idade, float a, float p, int v, int d, int e) {

		this.nome = n;// ou this.setNome(n);
		this.nacionalidade = naci;// ou this.setNacionalidade(naci);
		this.idade = idade;//ou this.setIdade(idade);
		this.altura = a;//ou this.setAltura(a);
		this.setPeso(p);//ou this.peso = p;
		this.vitorias = v;//ou this.setVitorias(v);
		this.derrotas = d;//ou this.setDerrotas(d);
		this.empates = e;//ou this.setEmpates(e);
	}

	// métodos especiais: acessores getters

	public String getNome() {
		return this.nome;
	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public int getIdade() {
		return this.idade;
	}

	public float getAltura() {
		return this.altura;
	}

	public float getPeso() {
		return this.peso;
	}

	private String getCategoria() {
		return this.categoria;
	}

	public int getVitorias() {
		return this.vitorias;
	}

	public int getDerrotas() {
		return this.derrotas;
	}

	public int getEmpates() {
		return this.empates;
	}

	// Método modificadores setters

	public void setNome(String n) {
		this.nome = n;
	}

	public void setNacionalidade(String naci) {
		this.nacionalidade = naci;
	}

	public void setIdade(int idade) {
		this.idade = idade;

	}

	public void setAltura(float a) {
		this.altura = a;
	}

	public void setPeso(float p) {
		this.peso = p;
		this.setCategoria();
	}

	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inválido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		} else if (this.peso <= 120) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "inválido";
		}

	}

	
	public void setVitorias(int v) {
		this.vitorias = v;
	}

	public void setDerrotas(int d) {
		this.derrotas = d;
	}

	public void setEmpates(int e) {
		this.empates = e;
	}

	// Métodos

	public void apresentar() {
		
		System.out.println("---------------------Apresentação----------------------");
		System.out.println("Chegou a Hora! Apresentamos o Lutador: " + this.getNome());
		System.out.println("Diretamente do " + this.getNacionalidade());
		System.out.println(this.getIdade() + " anos");
		System.out.println("com " + this.getAltura() + " m de altura");
		System.out.println("Pesando " + this.getPeso() + " kg");
		System.out.println("Venceu " + this.getVitorias() + " luta(s)");
		System.out.println("com " + this.getDerrotas() + " Derrota(s) e ");
		System.out.println( + this.getEmpates() + " empate(s)!");
		System.out.println("");
	}

	public void status() {
		System.out.println("-----------------------Card lutador--------------------");
		System.out.println(this.getNome());
		System.out.println("é um peso " + this.getCategoria());
		System.out.println(this.getVitorias() + " vitória(s)");
		System.out.println(this.getDerrotas() + " derrota(s)");
		System.out.println(this.getEmpates() + " empate(s)");

	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);

	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);

	}

}
