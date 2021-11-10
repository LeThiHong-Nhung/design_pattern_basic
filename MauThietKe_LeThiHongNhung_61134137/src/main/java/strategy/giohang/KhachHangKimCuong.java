/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.giohang;

/**
 *
 * @author HONGNHUNG
 */
public class KhachHangKimCuong implements IChietKhau{

    @Override
    public float tinhChietKhau(float gtdh) {
        float ck =0;
        if(gtdh >= 1500000)
            ck = (int) (0.06 * gtdh);
        else if(gtdh >= 1000000)
            ck = (int) (0.05 * gtdh);
        else if(gtdh>=500000)
            ck =  (int) (0.03 * gtdh);
        return ck;
    }
    
}
