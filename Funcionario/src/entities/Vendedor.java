package entities;

public class Vendedor extends Funcionario{
	
	private Double comissao;
	private Long numeroVendas;
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(String nome, Long cpf, Double comissao, Long numeroVendas) {
		super(nome, cpf);
		this.comissao = comissao;
		this.numeroVendas = numeroVendas;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Long getNumeroVendas() {
		return numeroVendas;
	}

	public void setNumeroVendas(Long numeroVendas) {
		this.numeroVendas = numeroVendas;
	}

	@Override
	public double calcularSalario() {
		return super.getSalarioMinimo() + (numeroVendas * comissao);
}

	@Override
	public String toString() {
		return "Vendedor: " + super.getNome() + ", Salário: R$" +  String.format("%.2f", calcularSalario());
	}
	
	
}