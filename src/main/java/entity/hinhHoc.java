package entity;

public abstract class hinhHoc {
    public static int count;

    public hinhHoc() throws HinhHocException {
        if (count >= Configs.SO_LUONG_HINH_TOI_DA)
    }

    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
}
