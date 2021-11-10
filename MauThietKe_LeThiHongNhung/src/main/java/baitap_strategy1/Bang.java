/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_strategy1;

/**
 *
 * @author HONGNHUNG
 */
public class Bang extends Context{
    void phepTinh (Context c, ITinh t)
    {
        c.setTinhToan(t);
        System.out.println("Ket qua: "+performTinh());
    }
}
