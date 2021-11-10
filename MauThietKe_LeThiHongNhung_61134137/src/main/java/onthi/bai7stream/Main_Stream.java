/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai7stream;

/**
 *
 * @author HONGNHUNG
 */
public class Main_Stream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stream stream = new Stream();

        Consumer consumer = new Consumer(stream);
        consumer.dangKy();

        stream.add("Le Thi Hong Nhung");
        stream.add("Mau thiet ke");
        stream.update("Mau thiet ke", "60CNTT2");
    }
    
}
