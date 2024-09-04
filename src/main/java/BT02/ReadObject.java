/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadObject {
    public static void main(String[] args) {
        // Đọc danh sách sản phẩm từ file 'sanpham.bin'
        try (FileInputStream fis = new FileInputStream("sanpham.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            List<SanPham> sanPhamList = (List<SanPham>) ois.readObject();
            System.out.println("Doc file thanh cong!");

            // Xuất danh sách sản phẩm ra màn hình
            for (SanPham sp : sanPhamList) {
                System.out.println("Ma so: " + sp.getMaso());
                System.out.println("Ten: " + sp.getTen());
                System.out.println("Gia: " + sp.getGia());
                System.out.println();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


