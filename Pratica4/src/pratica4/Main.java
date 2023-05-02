/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica4;

/**
 *
 * @author gusta
 */
public class Main {
    public static void main(String[] args) {
        Disciplina Matematica = new Disciplina(1, 90);
        Disciplina Geografia = new Disciplina(2, 60);
        Disciplina Espanhol = new Disciplina(3, 75);
        Disciplina Algoritmo = new Disciplina(4, 100);
        
        Matematica.imprimir();
        System.out.println();
        Geografia.imprimir();
        System.out.println();
        Espanhol.imprimir();
        System.out.println();
        Algoritmo.imprimir();
        
        Curso Artes = new Curso(1, "Artes");
        Artes.setListaDisciplina(Matematica);
        Artes.setListaDisciplina(Geografia);
        Artes.setListaDisciplina(Espanhol);
        Artes.setListaDisciplina(Algoritmo);
        
        System.out.println("Total Hora:" + Artes.calcularTotalHora());
        Artes.DisciplinaCargaMaior();
    }
}
