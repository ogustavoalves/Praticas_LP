/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj_pedido;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author gusta
 */
public class Pedido {
    private int numero;
    private String cliente;
    private List<Item> lista;
    
    public Pedido(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        lista = new ArrayList<Item>();
    }
    
    public void adicionaItem(Item item) {
        lista.add(item);
    }
    
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < lista.size(); i++) {
            Item umItem = lista.get(i);
            total += umItem.calcularCustoItem();
            
        }
        return total;
    }
    
    public void Imprimir() {
        System.out.println("Pedido:" + numero);
        System.out.println("Cliente:" + cliente);
        
        System.out.println("Itens");
        for (int i = 0; i < lista.size(); i++) {
            Item umItem = lista.get(i);
            System.out.print("*");
            umItem.Imprime();
        }
        System.out.println("Total do pedido:" + calcularTotal());
    }
    
    public boolean RemoveItem(Item item) {
        return lista.remove(item);
        
    }
}
