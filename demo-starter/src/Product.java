public class Product {
   private String name;
   private double unitPrice;
   private String url;
   private double discountRate;
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    Product(String name, double unitPrice, String url, double discountRate, int stock)
    {
        this.name=name;
        this.unitPrice=unitPrice;
        this.url=url;
        this.discountRate=discountRate;
        this.stock=stock;
    }

}
