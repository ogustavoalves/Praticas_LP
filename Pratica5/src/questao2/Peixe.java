package questao2;

public class Peixe extends Animal {
    private String tipoHabitat;

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    public String Imprimir() {
        return "Peixe{" +
                "tipoHabitat='" + tipoHabitat + '\'' +
                ", nome='" + nome + '\'' +
                ", peso=" + peso +
                '}';
    }
}
