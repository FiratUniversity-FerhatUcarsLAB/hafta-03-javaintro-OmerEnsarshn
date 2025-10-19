class Main {
    public static void main(String[] args) {
       System.out.println("+-----+-----+-----+");
        System.out.println("|  a  | a^2 | a^3 |");
        System.out.println("+-----+-----+-----+");

        for (int a = 1; a <= 5; a++) {
            int a2 = a * a;
            int a3 = a * a * a;
            System.out.printf("| %3d | %3d | %3d |\n", a, a2, a3);
        }

        System.out.println("+-----+-----+-----+");
    }
}
