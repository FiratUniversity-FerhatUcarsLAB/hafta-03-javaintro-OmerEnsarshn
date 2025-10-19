class Main {
    public static void main(String[] args) {
        String[] urunler = {"Elma", "Ekmek", "Sut"};
        int[] miktar = {3, 2, 1};
        double[] fiyat = {2.5, 1.75, 4.0};

        System.out.println("+----------------------------+");
        System.out.println("| Urun      Miktar   Fiyat   |");
        System.out.println("+----------------------------+");

        for (int i = 0; i < urunler.length; i++) {
            System.out.printf("| %-8s %6d %8.2f |\n", urunler[i], miktar[i], fiyat[i]);
        }

        System.out.println("+----------------------------+");
    }
}
