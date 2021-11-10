/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.vidu;

/**
 *
 * @author HONGNHUNG
 */
public abstract interface Iterator {//dn gd cho viec truy cap va duyet phan tu

    int First();
    int Next();
    boolean isDone();
    int CurentItem();
}
