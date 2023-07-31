package JAVA_PROJECT;

    
import java.util.List;

public class HotDrinkVendingMashine implements Vendingmashin {

    private final List<HotDrinks> products;

    public HotDrinkVendingMashine(List<HotDrinks> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotDrinks getProduct(String name, int volume, int temperature) {
        for (HotDrinks product: products){
            if(product != null) {
                if(product.getName().equalsIgnoreCase(name) && ((HotDrinks) product).getVolume() == volume && ((HotDrinks) product).getTemperature() == temperature) {
                    return (HotDrinks) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}

