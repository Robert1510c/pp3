public class ProductTest {
    public static void main(String[] args){
        Product p = new Product("p1", false);
        p.setName("Chicken");
        p.setVegetarian(false);

        System.out.println(p.toString());
    }
    
}
