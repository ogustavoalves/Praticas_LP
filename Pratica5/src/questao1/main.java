package questao1;

public class main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario(2000, "Joao", "4534678");

        System.out.println(func1.getSalario());
        func1.aumentar_Salario(0.5);
        System.out.println(func1.getSalario());

        System.out.printf(func1.toString());
    }
}
