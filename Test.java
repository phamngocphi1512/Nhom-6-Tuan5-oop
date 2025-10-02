public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("B001", "Lap trinh Java", "Nguyen Van A", 2020, 10);
        Sach sach2 = new Sach();
        sach2.setMaSach("B002");
        sach2.setTieuDe("CCau truc du lieu va giai thuat");
        sach2.setTacGia("Tran Thi B");
        sach2.setNamXuatBan(2019);
        sach2.setSoLuong(5);
        System.out.println("Thong tin sach 1:");
        sach1.hienThiThongTin();
        System.out.println("Thong tin sach 2:");
        sach2.hienThiThongTin();
    }
}
