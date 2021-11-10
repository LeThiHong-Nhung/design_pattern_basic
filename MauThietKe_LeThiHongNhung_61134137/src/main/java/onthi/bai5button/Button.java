/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai5button;

/**
 *
 * @author HONGNHUNG
 */
public class Button {
    IClick activity;

    public void click()
    {
        if(activity!=null)
            activity.thongBao();
    }

    void addActivity(IClick activity) {//gui thong bao den activity neu button thay doi gi do
        this.activity = activity;
    }
}
