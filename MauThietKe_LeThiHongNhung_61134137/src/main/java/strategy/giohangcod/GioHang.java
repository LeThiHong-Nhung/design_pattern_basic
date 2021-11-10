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
public class GioHang{
    List<HangHoa> dsHH = new ArrayList<>();
    IThanhToan hinhThucTT;

    public GioHang(IThanhToan hinhThucTT) {
 
        this.hinhThucTT = hinhThucTT;
    }

    public void setDsHH(List<HangHoa> dsHH) {
        this.dsHH = dsHH;
    }
    
    
    public int tinhTien()
    {
        int sum =0;
        for (HangHoa o : dsHH) {
            sum = sum+o.gia;
        }
        return sum;
    }
    
    public double thanhToan()
    {
        return hinhThucTT.thanhToan(tinhTien());
    }
    public void printInfo()
    {
        System.out.println("Danh sach hang hoa:");
        dsHH.forEach(t ->  
        {
            System.out.println(" "+ t.toString());
        });
        System.out.println("Tien hang: "+tinhTien());
        System.out.println("So tien khach phai tra: "+ thanhToan());
    }
}
