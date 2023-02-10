/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import conexion.Conexion;
import dto.TipoNaveDTO;
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
public class TipoNaveDAO implements Obligacion<TipoNaveDTO> {
    private static final String SQL_INSERT="INSERT INTO tiponave (codigo,tiponave) VALUES (?,?)";
    private static final String SQL_UPDATE="UPDATE tiponave SET tiponave=?,tiponave=? where codigo=?";
    private static final String SQL_DELETE="DELETE FROM tiponave WHERE codigo=? ";
    private static final String SQL_READ="SELECT * FROM tiponave WHERE codigo=?";
    private static final String SQL_READALL="SELECT * FROM tiponave";
    
    public static final Conexion con=Conexion.Estado();
    
    @Override
    public boolean Crear(TipoNaveDTO c) {
       PreparedStatement ps;
        try {
            
            ps=con.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1, c.getCodigo());
            ps.setString(2, c.getTiponave());
            
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
    public boolean Actualizar(TipoNaveDTO c) {
        try {
            PreparedStatement ps;
            ps=con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1, c.getCodigo());
            ps.setString(2, c.getTiponave());
            
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
    public TipoNaveDTO read(Object key) {
        PreparedStatement ps;
        ResultSet res;
        TipoNaveDTO n=null;
        try {
            
                ps=con.getCnn().prepareStatement(SQL_READ);
                ps.setString(1, key.toString());
                res=ps.executeQuery();
                while(res.next())
                {
                   n = new TipoNaveDTO( res.getString(1), res.getString(2));
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
    public List<TipoNaveDTO> readAll() {
        PreparedStatement ps;
        ResultSet res=null;
        ArrayList<TipoNaveDTO> nave= new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_READALL);
            res=ps.executeQuery();
            while(res.next())
            {
                nave.add(new TipoNaveDTO(res.getString(1), res.getString(2)));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarconexion();
        }
        
        return nave;
    }
}
