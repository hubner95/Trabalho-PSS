/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Aluno;
import Modelo.Funcionario;
import Modelo.Mensalidade;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author leo
 */
public class ControladorMensalidade {
    
    private Scanner leitor;
    
    private List<Aluno> todosAlunos ;
    //private List<Instrutor> todosInstrutores ;
    private Funcionario funcionario;
    //private Instrutor instrutor;
    private Mensalidade mensalidade;
    private Aluno aluno;
    private int op;
    private int id;
    
    
    public ControladorMensalidade() {
        funcionario = new Funcionario();
        mensalidade = null;
        op = 1;
        id = 0;
        todosAlunos = new ArrayList<>();
        leitor = new Scanner(System.in);
    }
    
    public void criarMensalidade(){
        mensalidade.cadastrarMensalidade();
    }
    
    public void pagarMensalidade(){
        if  (mensalidade == null) {
            System.out.println("Não existem mensalidades cadastradas.");
        } else {
            mensalidade.quitarMensalidade(mensalidade);
            System.out.println("Pagamento realizado com sucesso!");
        }
    }
    
    public void relacionarAlunoMensalidade() {
        aluno = new Aluno();
        aluno.setId(id);
        id++;
        System.out.print("Nome: ");
        aluno.setNome(leitor.nextLine());
        System.out.print("CPF: ");
        aluno.setCPF(leitor.nextLine());
        System.out.print("Endereço: ");
        aluno.setEndereco(leitor.nextLine());
        System.out.print("Telefone: ");
        aluno.setTelefone(leitor.nextLine());
        todosAlunos.add(aluno);
        mensalidade.relacionaAlunoMensalidade(aluno);
    }

    public void consultarSitAluno() {
        if  (mensalidade == null) {
            System.out.println("Não existem mensalidades cadastradas.");
        } else {
            System.out.println("Situação dos alunos: ");
            for (id = 0; id < todosAlunos.size(); id++) {
                System.out.println(mensalidade.getAlunos().get(id).getNome());
                if (mensalidade.isIndPagamento() == true){
                    System.out.println(" - situação Regular\n");
                }else{
                    System.out.println(" - situação Pendente\n");
                }   
            }
        }
    }
}
