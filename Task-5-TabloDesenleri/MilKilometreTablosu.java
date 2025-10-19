class Main {
    public static void main(String[] args) {
       int[] mil = {1, 5, 10, 20, 50};
        double faktor = 1.609;

        System.out.println("+-----+-----------+");
        System.out.println("| Mil | Kilometre|");
        System.out.println("+-----+-----------+");

        for (int i = 0; i < mil.length; i++) {
            double km = mil[i] * faktor;
            System.out.printf("| %3d | %9.3f |\n", mil[i], km);
        }

        System.out.println("+-----+-----------+");
    }
}
