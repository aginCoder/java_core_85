package entity;

public class HinhTron extends hinhHoc{
    private double radius;

    public HinhTron(double radius) {
        this.radius = radius;
    }


    @Override
    public double tinhChuVi() {
        return 0;
    }

    @Override
    public double tinhDienTich() {
        return 0;
    }
}
