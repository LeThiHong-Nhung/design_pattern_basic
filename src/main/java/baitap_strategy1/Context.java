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
public class Context {
    private ITinh tinhToan;
    float a, b;

    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }
    
    float performTinh()
    {
        return tinhToan.tinh(a, b);
    }
}
