public class Main {
    public static void main(String[] args) {
        FourOperations fo = new FourOperations();
        float divideResult = fo.divide(3, 2);
        System.out.println(divideResult);
        //Field ve Attribute ile Çalışmak
        Product product=new Product();
        product.setName("Araba");
        System.out.println(product.getName());
        product.setId(1);
        product.setDescription("Binilen taşıt");
        product.setPrice(3000);
        product.setStockAmount(20);
        System.out.println(product.getStockAmount());
        ProductManager pm=new ProductManager();
        pm.Add(product);
    }
}