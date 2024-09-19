public class ContohOverloading {
    public static double hitungLuas(double sisi) {
        return sisi * sisi;
    }

    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungLuas(double jariJari, boolean isLingkaran) {
        if (isLingkaran) {
            return Math.PI * jariJari * jariJari;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}
