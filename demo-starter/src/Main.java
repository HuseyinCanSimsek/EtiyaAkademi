public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Merhaba Etiya");
        String text = "Etiya";
        System.out.println(text);
        int number = 10;
        double ondalikliSayi = 3.4;
        char basHarf = 'a';
        System.out.println(number / 2);
        System.out.println(number == 5);
        if (3.1 >= ondalikliSayi) {
            System.out.println("Sayı buyuktur");
        } else {
            System.out.println("Sayi kucuktur");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
        String[] sg={"Sivas","Kayseri","Nevsehir","Nigde"};
        for(String s:sg)
        {
            System.out.println(s);
        }
        int n1=20;
        int n2=20;
        boolean isEqual=false;
        isEqual= n1==n2 ? true:false;
        System.out.println(isEqual);
        Product p=new Product(" ",0," ",0,0);
        p.setName("Ayakkabı");
        p.setDiscountRate(27);
        p.setUrl("zazaz");
        p.setUnitPrice(300);
        p.setStock(23);

        System.out.println(p.getDiscountRate());
    }
}