import java.util.ArrayList;

public class HoaDon {
    private String maHD;
    private String ngayMua;
    private double tongTien;
    private ArrayList<Laptop> laptops;

    public ArrayList<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(ArrayList<Laptop> laptops) {
        this.laptops = laptops;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public void OutputDS() {
        tongTien = 0;
        System.out.println("Mã hóa đơn: " + maHD);
        System.out.println("Ngày mua: " + ngayMua);
        for (int i=0;i<laptops.size();i++) {
            System.out.println("Sản phẩm thứ " + (i+1) + ":");
            System.out.println(laptops.get(i));
            tongTien += laptops.get(i).getGiaBan();
        }
        System.out.println("Tổng tiền: " + tongTien);
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHD='" + maHD + '\'' +
                ", ngayMua='" + ngayMua + '\'' +
                ", tongTien=" + tongTien +
                ", laptops=" + laptops +
                '}';
    }
}
