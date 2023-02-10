/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author blackdragons
 */
public class TipoNaveDTO {
    private String codigo;
    private String tiponave;
    

    public TipoNaveDTO() {
    }

    public TipoNaveDTO(String codigo, String tiponave) {
        this.codigo = codigo;
        this.tiponave = tiponave;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTiponave() {
        return tiponave;
    }

    public void setTiponave(String tiponave) {
        this.tiponave = tiponave;
    }

    
    
}
