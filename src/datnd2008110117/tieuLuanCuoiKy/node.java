package datnd2008110117.tieuLuanCuoiKy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class node {

    String loai;
    String ten;
    int maHang;
    int soLuongTrongKho;
    double giaNhap;
    Date ngayNhapKho;
    node next;
    static Scanner nhap = new Scanner(System.in);
    SimpleDateFormat date = new SimpleDateFormat("DD - MM - YYYY");

    //hàm tạo 

    node(){
    }

    node(String L, String T, int MH, int SLTK, double GN, String NN){
        loai = L;
        ten = T;
        maHang = MH;
        soLuongTrongKho = SLTK;
        giaNhap = GN;
        try{
            ngayNhapKho = date.parse(NN);

        }catch(ParseException e ){
            e.printStackTrace();
        }
    }

    //hàm in thông tin 
    public void inThongTinKho(){
        System.out.println("===========================================");
        System.out.println(" Loại hàng: " + loai);
        System.out.println(" Tên hàng: " + ten);
        System.out.println(" Mã hàng: " + maHang);
        System.out.println(" Số lượng Còn Trong kho: " + soLuongTrongKho);
        System.out.printf("  Giá bán: %.1f đồng \n", giaNhap);
        System.out.println(" Ngày nhập: " + date.format(ngayNhapKho));
        System.out.println("===========================================");
    }

    //hàm nhập thông tin 
    public void nhapThongTinKho() throws ParseException{
        System.out.println("===========================================");

        System.out.print("-Nhập loại hàng: ");
        loai = nhap.nextLine();

        System.out.print("-Nhập tên: ");
        nhap.nextLine();
        ten = nhap.nextLine();

        System.out.print("-Nhập mã hàng: ");
        maHang = nhap.nextInt();
        
        System.out.print("-Nhập số lượng: ");
        soLuongTrongKho = nhap.nextInt();

        System.out.print("-Nhập giá bán: ");
        giaNhap = nhap.nextDouble();
        nhap.nextLine();

        System.out.print("-Nhập ngày nhập hàng: ");
        ngayNhapKho = date.parse(nhap.nextLine());
    } 
    
}