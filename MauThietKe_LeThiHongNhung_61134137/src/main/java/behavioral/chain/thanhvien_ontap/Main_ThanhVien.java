/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chain.thanhvien_ontap;

/**
 *
 * @author HONGNHUNG
 */
public class Main_ThanhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IThanhVien thanhVien = new ThanhVien(1000, "Thanh Vien");
        IThanhVien thanThiet = new ThanhVien(1500, "Than Thiet");
        IThanhVien bac = new ThanhVien(2500, "Bac");
        IThanhVien vang = new ThanhVien(5000, "Vang");

        thanhVien.setSuccessor(thanThiet)
                .setSuccessor(bac)
                .setSuccessor(vang);
        System.out.println("Diem 6000: " + thanhVien.phanLoai(6000));
    }
    
}
