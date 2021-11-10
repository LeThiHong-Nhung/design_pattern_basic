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
public class Main_TyGia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DVTyGia dvtg = new DVTyGia(24000);
        NhaDauTu a = new NhaDauTuA();
        NhaDauTu b = new NhaDauTuB();
        a.setDvTyGia(dvtg);
        b.setDvTyGia(dvtg);
        //dvtg.dangKy(a); Sai vi dang ki phai do observer dam nhan
        a.dangKy();
        b.dangKy();
        dvtg.thongBaoCapNhat(25000);
        System.out.println("------------------------------");
        dvtg.thongBaoCapNhat(20300);
        b.huyDangKy();
        System.out.println("------------------------------");
        dvtg.thongBaoCapNhat(20600);
    }
    
}
