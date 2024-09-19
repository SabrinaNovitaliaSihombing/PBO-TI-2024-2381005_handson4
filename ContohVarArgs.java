public class ContohVarArgs {
    public static int jumlahKan(int ...KumpulanAngka) {
        int total = 0;
        for (int nilai : KumpulanAngka) {
            total += nilai;
        }
        return total;

    }

    public static void main(String[] args) {
        int hasil1 = jumlahKan (1, 100);
        System.out.println("Hasil : ");
    }
}
