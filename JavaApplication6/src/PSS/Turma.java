/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Turma {
    private List <Aluno> alunos;
    private Instrutor instrutor;

    public List<Aluno> getAlunos() {
        return alunos;
    }

    
    public void alocarAluno(Aluno a){
        if(this.alunos == null){
            this.alunos = new ArrayList<>();
        }
        this.alunos.add(a);
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
    
    
}
