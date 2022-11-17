public class Main {
    public static void main(String[] args) {
        int toplam = Main.topla(3, 4);
        System.out.println(toplam);
    }
    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void cikar() {
        System.out.println("Çıkartıldı");
    }

    public static void carp() {
        System.out.println("Çarpıldı");
    }

    public static void bol() {
        System.out.println("Bölündü");
    }

    public static int topla(int a, int b) {
        return a + b;
    }

}