/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import PSS.Modelo.Aluno;
import PSS.Modelo.Funcionario;
import PSS.Modelo.Instrutor;
import PSS.Modelo.Turma;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ControladorTurma {

    private Scanner leitor;
    
    private List<Aluno> todosAlunos ;
    private List<Instrutor> todosInstrutores ;
    private Funcionario funcionario;
    private Instrutor instrutor;
    private Turma turma;
    private Aluno aluno;
    private int op;
    private int id;

    public ControladorTurma() {
        funcionario = new Funcionario();
        turma = null;
        op = 1;
        id = 0;
        todosInstrutores = new ArrayList<>();
        todosAlunos = new ArrayList<>();
        leitor = new Scanner(System.in);
    }

    public void criarTurma() {
        turma = funcionario.cadastrarTurma();
    }

    public void alocarAluno() {
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
        turma.alocarAluno(aluno);
    }

    public void alocarInstrutor() {
        instrutor = new Instrutor();
        instrutor.setId(id);
        id++;
        System.out.print("Nome: ");
        instrutor.setNome(leitor.nextLine());
        System.out.print("CPF: ");
        instrutor.setCPF(leitor.nextLine());
        System.out.print("Endereço: ");
        instrutor.setEndereco(leitor.nextLine());
        System.out.print("Telefone: ");
        instrutor.setTelefone(leitor.nextLine());
        todosInstrutores.add(instrutor);
        turma.setInstrutor(instrutor);
    }

    public void listarTurma() {
        if  (turma == null) {
            System.out.println("Turma não registrada");
        } else {
            System.out.println("Instrutor: " + turma.getInstrutor().getNome());
            System.out.println("Alunos: ");
            for (id = 0; id < todosAlunos.size(); id++) {
                System.out.println(turma.getAlunos().get(id).getNome());
            }
        }
    }
}
