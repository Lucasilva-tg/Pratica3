package atividade1;
import javax.swing.JOptionPane;
import atividade1.validaCPF;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String cpf, nome;
		
		nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		cpf = JOptionPane.showInputDialog("Digite o seu cpf: ");
		
        if (validaCPF.isCPF(cpf) == true)
        	JOptionPane.showMessageDialog(null, "CPF Válido: " + validaCPF.imprimeCPF(cpf));
        else
        	JOptionPane.showMessageDialog(null, "CPF inválido");
	}

}
