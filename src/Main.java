import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HotDrink gluewine = new HotDrink("George The Thirteen", 5, 1 / 2f);
        HotDrink puerTeaCup = new HotDrink("Chinese Puer Tea", 48, 1f);
        HotDrink gasWater = new HotDrink("Bagjomy", 2, 0.8f);
        HotDrinkAutomat espresso = new HotDrinkAutomat("Espresso",
                3,0.4f, 158);
        HotDrinkAutomat cappuccino = new HotDrinkAutomat("Memory", 3, 0.5f, 175);
        gluewine.getProduct();
        System.out.print("================\n");
        puerTeaCup.getProduct();
        System.out.print("================\n");
        System.out.print(gluewine.toString() + "\n" + puerTeaCup.toString());
        System.out.print("===========================\n");

        System.out.print(espresso.toString() + "\n");
        espresso.adProduct();
        System.out.print(cappuccino.toString() + "\n");
        cappuccino.adProduct();




    }
}