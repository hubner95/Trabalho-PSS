/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controlador.ControladorMensalidade;
import java.util.Scanner;

/**
 *
 * @author leo
 */
public class VisaoMensalidade {
    
    private Controlador.ControladorMensalidade controlador;

    public ControladorMensalidade getControlador() {
        return controlador;
    }

    public void setControlador(ControladorMensalidade controlador) {
        this.controlador = controlador;
    }

    public VisaoMensalidade(ControladorMensalidade controlador) {
        this.controlador = controlador;
    }

    
    public void crudMensalidade() {
        Scanner leitor = new Scanner(System.in);
        int op=1;
        while (op != 0) {
            System.out.print("1-Criar mensalidade para aluno. \n2-Cadastrar pagamento da mensalidade.\n3-Consultar situação do aluno.\n0-Sair.\n");
            op = leitor.nextInt();
            leitor.nextLine();
            switch (op) {
                case 1:
                    controlador.relacionarAlunoMensalidade();
                    System.out.println("Mensalidade cadastrada com sucesso para o aluno informado!");
                    break;
                case 2:
                    controlador.pagarMensalidade();
                    //System.out.println("Pagamento realizado com sucesso!");
                    break;
                case 3:
                    controlador.consultarSitAluno();
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
