package entities_Exercicio_Fixacao_02;

public class PessoaFisica extends Pessoa{
	private Double gastosComSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}
	
	@Override
	public final Double imposto() {
		if(getRendaAnual() < 20000.00) {
			return super.getRendaAnual() * 0.15 - gastosComSaude * 0.5;
		} else {
			return super.getRendaAnual() * 0.25 - gastosComSaude * 0.5;
		}
	}
}
