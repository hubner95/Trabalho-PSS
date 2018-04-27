/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSS;

/**
 *
 * @author andre
 */
public class Funcionario extends Pessoa{
    
    public void CadastrarTurma(Instrutor instrutor){
        Turma turma = new Turma();
        turma.setInstrutor(instrutor);
        
    }
}
