public class Main {
    public static void main(String[] args) throws Exception
    {
        //for Deluxe pizza
        DeluxePizza dp = new DeluxePizza(false);
        System.out.println(dp.getPrice());
        dp.addExtraCheese();
        dp.addTakeaway();
        System.out.println(dp.getBill());
        

        // //for regular pizza
        // Pizza p = new Pizza(true);
        // System.out.println(p.getPrice());

        // p.addExtraCheese();
        // p.addExtraToppings();
        // p.addTakeaway();

        // System.out.println(p.getBill());

       
    }
}
