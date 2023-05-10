package proj_pedido;

public class Proj_Pedido {

    public static void main(String[] args) {
        Item it1, it2, it3;
        it1 = new Item (100, 3, 3);
        it2 = new Item (101, 2, 4);
        it3 = new Item (102, 1, 5);
        
        Pedido pedido1 = new Pedido(1001, "Sabrina");
        pedido1.adicionaItem(it1);
        pedido1.adicionaItem(it2);
        pedido1.adicionaItem(it3);
        
        pedido1.Imprimir();
        pedido1.RemoveItem(it2);
        pedido1.Imprimir();
    }
    
}
