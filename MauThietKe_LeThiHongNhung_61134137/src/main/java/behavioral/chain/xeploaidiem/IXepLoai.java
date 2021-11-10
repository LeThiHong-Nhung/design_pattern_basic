/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chain.xeploaidiem;

/**
 *
 * @author HONGNHUNG
 */
public interface IXepLoai {
    IXepLoai setSuccessor(IXepLoai xl);
    String xepLoai(float diem);
}
