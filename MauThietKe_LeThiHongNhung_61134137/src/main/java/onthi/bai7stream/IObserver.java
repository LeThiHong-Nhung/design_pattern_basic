/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai7stream;

import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public interface IObserver {
    void update(List<String> data);
}
