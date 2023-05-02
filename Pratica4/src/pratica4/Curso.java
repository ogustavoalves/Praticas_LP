/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gusta
 */
public class Curso {
    private int numero;
    private String nome;
    private ArrayList<Disciplina> listaDisciplina = new ArrayList<Disciplina>();
    
    public Curso(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }
    
    //getters & setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //retornará os ENDEREÇOS de memória dos objetos Disciplina.
    public List getListaDisciplina() {
        return listaDisciplina;
    }

    public void setListaDisciplina(Disciplina disciplina) {
        listaDisciplina.add(disciplina);
    }
    
    
    
    public void imprimir() {
        System.out.println(numero);
        System.out.println(numero);
        System.out.println(numero);
    }
    
    public void DisciplinaCargaMaior() {
        int maiorCarga = 0;
        
        for(int i = 0; i < listaDisciplina.size(); i++) {
            if (listaDisciplina.get(i).getCargaHoraria() > maiorCarga) {
                maiorCarga = listaDisciplina.get(i).getCargaHoraria();
            }
        }
        
        System.out.println("Maior Carga Horária: " + maiorCarga);
    }
    
    public int calcularTotalHora() {
        int total = 0;
        
        for(int i = 0; i < listaDisciplina.size(); i++) {
            total += listaDisciplina.get(i).getCargaHoraria();
        }
        
        return total;
    }
}
