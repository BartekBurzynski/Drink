public class BestDrink {
    public static void main(String[] args) {


        Drink drink1 = new Drink();

        drink1.name = "BestDrink";
        drink1.prize = 12.5;
        drink1.alcohol = true;

        Drink ingredient1 = new Drink();
        ingredient1.ingredients = "vodka";

        Drink ingredient2 = new Drink();
        ingredient2.ingredients = "moreVodka";

        Drink ingredient3 = new Drink();
        ingredient3.ingredients = "water";

        System.out.println(drink1.name);
        System.out.println(drink1.prize);
        System.out.println(drink1.alcohol);
        System.out.println(ingredient1.ingredients);
        System.out.println(ingredient2.ingredients);
        System.out.println(ingredient3.ingredients);


    }
}
