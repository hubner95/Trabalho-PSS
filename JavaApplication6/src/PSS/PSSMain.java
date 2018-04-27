/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSS;

import Controlador.ControladorTurma;
import Visao.VisaoTurma;


/**
 *
 * @author andre
 */
public class PSSMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Controlador.ControladorTurma controlador = new ControladorTurma();
        Visao.VisaoTurma visao = new VisaoTurma(controlador);
        visao.crudTurma();
    }

}
