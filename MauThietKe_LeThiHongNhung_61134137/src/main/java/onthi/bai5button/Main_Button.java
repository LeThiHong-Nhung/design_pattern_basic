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
public class Main_Button {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Button button = new Button();
        Activity ac = new Activity();
        ac.addClick(button);
        button.click();
        button.click();
        button.click();
        ac.thongBao();
        
    }
    
}
