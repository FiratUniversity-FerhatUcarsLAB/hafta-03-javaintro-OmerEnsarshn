class Main {
    public static void main(String[] args) {
        int n = 5;
        int faktoriyel = 1;

        System.out.print(n + "! = ");
        for (int i = n; i >= 1; i--) {
            faktoriyel *= i;
            System.out.print(i);
            if (i > 1) System.out.print(" x ");
        }
        System.out.println(" = " + faktoriyel);
    }
}
