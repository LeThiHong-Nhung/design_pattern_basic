/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.stringbuilder;

/**
 *
 * @author HONGNHUNG
 */
public class Main_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder build = new MyStringBuilder();
        build.Str("Le Thi Hong Nhung + ")
                .addString("Chuoi dau tien + ")
                .addFloat((float)4.5)
                .addBool(true)
                .build();
        System.out.println(build.toString());
    }
    
}
