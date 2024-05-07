package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Pf;
import br.com.fiap.beans.Pj;

public class Sistema {

	public static void main(String[] args) {
		
		String[] opcoes = {"Pessoa Física", "Pessoa Jurídica"};
		Object pergunta = (String)JOptionPane.showInputDialog(null, "Você é PF ou PJ?",
				"Selecione uma opção", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		
		
		if (pergunta == "Pessoa Física") {
			//String nome, String email, double renda, String cpf, String rg
			Pf objPf = new Pf(
					JOptionPane.showInputDialog("Nome PF:"),
					JOptionPane.showInputDialog("Email:"),
					Double.parseDouble(JOptionPane.showInputDialog("Renda: ")),
					JOptionPane.showInputDialog("CPF:"),
					JOptionPane.showInputDialog("RG:"));
			
			Endereco objEndereco = new Endereco(
					JOptionPane.showInputDialog("Rua: "),
					JOptionPane.showInputDialog("CEP:"),
					Integer.parseInt(JOptionPane.showInputDialog("Número"))
					);
			//Saída PF
			System.out.println(objPf);
			System.out.println(objEndereco);
			
		} else {
			//String nome, String email, double renda, String cnpj, String razaoSocial
			Pj objPj = new Pj(
					JOptionPane.showInputDialog("Nome:"),
					JOptionPane.showInputDialog("Email:"),
					Double.parseDouble(JOptionPane.showInputDialog("Receita:")),
					JOptionPane.showInputDialog("CNPJ:"),
					JOptionPane.showInputDialog("Razão Social:")
					);
			
			Endereco objEndereco = new Endereco(
					JOptionPane.showInputDialog("Rua: "),
					JOptionPane.showInputDialog("CEP:"),
					Integer.parseInt(JOptionPane.showInputDialog("Número"))
					);
			
			//Saída PF
			System.out.println(objPj);
			System.out.println(objEndereco);
		}

	}

}
