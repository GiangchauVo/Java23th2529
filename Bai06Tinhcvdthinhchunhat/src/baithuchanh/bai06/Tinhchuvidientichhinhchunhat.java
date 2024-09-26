package baithuchanh.bai06;
import java.util.Scanner;

class DienTichHCN {
    protected int chieuDai, chieuRong;
    public static double tinhDienTich(double chieudai,double chieuRong) {
        return chieudai * chieuRong;
    }
    public static void main(String[] args) {
        double dai,rong;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        dai = scanner.nextDouble();
        System.out.println("Nhập chiều rộng: ");
        rong = scanner.nextDouble();
        System.out.println("diện tích hình chữ nhật là: " + tinhDienTich(dai,rong));
        System.out.println("----------------------------");
        System.out.println("Chương trình nay được đăng tại Freetuts.net");
    }
}

