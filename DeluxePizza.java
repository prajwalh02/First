public class DeluxePizza extends Pizza
{
    public DeluxePizza(Boolean isVeg)
    {
        super(isVeg);

        //bcoz for deluxe pizza by default eatra cheese and topings is added
        this.addExtraCheese();
        this.addExtraToppings();
    }

}
