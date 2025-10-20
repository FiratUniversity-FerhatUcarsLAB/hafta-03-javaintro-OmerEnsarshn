class Main {
    public static String secondsToHMS(int totalSeconds) {
        if (totalSeconds < 0) totalSeconds = 0; // negatif geldiğinde güvenlik
        int hours = totalSeconds / 3600;
        int remaining = totalSeconds % 3600;
        int minutes = remaining / 60;
        int seconds = remaining % 60;
        // Saat tek haneli kalabilir, dakika ve saniye 2 basamaklı olsun
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        // Test örnekleri
        int[] tests = {3665, 59, 3600, 0, 86399}; // 86399 = 23:59:59
        for (int t : tests) {
            System.out.println(t + " saniye = " + secondsToHMS(t));
        }

        // Eğer kullanıcıdan almak istersen (opsiyonel):
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Saniye gir: ");
        // int s = sc.nextInt();
        // System.out.println(secondsToHMS(s));
        // sc.close();
    }
}
