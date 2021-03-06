package aula03.as3b.exercicio02;

public class Contato {
	private String nome;
	private int idade;
	private float altura;
	private int posicao;
	
	public Contato() {}
	
	public Contato(String nome,int idade, float altura) {
		setAltura(altura);
		setIdade(idade);
		setNome(nome);
	}

	public String getNome() {
		return nome; 
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}  
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append(this.getNome() + "\n");
		sb.append(this.getIdade() + "\n");
		sb.append(this.getAltura());
		return sb.toString();
		
	}


	public int getPosicao() {
		return posicao;
	}


	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
}
