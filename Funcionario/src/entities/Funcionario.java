package entities;

public abstract class Funcionario {
	
	private String nome;
	private Long cpf;
	private static final Double SALARIO_MINIMO = 1212.0;
	
	public Funcionario() {
	}
	
	public Funcionario(String nome, Long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public static Double getSalarioMinimo() {
		return SALARIO_MINIMO;
	}

	public abstract double calcularSalario();

	@Override
	public String toString() {
		return "Nome: " + nome + ", CPF: " + cpf;
	}
	

}
