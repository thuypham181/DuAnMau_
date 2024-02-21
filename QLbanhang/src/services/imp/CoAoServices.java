/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.List;
import models.CoAo;
import repositorys.ICoAoRepository;
import repositorys.imp.CoAoRepositoryimpl;
import services.ICoAoServices;


import viewmodels.Objecttt;

/**
 *
 * @author vieta
 */
public class CoAoServices implements ICoAoServices {

   private ICoAoRepository coAoRepository = new CoAoRepositoryimpl();

    @Override
    public List<CoAo> getAll() {
        return coAoRepository.getAll();
    }

    @Override
    public String Add(Objecttt x) {
        CoAo chatlieu = new CoAo(x.getId(), x.getTen());
        int them = coAoRepository.insert(chatlieu);
        if (them == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Update(Objecttt x, int id) {
         CoAo chatlieu = new  CoAo(x.getId(), x.getTen());
        int them = coAoRepository.update(chatlieu,id);
        if (them == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Delete(int id) {
        if (coAoRepository.delete(id) == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public  CoAo getbyid(int id) {
        return coAoRepository.getbyid(id);
    }

}
