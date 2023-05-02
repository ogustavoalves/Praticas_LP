package pratica4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusta
 */
public class Disciplina {
    private int codigo;
    private Integer cargaHoraria;
    
    public Disciplina (int codigo, Integer cargaHoraria) {
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }
    
    //getters & setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
    public void imprimir() {
        System.out.println("Código: " + codigo);
        System.out.println("Carga Horária: " + cargaHoraria);
    }
}
