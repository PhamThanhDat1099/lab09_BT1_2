/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTextFile {
    public static void main(String[] args) {
        List<SanPham> sanPhamList = new ArrayList<>();

        // Đọc nội dung file 'sanpham.txt'
        try (BufferedReader reader = new BufferedReader(new FileReader("sanpham.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String maso = parts[0];
                String ten = parts[1];
                float gia = Float.parseFloat(parts[2]);

                sanPhamList.add(new SanPham(maso, ten, gia));
            }
            System.out.println("Đoc file thanh cong!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Xuất danh sách sản phẩm ra màn hình
        for (SanPham sp : sanPhamList) {
            System.out.println("Ma so: " + sp.getMaso());
            System.out.println("Ten: " + sp.getTen());
            System.out.println("Gia: " + sp.getGia());
            System.out.println();
        }
    }
}

