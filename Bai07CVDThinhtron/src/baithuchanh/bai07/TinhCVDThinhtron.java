package baithuchanh.bai07;
import java.util.Scanner;
public class TinhCVDThinhtron {

	public static void main(String[] args) {
		
		class TinhChuViDienTichHinhTron
		{
		    static Scanner sc = new Scanner(System.in);
		    public static void main(String args[])
		    {
		        System.out.print("Nhap ban kinh duong tron: ");
		        double radius = sc.nextDouble();
		        double area = Math.PI * (radius * radius);
		        System.out.println("Dien tich hinh tron la: " + area);

		        double circumference= Math.PI * 2*radius;
		        System.out.print( "Chu vi hinh trong la: "+circumference) ;
		    }
		}

	}

}
