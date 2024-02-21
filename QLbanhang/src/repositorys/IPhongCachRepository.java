/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorys;

import java.util.List;

import models.PhongCach;

/**
 *
 * @author vieta
 */
public interface IPhongCachRepository {

    public List<PhongCach> getAll();

    public int insert(PhongCach x);

    public int update(PhongCach x, int id);

    public int delete(int id);
    
    public PhongCach getbyid(int id);
}
