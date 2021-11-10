/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.giohangcod;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class Main_GioHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<HangHoa> list = new ArrayList<>();
        list.add(new HangHoa("But", 30, "But chi xanh"));
        list.add(new HangHoa("Vo", 400, "Vo but cau xanh"));
        list.add(new HangHoa("Sach", 300, "Sach giao khoa dia ly"));
        list.add(new HangHoa("But", 40, "But bi xanh"));
        IThanhToan thanhToan = new ThanhToanCOD();
        GioHang gioHang = new GioHang(thanhToan);
        gioHang.setDsHH(list);
        gioHang.printInfo();
    }
    
}
