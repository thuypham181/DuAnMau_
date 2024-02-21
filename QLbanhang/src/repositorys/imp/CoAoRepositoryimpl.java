/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.imp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.CoAo;
import repositorys.IChatLieuRepository;
import repositorys.ICoAoRepository;
import utilconnext.DBConnection;

/**
 *
 * @author vieta
 */
public class CoAoRepositoryimpl implements ICoAoRepository{
    final String SQL_SELECT_ALL = "SELECT Id,Ten FROM dbo.CoAo";
    final String SQL_SELECT_BY_ID = "SELECT Id,Ten FROM dbo.CoAo WHERE Id = ?";
    final String SQL_INSERT = "INSERT INTO dbo.CoAo (Ten) VALUES(?)";
    final String SQL_UPDATE = "UPDATE dbo.CoAo SET Ten = ? WHERE Id = ?";
    final String SQL_DELETE = "DELETE  dbo.CoAo WHERE Id = ?";

    @Override
    public List<CoAo> getAll() {

        return getdataquery(SQL_SELECT_ALL);

    }

    @Override
    public int insert(CoAo x) {

        return DBConnection.ExcuteQuery(SQL_INSERT, x.getTen());

    }

    @Override
    public int update(CoAo x, int id) {
        return DBConnection.ExcuteQuery(SQL_UPDATE, x.getTen(), id);
    }

    @Override
    public int delete(int id) {
        return DBConnection.ExcuteQuery(SQL_DELETE, id);
    }

    @Override
    public CoAo getbyid(int id) {
        return getdataquery(SQL_SELECT_BY_ID, id).get(0);
    }

    private List<CoAo> getdataquery(String SQL, Object... arvg) {
        List<CoAo> lst = new ArrayList<>();
        try {
            ResultSet rl = DBConnection.getDataFromQuery(SQL, arvg);
            while (rl.next()) {
                lst.add(new CoAo((int) rl.getObject(1), (String) rl.getObject(2)));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lst;

    }
     
    
}