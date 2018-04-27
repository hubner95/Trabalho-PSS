/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controlador.ControladorTurma;
import PSS.Modelo.Aluno;
import PSS.Modelo.Instrutor;
import java.util.Scanner;


/**
 *
 * @author andre
 */
public class VisaoTurma {
        private Controlador.ControladorTurma controlador;

    public ControladorTurma getControlador() {
        return controlador;
    }

    public void setControlador(ControladorTurma controlador) {
        this.controlador = controlador;
    }

    public VisaoTurma(ControladorTurma controlador) {
        this.controlador = controlador;
    }


    public void crudTurma() {
        Scanner leitor = new Scanner(System.in);
        int op=1;
        while (op != 0) {
            System.out.print("1-Criar Turma. \n2-Alocar aluno.\n3-Alocar instrutor.\n4-Listar membros. \n0-Sair.\n");
            op = leitor.nextInt();
            leitor.nextLine();
            switch (op) {
                case 1:
                    controlador.criarTurma();
                    System.out.println("Turma criada com sucesso.");
                    break;
                case 2:
                    controlador.alocarAluno();
                    System.out.println("Aluno alocado");
                    break;
                case 3:
                    controlador.alocarInstrutor();
                    System.out.println("Instrutor alocado");
                    break;
                case 4:
                    controlador.listarTurma();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
        }
    }
}
