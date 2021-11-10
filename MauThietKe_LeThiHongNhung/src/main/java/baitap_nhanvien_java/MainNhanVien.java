/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_nhanvien_java;

/**
 *
 * @author HONGNHUNG
 */
public class MainNhanVien {
    public static void main(String[] args)
    {
        //khoi tao 2 bien nhan vien
        NhanVien nv1 = new NhanVien("Nhung",20, "Khanh Hoa", 1234, 12);
        NhanVien nv2 = new NhanVien("Nhung1",20, "Khanh Hoa", 1122, 10);
        System.out.println(nv1.getThongTin());
        System.out.println("Tien Thuong : " + nv1.tinhThuong());
        System.out.println(nv2.getThongTin());
        System.out.println("Tien Thuong : " + nv2.tinhThuong());

        // QuanLyNhanVien, 5 nhan vien
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        NhanVien nv3 = new NhanVien("Nhung4",20, "Khanh Hoa", 1442, 10);
        NhanVien nv4 = new NhanVien("Nhung3",20, "Khanh Hoa", 1322, 11);
        NhanVien nv5 = new NhanVien("Nhung5",20, "Khanh Hoa", 1222, 13);
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        
        System.out.println("Bai 2\n");
        qlnv.inDS();
    }
}
