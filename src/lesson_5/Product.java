//Создать класс с конструктором для описания товара (сохраняются название и цена).
package lesson_5;

public class Product {
    private String name;
    private double price;

    public Product(){
        name = "";
        price = 0;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return "товар - " + name + ", цена - " + price + ";";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Ball", 13.5);
        Product product2 = new Product();
        product2.setName("Egg");
        product2.setPrice(1.0);
        product1.setName("Box");
        System.out.println(product1);
        System.out.println(product2);
    }

}
