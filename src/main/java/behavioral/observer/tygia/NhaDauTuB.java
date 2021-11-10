/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.tygia;

/**
 *
 * @author HONGNHUNG
 */
public class NhaDauTuB extends NhaDauTu{
    
    @Override
    public void capNhatTyGia(float tyGiaMoi) {
        if(tyGiaMoi > this.tyGia)
            System.out.println("Nha dau tu B: mua ra!");
        else System.out.println("Nha dau tu B: ban vao!");
        this.tyGia = tyGiaMoi;
    }
}
