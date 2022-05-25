package entities;

public class Consultor extends Funcionario{

	private Double valorHora;
	private Long horasTrabalhadas;
	
	public Consultor() {
		super();
	}
	
	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Long getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Long horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Consultor(String nome, Long cpf, Double valorHora, Long horasTrabalhadas) {
		super(nome, cpf);
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public double calcularSalario() {
		return valorHora * horasTrabalhadas;		
	}

	@Override
	public String toString() {
		return "Consultor: " + super.getNome() + ", Salario: R$" + String.format("%.2f", calcularSalario());
	}

	
}
