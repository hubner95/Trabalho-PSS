/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopss;

import Controlador.ControladorMensalidade;
import Visao.VisaoMensalidade;

/**
 *
 * @author leo
 */
public class TrabalhoPss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controlador.ControladorMensalidade controlador = new ControladorMensalidade();
        Visao.VisaoMensalidade visao = new VisaoMensalidade(controlador);
        visao.crudMensalidade();
    }
    
}
