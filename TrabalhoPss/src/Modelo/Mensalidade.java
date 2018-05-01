/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leo
 */
public class Mensalidade {
    private List <Aluno> alunos;
    private int codigo;
    private float valorMensal;
    private boolean indPagamento;

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(float valorMensal) {
        this.valorMensal = valorMensal;
    }

    public boolean isIndPagamento() {
        return indPagamento;
    }

    public void setIndPagamento(boolean indPagamento) {
        this.indPagamento = indPagamento;
    }
    
    public void relacionaAlunoMensalidade(Aluno a){
        if(this.alunos == null){
            this.alunos = new ArrayList<>();
        }
        this.alunos.add(a);
    }
    
    public void cadastrarMensalidade(){
        Mensalidade mensalidade = new Mensalidade();
    }

    public void quitarMensalidade(Mensalidade mensalidade) {
        mensalidade.setIndPagamento(true);
    }
}
