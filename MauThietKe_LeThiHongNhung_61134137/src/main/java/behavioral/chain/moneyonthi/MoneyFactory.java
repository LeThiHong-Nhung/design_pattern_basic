/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chain.moneyonthi;

/**
 *
 * @author HONGNHUNG
 */
public class MoneyFactory {

    IMoney money;
   
    public MoneyFactory(IMoney money) {
        this.money = money;
    }
    MoneyFactory() {
    }

    public void setMoney(IMoney money) {
        this.money = money;
    }
    
    public IMoney rutTienTheoMenhGia(int t, int max)
    {
        while(t>=max)
        {
            money.rutTien(max);
            t = t-max;
        }
        //System.out.println("t luc nay: "+t);
        money.rutTien(t);
        return money;
    }
}
