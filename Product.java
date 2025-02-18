public class Product {
    String pcode,pname;
    double price;
    public Product(String pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }
    public static void main(String[] args) {
        Product prod1 = new Product("P1", "Biriyani", 100.50);
        Product prod2 = new Product("P2", "Motta Puffs", 75.25);
        Product prod3 = new Product("P3", "Shawarma", 90.00);
        Product lowestPriceProduct = prod1;
        if (prod2.price < lowestPriceProduct.price) {
            lowestPriceProduct = prod2;
        }
        if (prod3.price < lowestPriceProduct.price) {
            lowestPriceProduct = prod3;
        }
        System.out.println("The product with the lowest price is " + lowestPriceProduct.pname +
                           " with a price of " + lowestPriceProduct.price);
    }
}
