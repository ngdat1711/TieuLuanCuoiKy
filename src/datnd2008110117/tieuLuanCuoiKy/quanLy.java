package datnd2008110117.tieuLuanCuoiKy;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class quanLy {
    node head;
    node tail;
    Scanner nhap = new Scanner(System.in);

    //hàm kiểm tra
    int kiemTra(int ma){
        node current = head;
        while(current != null){
            if(current.maHang == ma)
                return 0;
            current = current.next;
        }
        return 1;
    }

    //hàm thêm
    void them(String L, String T, int MH, int SLTK, double GN, String NN) {
        node newSP = new node(L, T, MH, SLTK, GN, NN);
        if (head == null) {
            head = newSP;
            tail = newSP;
        } 
        else {
            tail.next = newSP;
            tail = newSP;
        }
    }

    //thêm vào đầu 
    void themDau() throws ParseException {
        System.out.println("- Thêm hàng hoá vào đầu danh sách:");
        node newSP = new node();
        newSP.nhapThongTinKho();

        do{
            if(kiemTra(newSP.maHang) == 0){
            System.out.println("-Mã hàng đã trùng!");
            System.out.print("-Mời nhập lại mã mới: ");
            newSP.maHang = nhap.nextInt();
            kiemTra(newSP.maHang);
            }
        }
        while(kiemTra(newSP.maHang) == 0);

        newSP.next = head;
        head = newSP;
        System.out.println("---THÀNH CÔNG----");
    }

    //hàm them cuoi
    void themCuoi() throws ParseException {
        System.out.println("- Thêm hàng hoá vào cuối danh sách: ");
        node newSP = new node();
        newSP.nhapThongTinKho();
        do{
            if(kiemTra(newSP.maHang) == 0){
                System.out.println("- Mã hàng đã trùng!");
                System.out.print("- Mời nhập lại mã mới:");
                newSP.maHang = nhap.nextInt();
                kiemTra(newSP.maHang);
            }
        }
        while(kiemTra(newSP.maHang) == 0);
        tail.next = newSP;
        tail = newSP;
        System.out.println("---THÀNH CÔNG---");
    }

    //hàm tìm
    node tim(int Tim) {
        node tam = head;
        if (head.maHang == Tim) {
            System.out.println("Hàng hoá cần tìm: ");
            head.inThongTinKho();
            return head;
        }
        while (tam != null) {
            if (tam.next.maHang == Tim) {
                System.out.println("Hàng hoá cần tìm: ");
                tam.next.inThongTinKho();
                return tam;
            }
            tam = tam.next;
        }
        return null;
    }

    //hàm thêm trước
    void themTruoc() throws ParseException {
        System.out.println("--Thêm vào trước hàng Vừa tìm được--");
        int ma;
        System.out.print("- Nhập mã hàng hoá cần tìm: ");
        ma = nhap.nextInt();
        node tam = tim(ma);
        System.out.println("-Hàng hoá muốn thêm vào kho: ");
        node newSP = new node();
        newSP.nhapThongTinKho();
        do{
            if(kiemTra(newSP.maHang) == 0){
                System.out.println("-Mã hàng đã trùng!");
                System.out.print("-Mời nhập lại mã mới: ");
                newSP.maHang = nhap.nextInt();
                kiemTra(newSP.maHang);
            }
        }
        while(kiemTra(newSP.maHang) == 0);

        if (tam == null) {
            System.out.println("- Hàng này kho có trong kho.");
            return;
        }
        if (head.maHang == ma) {
            themDau();
            System.out.println("---THÀNH CÔNG---");
            return;
        }
        newSP.next = tam.next;
        tam.next = newSP;
        System.out.println("---THÀNH CÔNG----");
    }

    //Xóa đầu
    void xoaDau() {
        head = head.next;
        System.out.println("==== Xoá thành công ====");
    }

    // Xoá cuối
    void xoaCuoi() {
        node tam = head;
        while (tam != null) {
            if (tam.next == tail) {
                tail = tam;
                tail.next = null;
                System.out.println("==== Xoá thành công ====");
            }
            tam = tam.next;
        }
    }

    //Xóa
    void xoa() {
        System.out.println("- Xoá hàng hoá ở vị trí bất kì: ");
        int ma;
        System.out.print("- Nhập mã của hàng hoá cần tìm: ");
            ma = nhap.nextInt();
            node tam = tim(ma);
        if (tam == null) {
            System.out.println("- Không có hàng hoá cần tìm trong kho.");
        } 
        else if (head.maHang == ma) {
            xoaDau();
        } 
        else {
            tam.next = tam.next.next;
            System.out.println("====Xoá thành công=====");
        }
    }

    //hàm sắp xếp tan8ng theo giá
    void tangDanTheoGia() {
        node current = head;
        node index = null;
        String tam1 = null;
        int tam2 = 0;
        double tam3 = 0;
        Date tam4 = null;
        System.out.println("- Hàng hoá tăng dần theo giá: ");
       
        System.out.println("+ Sắp xếp thành công.");
    }

    //hàm sắp xếp giảm dần
    void giamDanTheoGia() {
        node current = head;
        node index = null;
        String tam1 = null;
        int tam2 = 0;
        double tam3 = 0;
        Date tam4 = null;
        System.out.println("- Hàng hoá giảm dần theo giá: ");

        System.out.println("+ Sắp xếp thành công.");
    }

    // thống kê tổng giá trị nhập kho
    void tongGT() {
        double tongGT = 0;
        node current = head;
        while (current != null) {
            tongGT = tongGT + current.giaNhap*current.soLuongTrongKho;
            current = current.next;
        }
        System.out.printf("- Tổng giá trị nhập của kho là: %.1f đồng\n", tongGT);
    }

    // thống kê số lượng từng loại hàng hoá
    void soLuong() {
        System.out.println("- Số lượng hàng hoá mỗi loại:");
        node current = head;
        int soLuong = 0;
        while (current.next != null) {
            while (current.loai == current.next.loai) {
                soLuong = soLuong + current.soLuongTrongKho;
                current = current.next;
                if (current.next.next == null) {
                    System.out.printf("+ Tổng số lượng hàng hoá của %s là: %d\n ", current.loai,(soLuong + current.soLuongTrongKho + current.next.soLuongTonKho));
                    return;
                }
            }
            System.out.printf("+ Tổng số lượng hàng hoá của %s là: %d \n ", current.loai,(soLuong + current.soLuongTrongKho));
            soLuong = 0;
            current = current.next;
        }
    }

    //sửa
    void sua(node hh) throws ParseException{
        System.out.println("- Sửa thông tin:");
        System.out.print("+ Giá nhập mới: ");
        hh.giaNhap = nhap.nextDouble();
        System.out.print("+ Số lượng tồn kho mới: ");
        hh.soLuongTrongKho = nhap.nextInt();
        nhap.nextLine();
        System.out.print("+ Ngày nhập mới: ");
        SimpleDateFormat date = new SimpleDateFormat("DD - MM - YYYY");
        hh.ngayNhapKho = date.parse(nhap.nextLine());
    }

    // sửa thông tin của hàng hoá
    void suaThongTin() throws ParseException {
        System.out.println("========Tìm hàng hoá cần sửa thông tin========");
        int ma;
        System.out.print("- Nhập mã của hàng hoá cần tìm: ");
        ma= nhap.nextInt();
        node hh = tim(ma).next;
        if(head.maHang == ma){
            sua(head);
            System.out.println("====Sửa thành công====");
        }else{
            sua(hh);
            System.out.println("====Sửa thành công====");
        }
    }

    //tìm kiếm theo loại
    void timKiemTheoLoai(){
        System.out.println("- Tìm kiếm hàng hoá theo loại.");
        System.out.print("+ Nhập loại hàng cần tìm: ");
        String L = nhap.nextLine();
        node current = head;
        while(current != null){
            if(current.loai.equalsIgnoreCase(L)){
                current.inThongTinKho();
            }
            current = current.next;
        }
    }

    //tìm kiếm theo ngày
    void timKiemtheoNgay() throws ParseException{
        System.out.println("- Tìm kiếm  theo khoảng ngày.");
        System.out.print("- Nhập khoảng thời gian đầu: ");
        SimpleDateFormat date = new SimpleDateFormat("DD - MM - YYYY");

        Date bd = date.parse(nhap.nextLine());
        System.out.print("- Nhập khoảng thờI gian cuối: ");

        Date kt = date.parse(nhap.nextLine());
        node current = head;
        while(current != null){
            if(current.ngayNhapKho.compareTo(bd) > 0 && current.ngayNhapKho.compareTo(kt) < 0){
                current.inThongTinKho();
            }
            current = current.next;
        }
    }

    // Xuất thông tin kho hàng
    void in() {
        node current = head;
        while (current != null) {
            current.inThongTinKho();
            current = current.next;
        }
    }
}

