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
public class Activity implements IClick{
    int dem;
    Button button;

    public Activity() {
        dem = 0;
    }
    public void addClick(Button button)
    {
        this.button = button;
        button.addActivity(this);
    }

    @Override
    public void thongBao() {
        dem = dem +1;
        System.out.println("Ban click lan thu "+ dem);
    }
    
}
