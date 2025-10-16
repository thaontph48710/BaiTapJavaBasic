package BT_JAVA_BASIC_5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class JavaBasic5 {
    // Tạo collection để lưu danh sách nhân viên
    ArrayList<String> listNhanVien = new ArrayList();
    ArrayList<Integer> soChan = new ArrayList();

    //Bài tập Java Basic 4 với ArrayList
    public void soChan() {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                soChan.add(i);
            }
        }

        System.out.println("Các số chẵn từ 0 đến 50:");
        for (int i : soChan) {
            System.out.println(i);
        }

    }

    // Hàm thêm thông tin cơ bản của một nhân viên vào collection
    public void nhanVien(String maNhanVien, String tenNhanVien, int tuoi, String chucVu, double luong) {
        String nv = "Mã nhân viên: " + maNhanVien + ", Tên nhân viên: " + tenNhanVien + ", Tuổi: " + tuoi + ", Chức vụ: " + chucVu + ", Lương: " + luong;
        listNhanVien.add(nv);
    }

    public static void main(String[] args) {

        JavaBasic5 jb = new JavaBasic5();
        jb.soChan();
        jb.nhanVien("Ph48710", "Nguyen Thanh Thao", 21, "Tester", 2000000);
        jb.nhanVien("Ph48711", "Ha Ngoc Thao", 22, "Tester", 30000000);
        System.out.println();
        System.out.println("Danh sách nhan vien-------------------------------------------------");
        for (int i = 0; i < jb.listNhanVien.size(); i++) {
            System.out.println(jb.listNhanVien.get(i));
        }


    }
}
