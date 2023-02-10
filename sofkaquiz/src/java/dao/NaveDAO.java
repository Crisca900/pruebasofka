/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import dto.NaveDTO;
import interfaces.Obligacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blackdragons
 */
public class NaveDAO implements Obligacion<NaveDTO> {

    private static final String SQL_INSERT="INSERT INTO nave (codigo,tiponave,nombre,combustible,empuje,peso,pesocarga,retirado,potencia,numpasajeros,pais,usuario,estado) VALUE(?,?,?,?,?,?,?,?,?,?,?,?,'si')";
    private static final String SQL_UPDATE="UPDATE nave SET tiponave=?,nombre=?,combustible=?,empuje=?,peso=?,pesocarga=?,retirado=?,potencia=?,numpasajeros=?,pais=?,usuario=? where codigo=? and estado='si'";
    private static final String SQL_DELETE="UPDATE nave SET estado='no' WHERE codigo=? and estado='si'";
    private static final String SQL_READ="SELECT * FROM nave WHERE codigo=? and estado='si'";
    private static final String SQL_READALL="SELECT * FROM nave";
    
    public static final Conexion con=Conexion.Estado();
    
    @Override
    public boolean Crear(NaveDTO c) {
       PreparedStatement ps;
        try {
            
            ps=con.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1, c.getCodigo());
            ps.setString(2, c.getTiponave());
            ps.setString(3, c.getNombre());
            ps.setString(4, c.getCombustible());
            ps.setString(5, c.getEmpuje());
            ps.setString(6, c.getPeso());
            ps.setString(7, c.getPesocarga());
            ps.setString(8, c.getRetirado());
            ps.setString(9, c.getPotencia());
            ps.setString(10, c.getNumPasajeros());
            ps.setString(11, c.getPais());
            ps.setString(12, c.getUsuario());
            if (ps.executeUpdate() > 0)
            {
                return true;
            }
                        
        } catch (SQLException ex) {
            Logger.getLogger(NaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarconexion();
        }
        return false;
    }

    @Override
    public boolean Borrar(Object key) {
        try {
            PreparedStatement ps;
            ps=con.getCnn().prepareStatement(SQL_DELETE);
            ps.setString(1, key.toString());
            
            if(ps.executeUpdate()>0)
            {
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarconexion();
        }
        return false;
    }

    @Override
    public boolean Actualizar(NaveDTO c) {
        try {
            PreparedStatement ps;
            ps=con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1, c.getCodigo());
            ps.setString(2, c.getTiponave());
            ps.setString(3, c.getNombre());
            ps.setString(4, c.getCombustible());
            ps.setString(5, c.getEmpuje());
            ps.setString(6, c.getPeso());
            ps.setString(7, c.getPesocarga());
            ps.setString(8, c.getRetirado());
            ps.setString(9, c.getPotencia());
            ps.setString(10, c.getNumPasajeros());
            ps.setString(11, c.getPais());
            ps.setString(12, c.getUsuario());
            if(ps.executeUpdate()>0)
            {
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public NaveDTO read(Object key) {
        PreparedStatement ps;
        ResultSet res;
        NaveDTO n=null;
        try {
            
                ps=con.getCnn().prepareStatement(SQL_READ);
                ps.setString(1, key.toString());
                res=ps.executeQuery();
                while(res.next())
                {
                   n = new NaveDTO( res.getString(1), res.getString(2),res.getString(3), res.getString(4),res.getString(5), res.getString(6),res.getString(7), res.getString(8),res.getString(9), res.getString(10),res.getString(11), res.getString(12));
                }
                return n;
            } 
        catch (SQLException ex) {
            Logger.getLogger(NaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarconexion();
        }
        return n;
    }

    @Override
    public List<NaveDTO> readAll() {
        PreparedStatement ps;
        ResultSet res=null;
        ArrayList<NaveDTO> nave= new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_READALL);
            res=ps.executeQuery();
            while(res.next())
            {
                nave.add(new NaveDTO(res.getString(1), res.getString(2),res.getString(3), res.getString(4),res.getString(5), res.getString(6),res.getString(7), res.getString(8),res.getString(9), res.getString(10),res.getString(11), res.getString(12)));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarconexion();
        }
        
        return nave;
    }
    
}
