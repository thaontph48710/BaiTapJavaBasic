package BT_JAVA_BASIC_1;

public class SinhVien {

    String name = "Nguyen Thanh Thao";
    int tuoi = 21;

    static String chieuCao = "1m67";


    public static void main(String[] args) {
        String queQuan = "Lang Son";
        String danToc = "Kinh";

        SinhVien sv = new SinhVien();
        System.out.println(sv.name);
        System.out.println(sv.tuoi);
        System.out.println(chieuCao);
        System.out.println(danToc);
        System.out.println(queQuan);

        System.out.println(ThongTin.nganhHoc);
        System.out.println(ThongTin.quocTich);



    }
}
