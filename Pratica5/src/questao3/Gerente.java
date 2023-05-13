package questao3;

public class Gerente extends Funcionario {
    private int senha;

    public Gerente(String nome, int cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }
    public boolean Autentica(int senha) {
        if (senha == this.senha) {
            return true;
        } else { return false; }

    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
