/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorys;

import java.util.List;
import models.CoAo;

/**
 *
 * @author vieta
 */
public interface ICoAoRepository {

    public List<CoAo> getAll();

    public int insert(CoAo x);

    public int update(CoAo x, int id);

    public int delete(int id);
    
    public CoAo getbyid(int id);
}
