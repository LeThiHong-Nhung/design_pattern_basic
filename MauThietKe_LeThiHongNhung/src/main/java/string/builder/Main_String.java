/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.builder;

/**
 *
 * @author HONGNHUNG
 */
public class Main_String {
    public static void main(String[] args)
    {
        MyStringBuilder build = new MyStringBuilder();
        build.Str("Le Thi Hong Nhung + ")
                .addString("Chuoi dau tien + ")
                .addFloat((float)4.5)
                .addBool(true)
                .build();
        System.out.println(build.toString());
    }
}
