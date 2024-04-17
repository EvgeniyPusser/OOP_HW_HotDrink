public class HotDrinkGraded extends HotDrink {
    int temperature;

    public HotDrinkGraded(String name, int price, float volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public HotDrinkGraded(int temperature) {
        this.temperature = temperature;
    }
    public void getProduct(String name, float volume, int temperature){
        System.out.print("Take our hot milk and be happy!");
    }

    @Override
    public String toString() {
        return "HotDrinkGraded{" +
                "temperature=" + temperature + "degrees Fahrenheit" +
                ", name='" + name + '\'' +
                ", price=" + price + "$" +
                ", volume=" + volume +
                '}';
    }
    //    @Override
//    public String toString() {
//        return "Cocktail{" +
//                "temperature=" + temperature +
//                ", id=" + id +
//                ", name='" + name + '\'' +
//                ", price=" + price +
//                ", ingredients=" + ingredients +
//                ", formula=" + formula +
//                '}';
//    }
}


