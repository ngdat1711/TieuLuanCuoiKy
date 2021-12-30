package datnd2008110117.tieuLuanCuoiKy;

import java.text.ParseException;
import java.util.Scanner;

public class quanLyTestDrive {
    public static void main(String[] args) throws ParseException {
        quanLy quanLyHangHoa = new quanLy();
        Scanner nhap = new Scanner(System.in);

        int chon;
        quanLyHangHoa.them("Thực Phẩm Thức Ăn", 1, "Bánh mặn", 15000, 10000, "08-01-2019");
        quanLyHangHoa.them("Thực Phẩm Thức Ăn", 3, "Kẹo mút", 1000, 15000, "15-01-2019");
        quanLyHangHoa.them("Thực Phẩm Thức Ăn", 4, "Bánh tráng", 5000, 20000, "21-01-2019");
        quanLyHangHoa.them("Thực Phẩm Thức Ăn", 7, "Bánh su kem ", 20000, 11000, "12-11-2019");
        quanLyHangHoa.them("Thực Phẩm Thức Ăn", 9, "Bánh gạo One One", 25000, 6000, "13-11-2019");
        quanLyHangHoa.them("Thực Phẩm Thức Ăn", 10, "Hảo hảo chua cay", 3000, 30000, "23-12-2020");
        quanLyHangHoa.them("Thực Phẩm Thức Ăn", 12, "Omachi", 5000, 60000, "25-01-2020");
        quanLyHangHoa.them("Thực Phẩm Thức Ăn", 13, "Kẹo dẻo", 1500, 4500, "05-03-2020");
        quanLyHangHoa.them("Thực Phẩm Thức Ăn", 19, "Xúc Xích", 2000, 10000, "01-01-2020");
        quanLyHangHoa.them("Thực Phẩm Thức Ăn", 20, "Đùi gà", 25000, 6500, "14-11-2020");   
        quanLyHangHoa.them("Đồ sứ", 2, "Tô", 30000, 17000, "22-01-2020");
        quanLyHangHoa.them("Đồ sứ", 6, "Đĩa", 45000, 1800, "30-03-2020");
        quanLyHangHoa.them("Đồ sứ", 11, "Bình cắm hoa", 75000, 5600, "23-04-2020");
        quanLyHangHoa.them("Đồ sứ", 14, "Chén", 5000, 12000, "26-06-2020");
        quanLyHangHoa.them("Đồ sứ", 16, "Chén nhỏ", 3000, 13000, "21-09-2020");
        quanLyHangHoa.them("Đồ Điện Gia Dụng", 5, "Máy giặt", 7000000, 150, "02-03-2019");
        quanLyHangHoa.them("Đồ Điện Gia Dụng", 8, "Quạt", 250000, 700, "01-01-2020");
        quanLyHangHoa.them("Đồ Điện Gia Dụng", 15, "Tủ lạnh", 8020000, 250, "05-05-2020");
        quanLyHangHoa.them("Đồ Điện Gia Dụng", 17, "Máy lạnh", 4700000, 2600, "25-01-2021");
        quanLyHangHoa.them("Đồ Điện Gia Dụng", 18, "Máy lọc nước", 2500000, 170, "27-02-2021");
    }

