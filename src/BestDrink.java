public class BestDrink {
    public static void main(String[] args) {


        Drink drink1 = new Drink();

        drink1.name = "BestDrink";
        drink1.prize = 12.5;
        drink1.alcohol = true;


        drink1.ingredient1 = new Ingredient();


        drink1.ingredient1.name = "vodka";
        drink1.ingredient1.quant = 50;


        drink1.ingredient2 = new Ingredient();


        drink1.ingredient2.name = "water";
        drink1.ingredient2.quant = 20;


        drink1.ingredient3 = new Ingredient();


        drink1.ingredient3.name = "asd";
        drink1.ingredient3.quant = 30;



        System.out.println(drink1.name);
        System.out.println(drink1.prize);
        System.out.println(drink1.alcohol);
        System.out.println(drink1.ingredient1.name);
        System.out.println(drink1.ingredient1.quant);
        System.out.println(drink1.ingredient2.name);
        System.out.println(drink1.ingredient2.quant);
        System.out.println(drink1.ingredient3.name);
        System.out.println(drink1.ingredient3.quant);

        System.out.println( drink1.ingredient1.quant + drink1.ingredient2.quant + drink1.ingredient3.quant);



    }
}
