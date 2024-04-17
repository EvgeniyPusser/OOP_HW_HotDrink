import java.util.HashMap;
import java.util.List;

public class HotDrink {
    String name;
    int price;
    //List<String> ingredients;
    //HashMap<String, Double> formula;
    float volume;

    public HotDrink(String name, int price, float volume) {
        this.volume = volume;
        this.name = name;
        this.price = price;
        //this.ingredients = ingredients;
        //this.formula = formula;
    }

    public HotDrink() {

    }

    public float getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
public void getProduct(String name, float volume){
    System.out.print("You may take it!");
}

    public void getProduct() {
        System.out.print("Take it!!");
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", price=" + price + "$" +
                ", volume=" + volume +
                '}';
    }
    //public List<String> getIngredients() {
        //return ingredients;
    }

    //public HashMap<String, Double> getFormula() {
        //return formula;
    //}

//    @Override
//    public String toString() {
//        return "HotDrink{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", price=" + price +
//                ", ingredients=" + ingredients +
//                ", formula=" + formula +
//                '}';