    do{
        System.out.println("===================MENU===================");
        System.out.println("1: Thêm hàng hoá mới vào đầu danh sách kho.");
        System.out.println("2: Thêm hàng hoá mới vào cuối danh sách kho.");
        System.out.println("3: Thêm hàng hoá mới vào trước một hàng hoá tìm được.");
        System.out.println("4: Xoá hàng hoá ở đầu danh sách.");
        System.out.println("5: Xoá hàng hoá ở cuối danh sách.");
        System.out.println("6: Xoá hàng hoá ở một vị trí bất kì.");
        System.out.println("7: Sửa thông tin của hàng hoá trong kho.");
        System.out.println("8: Tìm kiếm hàng hoá theo loại.");
        System.out.println("9: Tìm kiếm hàng hoá theo khoảng giá.");
        System.out.println("10: Tìm kiếm hàng hoá theo khoang thời gian nhập hàng.");
        System.out.println("11: Sắp xếp hàng hoá tăng dần theo giá.");
        System.out.println("12: Sắp xếp hàng hoá giảm dần theo giá.");
        System.out.println("13: Sắp xếp hàng hoá tăng dần theo ngày.");
        System.out.println("14: Sắp xếp hàng hoá giảm dần theo ngày.");
        System.out.println("15: Sắp xếp hàng hoá theo loại.");
        System.out.println("16: Sắp xếp hàng hoá theo loại và tăng dần theo ngày nhập.");
        System.out.println("17: Sắp xếp hàng hoá theo loại và giảm dần theo ngày nhập.");
        System.out.println("18: Sắp xếp hàng hoá theo loại và tăng dần theo giá.");
        System.out.println("19: Sắp xếp hàng hoá theo loại và giảm dần theo giá.");
        System.out.println("20: Thống kê tổng số lượng hàng hoá trong kho.");
        System.out.println("21: Thống kê tổng giá trị của hàng hoá trong kho.");
        System.out.println("22: Thống kê số lượng hàng hoá của từng loại hàng.");
        System.out.println("23: In danh sách hàng hoá trong kho.");
        System.out.println("24: Kết thúc!!!");
        System.out.println("==========================================");
        System.out.print("- Nhập vào sự lựa chọn(1 -> 24): ");
        chon = nhap.nextInt();
}
switch(chon){
    case 1:
        quanLyHangHoa.themDau();
        break;
    case 2:
        quanLyHangHoa.themCuoi();
        break;
    case 3: 
        quanLyHangHoa.themTruoc();
        break;
    case 4:
        quanLyHangHoa.xoaDau();
        break;
    case 5:
        quanLyHangHoa.xoaCuoi();
        break;
    case 6:
        quanLyHangHoa.xoa();
        break;
    case 7:
        quanLyHangHoa.suaThongTin();
        break;
    case 8:
        quanLyHangHoa.timKiemTheoLoai();
        break;
    case 9:
        quanLyHangHoa.timKiemTheoGia();
        break;
    case 10:
        quanLyHangHoa.timKiemtheoNgay();
        break;
    case 11:
        quanLyHangHoa.tangDanTheoGia();
        break;
    case 12:
        quanLyHangHoa.giamDanTheoGia();
        break;
    case 13:
        quanLyHangHoaa.tangTheoNgay();
        break;
    case 14:
        quanLyHangHoa.giamTheoNgay();
        break;
    case 15:
        System.out.println("- Sắp xếp hàng hoá theo loại hàng: ");
        quanLyHangHoa.xepTheoLoai();
        System.out.println("+ Sắp xếp thành công.");
        break;
    case 16:
        quanLyHangHoa.loaiVaNgayTang();
        break;
    case 17:
        quanLyHangHoa.loaiVaNgayGiam();
        break;
    case 18:
        quanLyHangHoa.loaiVaGiaTang();
        break;
    case 19: 
        quanLyHangHoa.loaiVaGiaGiam();
        break;
    case 20:
        quanLyHangHoa.tongSL();
        break;
    case 21:
        quanLyHangHoa.tongGT();
        break;
    case 22:
        quanLyHangHoa.soLuong();
        break;
    case 23:
        quanLyHangHoa.in();
        break;
    case 24:
        System.out.println("- KẾT THÚC!!!");
        return;
    default:
        System.out.println("Lựa chọn không hợp lệ vui lòng nhập lại!");
}
    System.out.print("- Quay lại MENU chính (0:NO/1:YES): ");
    chon = nhap.nextInt(); 
    }
    while(chon == 1);
    nhap.close();
}
}
        
