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
public class NaveDTO {
    private String Codigo;
    private String Tiponave;
    private String Nombre;
    private String Combustible;
    private String Empuje;
    private String Peso;
    private String Pesocarga;
    private String Retirado;
    private String Potencia;
    private String NumPasajeros;
    private String Pais;
    private String Usuario;
    private String estado;

    public NaveDTO() {
    }

    public NaveDTO(String Codigo) {
        this.Codigo = Codigo;
    }

    public NaveDTO(String Codigo, String Tiponave, String Nombre, String Combustible, String Empuje, String Peso, String Pesocarga, String Retirado, String Potencia, String NumPasajeros, String Pais, String Usuario, String estado) {
        this.Codigo = Codigo;
        this.Tiponave = Tiponave;
        this.Nombre = Nombre;
        this.Combustible = Combustible;
        this.Empuje = Empuje;
        this.Peso = Peso;
        this.Pesocarga = Pesocarga;
        this.Retirado = Retirado;
        this.Potencia = Potencia;
        this.NumPasajeros = NumPasajeros;
        this.Pais = Pais;
        this.Usuario = Usuario;
        this.estado = estado;
    }

    public NaveDTO(String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getTiponave() {
        return Tiponave;
    }

    public void setTiponave(String Tiponave) {
        this.Tiponave = Tiponave;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    public String getEmpuje() {
        return Empuje;
    }

    public void setEmpuje(String Empuje) {
        this.Empuje = Empuje;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public String getPesocarga() {
        return Pesocarga;
    }

    public void setPesocarga(String Pesocarga) {
        this.Pesocarga = Pesocarga;
    }

    public String getRetirado() {
        return Retirado;
    }

    public void setRetirado(String Retirado) {
        this.Retirado = Retirado;
    }

    public String getPotencia() {
        return Potencia;
    }

    public void setPotencia(String Potencia) {
        this.Potencia = Potencia;
    }

    public String getNumPasajeros() {
        return NumPasajeros;
    }

    public void setNumPasajeros(String NumPasajeros) {
        this.NumPasajeros = NumPasajeros;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
}
