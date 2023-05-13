package questao1;

public class Funcionario extends Pessoa {
    private double salario;



    public Funcionario(double salario, String nome, String RG) {
        super(nome, RG);
        //super.nome = nome;
        //super.RG = RG;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }



    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentar_Salario(double percentual) {
        salario = salario + (salario * percentual);
        return salario;
    }

    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                ", nome=" + nome +
                ", RG=" + RG +
                '}';
    }
}
