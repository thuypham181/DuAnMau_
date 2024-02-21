/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.List;
import models.PhongCach;
import repositorys.IPhongCachRepository;
import repositorys.imp.PhongCachRepositoryimpl;
import services.IPhongCachServices;

import viewmodels.Objecttt;

/**
 *
 * @author vieta
 */
public class PhongCachServices implements IPhongCachServices {

    private IPhongCachRepository phongCachRepository = new PhongCachRepositoryimpl();

    @Override
    public List<PhongCach> getAll() {
        return phongCachRepository.getAll();
    }

    @Override
    public String Add(Objecttt x) {
        PhongCach chatlieu = new PhongCach(x.getId(), x.getTen());
        int them = phongCachRepository.insert(chatlieu);
        if (them == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Update(Objecttt x, int id) {
        PhongCach chatlieu = new PhongCach(x.getId(), x.getTen());
        int them = phongCachRepository.update(chatlieu,id);
        if (them == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Delete(int id) {
        if (phongCachRepository.delete(id) == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public PhongCach getbyid(int id) {
        return phongCachRepository.getbyid(id);
    }

}
