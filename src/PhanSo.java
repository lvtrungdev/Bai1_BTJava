public class PhanSo {
    private int tu245;
    private int mau245;

    // Constructor mặc định
    public PhanSo() {
        this.tu245 = 0;
        this.mau245 = 1;
    }

    // Constructor có tham số
    public PhanSo(int tu245, int mau245) {
        if (mau245 == 0) {
            throw new IllegalArgumentException("Mẫu số không được bằng 0");
        }
        this.tu245 = tu245;
        this.mau245 = mau245;
        rutGon();
    }

    // Getter & Setter
    public int getTu245() {
        return tu245;
    }

    public void setTu245(int tu245) {
        this.tu245 = tu245;
    }

    public int getMau245() {
        return mau245;
    }

    public void setMau245(int mau245) {
        if (mau245 == 0) throw new IllegalArgumentException("Mẫu số không được bằng 0");
        this.mau245 = mau245;
    }

    // Hàm tìm ước số chung lớn nhất
    private int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }

    // Kiểm tra phân số tối giản
    public boolean laToiGian() {
        return gcd(tu245, mau245) == 1;
    }

    // Rút gọn phân số
    public void rutGon() {
        int ucln = gcd(tu245, mau245);
        tu245 /= ucln;
        mau245 /= ucln;
        if (mau245 < 0) {
            tu245 = -tu245;
            mau245 = -mau245;
        }
    }

    // Cộng phân số
    public PhanSo cong(PhanSo p245) {
        int tuMoi = this.tu245 * p245.mau245 + p245.tu245 * this.mau245;
        int mauMoi = this.mau245 * p245.mau245;
        return new PhanSo(tuMoi, mauMoi);
    }

    // Trừ phân số
    public PhanSo tru(PhanSo p245) {
        int tuMoi = this.tu245 * p245.mau245 - p245.tu245 * this.mau245;
        int mauMoi = this.mau245 * p245.mau245;
        return new PhanSo(tuMoi, mauMoi);
    }

    // Nhân phân số
    public PhanSo nhan(PhanSo p245) {
        int tuMoi = this.tu245 * p245.tu245;
        int mauMoi = this.mau245 * p245.mau245;
        return new PhanSo(tuMoi, mauMoi);
    }

    // Chia phân số
    public PhanSo chia(PhanSo p245) {
        if (p245.tu245 == 0) throw new ArithmeticException("Không thể chia cho phân số bằng 0");
        int tuMoi = this.tu245 * p245.mau245;
        int mauMoi = this.mau245 * p245.tu245;
        return new PhanSo(tuMoi, mauMoi);
    }

    // In phân số
    @Override
    public String toString() {
        if (mau245 == 1) return tu245 + "";
        return tu245 + "/" + mau245;
    }
}
