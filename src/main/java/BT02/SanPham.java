/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT02;

import java.io.Serializable;

public class SanPham implements Serializable {
    private static final long serialVersionUID = 1L;

    private String maso;
    private String ten;
    private float gia;

    public SanPham(String maso, String ten, float gia) {
        this.maso = maso;
        this.ten = ten;
        this.gia = gia;
    }

    // Implemented getters
    public String getMaso() {
        return maso;
    }

    public String getTen() {
        return ten;
    }

    public float getGia() {
        return gia;
    }

    @Override
    public String toString() {
        return maso + ";" + ten + ";" + gia;
    }
}
