public class Product {
    String name;
    boolean isVegetarian;
    public Product(String name, boolean isVegetarian) {
        this.name = name;
        this.isVegetarian = isVegetarian;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isVegetarian() {
        return isVegetarian;
    }
    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", isVegetarian=" + isVegetarian + "]";
    }
    
    
}
