
public class Gerente extends Funcionario{

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}

	public boolean autentica(String login, int senha) {	// sobrecarga do método autentica, mas com dois parâmetros
		if (login == super.getNome() && senha == this.senha) {
			return true;
		}
		return false;
	}
	
	public double getBonificacao() {
		// return this.salario;	// this implica visualmente que o atributo está declarado nesta classe
		return super.getBonificacao() + super.getSalario();	// neste caso usamos super, pois o atributo está declarado na classe pai
	}
	
	
}
