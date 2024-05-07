package br.com.fiap.beans;

public class Pf extends Pessoa {

	private String cpf;
	private String rg;

	public Pf() {
		super();
	}

	public Pf(String nome, String email, double renda, String cpf, String rg) {
		super(nome, email, renda);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String identificar() {
		return "Informações da Pessoa Física";
	}

	@Override
	public String toString() {
		return identificar() + "\nCPF: " + getCpf() + "\nRG: " + getRg() +
				"\nNome: " + getNome() + "\nEmail: " + getEmail() + "\nRenda: R$"
				+ getRenda();
	}

	
	
}
