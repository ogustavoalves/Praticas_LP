package questao3;

public class Empresa {
    public static void main(String []args) {
        Gerente gerenteUm = new Gerente("Joao", 123456789, 5000.0, 4321);
        Gerente gerenteDois = new Gerente("Maria", 123654789, 6000.0, 1221);

        System.out.println(gerenteUm.getNome());
        System.out.println(gerenteUm.getCpf());
        System.out.println(gerenteUm.getSalario());


        System.out.println(gerenteDois.getNome());
        System.out.println(gerenteDois.getCpf());
        System.out.println(gerenteDois.getSalario());

        //retornará 'false'
        System.out.println(gerenteUm.Autentica(1234));
        //retornará 'true'
        System.out.println(gerenteUm.Autentica(4321));

        //retornará 'false'
        System.out.println(gerenteDois.Autentica(1234));
        //retornará 'true'
        System.out.println(gerenteDois.Autentica(1221));
    }
}
