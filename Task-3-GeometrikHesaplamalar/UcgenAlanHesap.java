class Main {
    public static void main(String[] args) {
        double a = 3, b = 4, c = 5;
        double s = (a + b + c) / 2; // yarı çevre
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Ucgen Alani: " + alan);
        System.out.println("Ucgen Çevresi: " + (a + b + c));
    }
};
