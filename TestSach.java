public class TestSach {
    public static void main(String[] args) {
        Sach sach1 = new Sach("S001", "Lập trình Java", "Nguyễn Văn A", 2022, 10);

        Sach sach2 = new Sach();
        sach2.setMaSach("S002");
        sach2.setTieuDe("Cấu trúc dữ liệu và giải thuật");
        sach2.setTacGia("Trần Văn B");
        sach2.setNamXuatBan(2020);
        sach2.setSoLuong(5);

        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}