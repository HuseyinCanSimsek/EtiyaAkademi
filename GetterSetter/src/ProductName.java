public class ProductName {


    public class ProductManager {
        public void Add(Product product){
            System.out.println("Ürün eklendi" +" "+ product.getName());

        }
        //Önerilmeyen kullanım
        public void Add2(int id,String name,String description,int stockAmount,double price)
        {
            Product u=new Product();
            u.setId(id);
            u.setName(name);
            u.setDescription(description);
            u.setStockAmount(20);
            u.setPrice(20);
        }
    }

}
