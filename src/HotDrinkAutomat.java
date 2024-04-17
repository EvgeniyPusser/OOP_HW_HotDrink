public class HotDrinkAutomat extends HotDrinkGraded implements TradeAutomat {
    public HotDrinkAutomat(String name, int price, float volume, int temperature) {
        super(name, price, volume, temperature);
        this.price = (int) calcPrice();
    }

    public HotDrinkAutomat(int temperature) {
        super(temperature);
    }

    @Override
    public void adProduct() {
        System.out.print("Our hot and tasty drinks are the best!!");
    }

    @Override
    public double calcPrice() {
        return price * 0.9;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
