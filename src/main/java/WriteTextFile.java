/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteTextFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SanPham> sanPhamList = new ArrayList<>();

        // Nhập danh sách 3 sản phẩm 
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap thong tin san pham thu " + (i + 1) + ":");
            System.out.print("Ma so: ");
            String maso = scanner.nextLine();
            System.out.print("Ten: ");
            String ten = scanner.nextLine();
            System.out.print("Gia: ");
            float gia = scanner.nextFloat();
            scanner.nextLine(); // Xử lý dòng new line

            sanPhamList.add(new SanPham(maso, ten, gia));
        }

        // Ghi thông tin sản phẩm vào file 'sanpham.txt'
        try (FileWriter writer = new FileWriter("sanpham.txt")) {
            for (SanPham sp : sanPhamList) {
                writer.write(sp.toString() + "\n");
            }
            System.out.println("Ghi file thanh cong!");
        } catch (IOException e) {
        }
    }
}

