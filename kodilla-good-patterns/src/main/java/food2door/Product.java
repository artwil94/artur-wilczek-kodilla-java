package food2door;

public class Product {

    String name;
    String type;
    String quantityUnits;


    public Product(String name, String type, String quantityUnits) {
        this.name = name;
        this.type = type;
        this.quantityUnits = quantityUnits;

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getQuantityUnits() {
        return quantityUnits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (type != null ? !type.equals(product.type) : product.type != null) return false;
        return quantityUnits != null ? quantityUnits.equals(product.quantityUnits) : product.quantityUnits == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (quantityUnits != null ? quantityUnits.hashCode() : 0);
        return result;
    }
}
