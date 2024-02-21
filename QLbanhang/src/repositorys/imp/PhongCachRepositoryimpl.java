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
import models.PhongCach;


import repositorys.IPhongCachRepository;
import utilconnext.DBConnection;

/**
 *
 * @author vieta
 */
public class PhongCachRepositoryimpl implements IPhongCachRepository{
    final String SQL_SELECT_ALL = "SELECT Id,Ten FROM dbo.PhongCach";
    final String SQL_SELECT_BY_ID = "SELECT Id,Ten FROM dbo.PhongCach WHERE Id = ?";
    final String SQL_INSERT = "INSERT INTO dbo.PhongCach (Ten) VALUES(?)";
    final String SQL_UPDATE = "UPDATE dbo.PhongCach SET Ten = ? WHERE Id = ?";
    final String SQL_DELETE = "DELETE  dbo.PhongCach WHERE Id = ?";

    @Override
    public List<PhongCach> getAll() {

        return getdataquery(SQL_SELECT_ALL);

    }

    @Override
    public int insert(PhongCach x) {

        return DBConnection.ExcuteQuery(SQL_INSERT, x.getTen());

    }

    @Override
    public int update(PhongCach x, int id) {
        return DBConnection.ExcuteQuery(SQL_UPDATE, x.getTen(), id);
    }

    @Override
    public int delete(int id) {
        return DBConnection.ExcuteQuery(SQL_DELETE, id);
    }

    @Override
    public PhongCach getbyid(int id) {
        return getdataquery(SQL_SELECT_BY_ID, id).get(0);
    }

    private List<PhongCach> getdataquery(String SQL, Object... arvg) {
        List<PhongCach> lst = new ArrayList<>();
        try {
            ResultSet rl = DBConnection.getDataFromQuery(SQL, arvg);
            while (rl.next()) {
                lst.add(new PhongCach((int) rl.getObject(1), (String) rl.getObject(2)));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lst;

    }
     
    
}