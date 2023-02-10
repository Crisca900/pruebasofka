/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.TipoNaveDAO;
import dto.TipoNaveDTO;

/**
 *
 * @author blackdragons
 */
public class Prueba {
    public static void main(String[] args){
        TipoNaveDAO tn= new TipoNaveDAO();
        //tn.Crear(new TipoNaveDTO("01", "nave tripulada"));
        TipoNaveDTO navebuscar=tn.read("01");
        System.out.println(navebuscar.getTiponave());
    }
}
