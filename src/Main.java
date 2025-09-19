public class Main {
    public static void main(String[] args) {
        PhanSo sp1_245 = new PhanSo(2, 3);
        PhanSo sp2_245 = new PhanSo(3, 4);

        PhanSo spTong245 = sp1_245.cong(sp2_245);

        System.out.println("sp1_245 = " + sp1_245);
        System.out.println("sp2_245 = " + sp2_245);
        System.out.println("Tổng sp1_245 + sp2_245 = " + spTong245);

        System.out.println("Hiệu sp1_245 - sp2_245 = " + sp1_245.tru(sp2_245));
        System.out.println("Tích sp1_245 * sp2_245 = " + sp1_245.nhan(sp2_245));
        System.out.println("Thương sp1_245 / sp2_245 = " + sp1_245.chia(sp2_245));

        System.out.println("sp1_245 tối giản chưa? " + sp1_245.laToiGian());
    }
}