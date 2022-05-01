
public class Funcionario {

	private String nome;
	private String cpf;
	protected double salario;
	private final double BONIFICACAO = 0.05;
	
	
	public double getBonificacao() {
		return this.salario * BONIFICACAO;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
