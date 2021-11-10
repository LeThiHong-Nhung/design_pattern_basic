/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.entity;

/**
 *
 * @author HONGNHUNG
 */
public class MonHoc {
    int id;
    String tenMon;
    int diem;

    public MonHoc(int id, String tenMon, int diem) {
        this.id = id;
        this.tenMon = tenMon;
        this.diem = diem;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "id=" + id + ", tenMon=" + tenMon + ", diem=" + diem + '}';
    }
}
