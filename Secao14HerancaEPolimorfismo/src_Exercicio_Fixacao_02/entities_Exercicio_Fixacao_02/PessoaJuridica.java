package entities_Exercicio_Fixacao_02;

public class PessoaJuridica extends Pessoa{
	private Integer numeroDeEmpregados;

	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeEmpregados) {
		super(nome, rendaAnual);
		this.numeroDeEmpregados = numeroDeEmpregados;
	}

	public Integer getNumeroDeEmpregados() {
		return numeroDeEmpregados;
	}

	public void setNumeroDeEmpregados(Integer numeroDeEmpregados) {
		this.numeroDeEmpregados = numeroDeEmpregados;
	}
	
	@Override
	public Double imposto() {
		if(numeroDeEmpregados > 10) {
			return getRendaAnual() * 0.14;
		} else {
			return getRendaAnual() * 0.16;
		}
	}
}