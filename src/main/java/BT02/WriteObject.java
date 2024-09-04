/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteObject {
    public static void main(String[] args) {
        // Tạo danh sách sản phẩm
        List<SanPham> sanPhamList = new ArrayList<>();
        sanPhamList.add(new SanPham("SP01", "Nuoc giai khat Sting", 10000.0f));
        sanPhamList.add(new SanPham("SP02", "Nuoc giai khat Olong", 8000.0f));
        sanPhamList.add(new SanPham("SP03", "Nuoc giai khat Tang Luc", 15000.0f));
        // Ghi danh sách sản phẩm vào file 'sanpham.bin'
        try (FileOutputStream fos = new FileOutputStream("sanpham.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(sanPhamList);
            System.out.println("Ghi file thanh cong!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

