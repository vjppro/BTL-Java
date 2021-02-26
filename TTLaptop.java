import java.util.Scanner;

public class TTLaptop {
    private String maMay;
    private String tenMay;
    private String cpu;
    private String ram;
    private String sizeScreen;
    private String vga;
    private String power;
    private String weight;
    private double giaBan;

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getTenMay() {
        return tenMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSizeScreen() {
        return sizeScreen;
    }

    public void setSizeScreen(String sizeScreen) {
        this.sizeScreen = sizeScreen;
    }

    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập thông tin sản phẩm: ");
        System.out.println("Mã máy: ");
        maMay = in.nextLine();
        System.out.println("Tên máy: ");
        tenMay = in.nextLine();
        System.out.println("CPU: ");
        cpu = in.nextLine();
        System.out.println("Ram: ");
        ram = in.nextLine();
        System.out.println("Display: ");
        sizeScreen = in.nextLine();
        System.out.println("VGA: ");
        vga = in.nextLine();
        System.out.println("Pin: ");
        power = in.nextLine();
        System.out.println("Weight: ");
        weight = in.nextLine();
        System.out.println("Giá: ");
        giaBan = in.nextDouble();
        in.nextLine();
        for (int i=0; ;i++){
            String str = in.nextLine();
            if (str.equals("*")) break;
        }
    }

    public TTLaptop(String maMay, String tenMay, String cpu, String ram, String sizeScreen, String vga, String power, String weight, double giaBan) {
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.cpu = cpu;
        this.ram = ram;
        this.sizeScreen = sizeScreen;
        this.vga = vga;
        this.power = power;
        this.weight = weight;
        this.giaBan = giaBan;
    }

    public TTLaptop(){

    }

    @Override
    public String toString() {
        return "TTLaptop{" +
                "maMay='" + maMay + '\'' +
                ", tenMay='" + tenMay + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", sizeScreen='" + sizeScreen + '\'' +
                ", vga='" + vga + '\'' +
                ", power='" + power + '\'' +
                ", weight='" + weight + '\'' +
                ", giaBan=" + giaBan +
                '}';
    }
}
