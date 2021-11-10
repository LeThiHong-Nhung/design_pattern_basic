/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai4data;

/**
 *
 * @author HONGNHUNG
 */
public class FactoryData {
    DataAccess dataAccess;
    public DataAccess createDataAccess(String giaoDien)
    {
        if(giaoDien == "UI1")
            return new UI1();
        if(giaoDien == "UI2")
            return new UI2();
        else return new UI3();
    }
}
