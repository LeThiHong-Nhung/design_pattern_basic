/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai6khoahoc;

/**
 *
 * @author HONGNHUNG
 */
public class Main_MonHoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractMonHoc mh1 = new MonHoc(3, 340000, "Thiet ke Web");
        AbstractMonHoc mh2 = new MonHoc(3, 340000, "CSDL");
        AbstractMonHoc mh3 = new MonHoc(3, 340000, "Nhap mon quan tri hoc");
        AbstractMonHoc mh4 = new MonHoc(3, 340000, "Mau thiet ke");

        AbstractMonHoc ky1 = new KhoaHoc("Ky 1");
        ky1.them(mh1);
        ky1.them(mh2);

        AbstractMonHoc ky2 = new KhoaHoc("Ky 2");
        ky2.them(mh3);
        ky2.them(mh4);

        AbstractMonHoc namHoc = new KhoaHoc("2020-2021");
        namHoc.them(ky1);
        namHoc.them(ky2);

        AbstractMonHoc khoa = new KhoaHoc("Khoa 61");
        khoa.them(namHoc);

        System.out.println("Danh sach mon hoc");
        System.out.println(khoa.lietKeMonHoc());

        System.out.println("Tong hoc phi : " + khoa.tinhHocPhi());
        System.out.println("Tong so tin chi : " + khoa.tinhSoTinChi());
    }
    
}
