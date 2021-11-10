/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.tygia;

/**
 *
 * @author HONGNHUNG
 */
public class NhaDauTuA extends NhaDauTu{
    @Override
    public void capNhatTyGia(float tyGiaMoi) {
        if(tyGiaMoi > this.tyGia)
            System.out.println("Nha dau tu A: ban ra!");
        else System.out.println("Nha dau tu A: mua vao!");
        this.tyGia = tyGiaMoi;
    }
}
