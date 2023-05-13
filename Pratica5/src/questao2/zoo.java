package questao2;

public class zoo {

    public static void main(String[] args) {
        Peixe peixeUm = new Peixe();
        Peixe peixeDois = new Peixe();

        peixeUm.setNome("Marcelo");
        peixeDois.setNome("Ronaldo");
        peixeUm.setPeso(6.4);
        peixeDois.setPeso(2.4);
        peixeUm.setTipoHabitat("Aquario");
        peixeDois.setTipoHabitat("Aquario");

        Cachorro cachorroUm = new Cachorro();
        Cachorro cachorroDois = new Cachorro();

        cachorroUm.setNome("Batistuta");
        cachorroDois.setNome("Özil");
        cachorroUm.setPeso(12.4);
        cachorroDois.setPeso(26.0);
        cachorroUm.setRaca("Pit-bull");
        cachorroDois.setRaca("Pastor Alemão");

        System.out.println(peixeUm.Imprimir());
        System.out.println(peixeDois.Imprimir());
        System.out.println(cachorroUm.Imprimir());
        System.out.println(cachorroDois.Imprimir());
    }
}
