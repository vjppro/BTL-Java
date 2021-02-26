import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Kho {
    private String maMay;
    private String tenMay;
    private String cpu;
    private String ram;
    private String sizeScreen;
    private String vga;
    private String power;
    private String weight;
    private double giaBan;
    private ArrayList<TTLaptop> dsLaptop;

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

    public ArrayList<TTLaptop> getDsLaptop() {
        return dsLaptop;
    }

    public void setDsLaptop(ArrayList<TTLaptop> dsLaptop) {
        this.dsLaptop = dsLaptop;
    }

    public void Input() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("Laptop.txt");
        Scanner input = new Scanner(file);
        int n = Integer.parseInt(input.nextLine());
        dsLaptop = new ArrayList<>();
        if (n != 0) {
            input.nextLine();
            maMay = input.nextLine();
            tenMay = input.nextLine();
            cpu = input.nextLine();
            ram = input.nextLine();
            sizeScreen = input.nextLine();
            vga = input.nextLine();
            power = input.nextLine();
            weight = input.nextLine();
            giaBan = Double.parseDouble(input.nextLine());
            TTLaptop ttLaptop = new TTLaptop(maMay,tenMay,cpu,ram,sizeScreen,vga,power,weight,giaBan);

        }
        try {
            file.close();
            input.close();
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    public void Output(){
        System.out.println("Danh sách các mặt hàng: ");
        for (int i=0;i<dsLaptop.size();i++){
            System.out.println("Mặt hàng thứ " + (i+1) + ":");
            System.out.println(dsLaptop.get(i));
        }
    }
}
