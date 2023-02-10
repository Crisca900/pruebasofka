/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

/**
 *
 * @author blackdragons
 */
public interface Obligacion <Cualquiercosa> {
    public boolean Crear(Cualquiercosa c);
    public boolean Borrar(Object key);
    public boolean Actualizar(Cualquiercosa c);
    
    public Cualquiercosa read(Object key);
    public List<Cualquiercosa> readAll();
}
